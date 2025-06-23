package com.java.admin.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.java.admin.model.User;
import com.java.admin.model.UserStatus;
import com.java.admin.service.AdminService;

public class Controller {

    private User user = new User();
    private String otp; // <-- OTP input from user
    private AdminService service = new AdminService(); // Use service instead of DAO
    private boolean otpSent = false;
    
    
    public boolean isOtpSent() {
		return otpSent;
	}

	public void setOtpSent(boolean otpSent) {
		this.otpSent = otpSent;
	}

	public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

 // Step 1: Send OTP to user's email
    public String sendOtpToEmail() {
        // Basic check before sending
        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_WARN, "Please enter your email.", null));
            return null;
        }

        boolean otpSuccess = service.sendEmailOtp(user.getEmail());

        if (otpSuccess) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "OTP has been sent to your email.",null));
            otpSent = true;
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Failed to send OTP. Please try again later.", null));
        }
        return null;
    }
    

 // Step 2: Verify OTP and register user
    public String verifyOtpAndSignUp() {
        user.setStatus(UserStatus.INACTIVE); // Set default status

        boolean registered = service.registerUser(user, otp);

        if (registered) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Registration successful.",null));

            // Reset after success
            otp = null;
            otpSent = false;
            user = new User();
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Registration failed. Please check all inputs including OTP, and ensure the email or username are not already used.", null));
        }

        return null;
    }
}
