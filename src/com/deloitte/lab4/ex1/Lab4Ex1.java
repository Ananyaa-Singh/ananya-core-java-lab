package com.deloitte.lab4.ex1;

public class Lab4Ex1 {

    public static void main(String[] args) {
        // Create Person objects
        Person smith = new Person("Smith", 30);
        Person kathy = new Person("Kathy", 25);

        // Create account objects
        SavingsAccount smithAccount = new SavingsAccount(2000, smith);
        CurrentAccount kathyAccount = new CurrentAccount(3000, kathy);

        // Deposit 2000 INR to Smith's account
        smithAccount.deposit(2000);
        System.out.println(smith.getName() + "'s balance after deposit: INR " + smithAccount.getBalance());

        // Withdraw 2000 INR from Kathy's account
        kathyAccount.withdraw(2000);
        System.out.println(kathy.getName() + "'s balance after withdrawal: INR " + kathyAccount.getBalance());

        // Try withdrawing more than overdraft limit from Kathy's account
        kathyAccount.withdraw(2500);  // Should print an overdraft limit warning
        System.out.println(kathy.getName() + "'s balance after attempting to overdraw: INR " + kathyAccount.getBalance());
    }
}

// Person class
class Person {
    private String name;
    private float age;

    // Constructor
    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}

// Account class
class Account {
    private long accNum;
    private double balance;
    private Person accHolder;
    private static long accNumCounter = 1000;  // Static counter for account number

    // Constructor
    public Account(double balance, Person accHolder) {
        this.accNum = accNumCounter++;  // Auto-generate account number
        this.balance = balance;
        this.accHolder = accHolder;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw Method (to be overridden in subclasses)
    public void withdraw(double amount) {
        if (balance - amount >= 500) {  // Minimum balance of INR 500
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied. Minimum balance of INR 500 must be maintained.");
        }
    }

    // Get Balance Method
    public double getBalance() {
        return balance;
    }

    // Getters and Setters
    public long getAccNum() {
        return accNum;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private final double minimumBalance = 500;  // Minimum balance is 500 INR

    // Constructor
    public SavingsAccount(double balance, Person accHolder) {
        super(balance, accHolder);
    }

    // Override withdraw method to check for minimum balance
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);  // Call parent class withdraw
        } else {
            System.out.println("Withdrawal denied. Minimum balance of INR " + minimumBalance + " must be maintained.");
        }
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double overdraftLimit = 1000;  // Assuming INR 1000 as overdraft limit

    // Constructor
    public CurrentAccount(double balance, Person accHolder) {
        super(balance, accHolder);
    }

    // Override withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);  // Call parent class withdraw
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
    }
}
