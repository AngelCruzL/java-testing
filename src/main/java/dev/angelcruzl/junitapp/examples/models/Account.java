package dev.angelcruzl.junitapp.examples.models;

import java.math.BigDecimal;

public class Account {
  private String client;
  private BigDecimal balance;

  public Account(String client, BigDecimal balance) {
    this.client = client;
    this.balance = balance;
  }

  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public void debit(BigDecimal amount) {
    this.balance = this.balance.subtract(amount);
  }

  public void credit(BigDecimal amount) {
    this.balance = this.balance.add(amount);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Account)) {
      return false;
    }

    Account account = (Account) obj;
    if (this.client == null || this.balance == null) {
      return false;
    }

    return this.client.equals(account.getClient()) && this.balance.equals(account.getBalance());
  }
}
