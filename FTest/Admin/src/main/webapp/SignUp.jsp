<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<f:view>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Signup with OTP</title>

    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
        }

        h:form {
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            background-color: #fff;
            width: 500px;
            padding: 25px 30px;
            margin: 50px auto;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        }

        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .form-container .field-label {
            font-weight: bold;
            margin-bottom: 5px;
            color: #333;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 8px 10px;
            margin: 5px 0 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .btn {
            background-color: #007bff;
            color: white;
            padding: 10px 18px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 10px;
        }

        .btn:hover {
            background-color: #0056b3;
        }

        .error-message {
            color: red;
            font-size: 0.85em;
        }

        .global-message {
            margin-top: 20px;
            color: green;
            font-weight: bold;
            text-align: center;
        }

        .otp-panel {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h:form styleClass="form-container" prependId="false">
        <h2>User Signup with OTP</h2>

        <!-- Registration Form Fields -->
        <h:panelGrid columns="2" cellpadding="5">
            <h:outputLabel value="First Name:" styleClass="field-label" />
            <h:inputText id="firstName" value="#{adminController.user.firstName}" disabled="#{adminController.otpSent}" />
            <h:outputText />
            <h:message for="firstName" styleClass="error-message" />

            <h:outputLabel value="Last Name:" styleClass="field-label" />
            <h:inputText id="lastName" value="#{adminController.user.lastName}" disabled="#{adminController.otpSent}" />
            <h:outputText />
            <h:message for="lastName" styleClass="error-message" />

            <h:outputLabel value="Username:" styleClass="field-label" />
            <h:inputText id="username" value="#{adminController.user.username}" disabled="#{adminController.otpSent}" />
            <h:outputText />
            <h:message for="username" styleClass="error-message" />

            <h:outputLabel value="Password:" styleClass="field-label" />
            <h:inputSecret id="password" value="#{adminController.user.passcode}" disabled="#{adminController.otpSent}" />
            <h:outputText />
            <h:message for="password" styleClass="error-message" />

            <h:outputLabel value="Email:" styleClass="field-label" />
            <h:inputText id="email" value="#{adminController.user.email}" disabled="#{adminController.otpSent}" />
            <h:outputText />
            <h:message for="email" styleClass="error-message" />
        </h:panelGrid>

        <!-- Send OTP Button -->
        <h:commandButton value="Send OTP"
                         styleClass="btn"
                         action="#{adminController.sendOtpToEmail}"
                         rendered="#{!adminController.otpSent}" />

        <!-- OTP Entry & Registration -->
        <h:panelGrid columns="2" cellpadding="5" styleClass="otp-panel" rendered="#{adminController.otpSent}">
            <h:outputLabel value="Enter OTP:" styleClass="field-label" />
            <h:inputText id="otp" value="#{adminController.otp}" />
            <h:outputText />
            <h:message for="otp" styleClass="error-message" />

            <h:commandButton value="Verify & Register" styleClass="btn" action="#{adminController.verifyOtpAndSignUp}" />
        </h:panelGrid>

        <!-- Show global messages -->
        <h:messages globalOnly="true" layout="table" styleClass="global-message" />

    </h:form>
</body>
</html>
</f:view>
