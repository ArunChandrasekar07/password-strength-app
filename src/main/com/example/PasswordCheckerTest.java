package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordCheckerTest {

    @Test
    public void weakPasswordTest() {
        PasswordChecker pc = new PasswordChecker();
        assertEquals("WEAK", pc.checkStrength("abc"));
    }

    @Test
    public void strongPasswordTest() {
        PasswordChecker pc = new PasswordChecker();
        assertEquals("STRONG", pc.checkStrength("Abc@123"));
    }
}
