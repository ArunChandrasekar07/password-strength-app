package com.example;

public class PasswordChecker {

    public String checkStrength(String password) {

        if (password.length() < 6) {
            return "WEAK";
        }

        if (password.matches(".*[A-Z].*") &&
            password.matches(".*[0-9].*") &&
            password.matches(".*[!@#$%^&*].*")) {

            return "STRONG";
        }

        return "MEDIUM";
    }
}
