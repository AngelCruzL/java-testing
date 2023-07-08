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
}
