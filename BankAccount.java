package ca.uwo.csd.cs2212.skumarc;

public class BankAccount {

  private double balance;
  private int sum;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}
