package dev.angelcruzl.junitapp.examples.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void testClientAccount() {
    Account account = new Account();
    account.setClient("Ángel");

    String expected = "Ángel";
    String actual = account.getClient();

    assertEquals(expected, actual);
  }
}