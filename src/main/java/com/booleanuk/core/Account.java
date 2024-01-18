package com.booleanuk.core;

public class Account {
    private String userEmail;
    private String userPassword;
    private Boolean accountStatus;

    public Account() {
        this.userEmail = "";
        this.userPassword = "";
        this.accountStatus = false;
    }

    public String setUserEmail(String userEmail) {
        if (isValidEmail(userEmail)) {
            this.userEmail = userEmail;
            return "Valid email";
        }
        return "Invalid email";
    }

    public String setUserPassword(String userPassword) {
        if (isValidPassword(userPassword)) {
            this.userPassword = userPassword;
            return "Valid password";
        }
        return "Invalid password";
    }

    public void enableAccount() {
        if (isValidEmail(this.userEmail) && isValidPassword(this.userPassword)) {
            this.accountStatus = true;
        }
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    public Boolean getAccountStatus() {
        return this.accountStatus;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public String getUserPassword() {
        return this.userPassword;
    }
}
