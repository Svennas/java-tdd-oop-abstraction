package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testCreateValidUserAccount() {
        Account acc = new Account();

        Assertions.assertEquals("Valid email", acc.setUserEmail("gustav@gmail.com"));
        Assertions.assertEquals("gustav@gmail.com", acc.getUserEmail());
        Assertions.assertEquals("Valid password", acc.setUserPassword("svennassvennas"));
        Assertions.assertEquals("svennassvennas", acc.getUserPassword());
    }

    @Test
    public void testCreateInvalidUserAccount() {
        Account acc = new Account();

        Assertions.assertEquals("Invalid email", acc.setUserEmail("gustavgmail.com"));
        Assertions.assertEquals("", acc.getUserEmail());
        Assertions.assertEquals("Invalid password", acc.setUserPassword("svennas"));
        Assertions.assertEquals("", acc.getUserPassword());
    }

    @Test
    public void testStatusNewAccount() {
        Account acc = new Account();

        Assertions.assertFalse(acc.getAccountStatus());
    }

    @Test
    public void testChangeAccountStatus() {
        Account acc = new Account();

        acc.enableAccount();
        Assertions.assertFalse(acc.getAccountStatus());

        acc.setUserEmail("gustav@gmail.com");
        acc.setUserPassword("svennassvennas");
        acc.enableAccount();
        Assertions.assertTrue(acc.getAccountStatus());
    }
}
