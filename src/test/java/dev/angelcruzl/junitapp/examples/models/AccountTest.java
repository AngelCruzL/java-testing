package dev.angelcruzl.junitapp.examples.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void testAccountClientName() {
    Account account = new Account("Ángel", new BigDecimal("1234567.89098"));
    // account.setClient("Ángel");

    String expected = "Ángel";
    String actual = account.getClient();

    assertEquals(expected, actual);
  }

  @Test
  void testAccountBalance() {
    BigDecimal balance = new BigDecimal("1234567.89098");

    Account account = new Account("Ángel", balance);

    assertEquals(balance, account.getBalance());
    assertFalse(account.getBalance().compareTo(BigDecimal.ZERO) < 0);
    assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);
  }
}