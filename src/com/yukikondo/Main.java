package com.yukikondo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("Japan");
        bank.addBranch("Tokyo");
        bank.addCustomer("Tokyo", "Yu", 5000);
        bank.addCustomer("Tokyo", "Ha", 3000);

        bank.customerTransaction("Tokyo", "Yu", 506);

        bank.addBranch("Osaka");
        bank.addCustomer("Osaka", "Yu", 5000);
        bank.addCustomer("Osak", "Ha", 3000);

        bank.listCustomers("Tokyo", true);
    }
}
