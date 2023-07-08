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

  @Test
  void testAccountReference() {
    Account account = new Account("Ángel", new BigDecimal("1234567.89098"));
    Account account2 = new Account("Ángel", new BigDecimal("1234567.89098"));

    assertEquals(account, account2);
  }

  @Test
  void testAccountDebit() {
    Account account = new Account("Ángel", new BigDecimal("1234567.89098"));
    account.debit(new BigDecimal("100.00"));

    assertNotNull(account.getBalance());
    assertEquals(new BigDecimal("1234467.89098"), account.getBalance());
    assertEquals("1234467.89098", account.getBalance().toPlainString());
  }

  @Test
  void testAccountCredit() {
    Account account = new Account("Ángel", new BigDecimal("1234567.89098"));
    account.credit(new BigDecimal("100.00"));

    assertNotNull(account.getBalance());
    assertEquals(new BigDecimal("1234667.89098"), account.getBalance());
    assertEquals("1234667.89098", account.getBalance().toPlainString());
  }
}