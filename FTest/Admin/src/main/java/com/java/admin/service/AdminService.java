package com.java.admin.service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;

import com.java.admin.dao.AdminDaoImpl;
import com.java.admin.model.EmailVerificationOtp;
import com.java.admin.model.OtpStatus;
import com.java.admin.model.User;
import com.java.admin.util.MailSend;

public class AdminService {

    private AdminDaoImpl dao = new AdminDaoImpl();

    public boolean sendEmailOtp(String email) {
        // Generate 6-digit OTP
        String otpCode = String.format("%06d", new Random().nextInt(999999));

        // Set expiry time 10 minutes from now
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 10);
        Timestamp expiry = new Timestamp(calendar.getTimeInMillis());
        Timestamp now = new Timestamp(System.currentTimeMillis());

        EmailVerificationOtp otp = new EmailVerificationOtp();
        otp.setEmail(email);
        otp.setOtpCode(otpCode);
        otp.setCreatedAt(now);
        otp.setExpiresAt(expiry);
        otp.setStatus(OtpStatus.ACTIVE);

        // Send email OTP
        String message = "Your OTP for email verification is: " + otpCode;
        try {
            MailSend.sendInfo(email, "Email Verification OTP", message);
        } catch (Exception e) {
            e.printStackTrace();
            return false; // If email fails, abort saving OTP
        }

        return dao.saveEmailOtp(otp);
    }

    

    public boolean registerUser(User user, String otp) {
        // 1. Null or empty checks
        if (user == null || otp == null || otp.trim().isEmpty()) {
            System.out.println("User or OTP cannot be null or empty.");
            return false;
        }

        // 2. First Name: Not empty, no leading spaces, only letters
        String firstName = user.getFirstName();
        if (firstName == null || firstName.trim().isEmpty()) {
            System.out.println("First name is required.");
            return false;
        }
        if (firstName.startsWith(" ")) {
            System.out.println("First name cannot start with a space.");
            return false;
        }
        if (!firstName.matches("^[A-Za-z]+$")) {
            System.out.println("First name must contain only alphabetic characters.");
            return false;
        }

        // 3. Last Name: Not empty, no leading spaces, only letters
        String lastName = user.getLastName();
        if (lastName == null || lastName.trim().isEmpty()) {
            System.out.println("Last name is required.");
            return false;
        }
        if (lastName.startsWith(" ")) {
            System.out.println("Last name cannot start with a space.");
            return false;
        }
        if (!lastName.matches("^[A-Za-z]+$")) {
            System.out.println("Last name must contain only alphabetic characters.");
            return false;
        }

        // 4. Username: Not empty, no leading space, starts with letter, 4-20 chars, alphanum and underscores allowed
        String username = user.getUsername();
        if (username == null || username.trim().isEmpty()) {
            System.out.println("Username is required.");
            return false;
        }
        if (username.startsWith(" ")) {
            System.out.println("Username cannot start with a space.");
            return false;
        }
        if (!username.matches("^[A-Za-z][A-Za-z0-9_]{3,19}$")) {
            System.out.println("Username must start with a letter and be 4-20 characters long. Only letters, numbers, and underscores are allowed.");
            return false;
        }

        // 5. Password: Not empty, strength check (at least 6 chars, one letter, one number)
        String password = user.getPasscode();
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Password is required.");
            return false;
        }
        if (password.startsWith(" ")) {
            System.out.println("Password cannot start with a space.");
            return false;
        }
        if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d).{6,}$")) {
            System.out.println("Password must be at least 6 characters long and include both letters and numbers.");
            return false;
        }

        // 6. Email: Not empty, proper format, no leading space
        String email = user.getEmail();
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Email is required.");
            return false;
        }
        if (email.startsWith(" ")) {
            System.out.println("Email cannot start with a space.");
            return false;
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println("Invalid email format.");
            return false;
        }

        // 7. OTP format: Must be 6-digit numeric string
        if (!otp.matches("^\\d{6}$")) {
            System.out.println("OTP must be a 6-digit number.");
            return false;
        }

        // ✅ All field validations passed — delegate to DAO
        return dao.signUp(user, otp);
    }

}
