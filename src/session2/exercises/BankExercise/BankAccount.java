package session2.exercises.BankExercise;

public class BankAccount {
   private double balance;
   private double borrowingRate = 0.1;
   private double savingsRate = 0.01;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void setBorrowingRate(double borrowingRate) {
        if (borrowingRate >= 0.06) {
            this.borrowingRate = borrowingRate;
            System.out.println("The borrowing rate has been set to " + borrowingRate);
        }
        else {
            System.out.println("The borrowing rate cannot be set to " + borrowingRate + "and is still " + this.borrowingRate);
        }
    }

    public void setSavingsRate(double savingsRate) {
        if (savingsRate <= 0.02) {
            this.savingsRate = savingsRate;
            System.out.println("The savings rate has been set to " + savingsRate);
        }
        else {
            System.out.println("The savings rate cannot be set to " + savingsRate + "and is still " + this.savingsRate);
        }
    }




}
