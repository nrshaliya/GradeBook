/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MRPC
 */
public class AccountTransaction {
    public static void main(String[] args) {

        // Task 1 – Withdrawal
        Account account1 = new Account(1002, "Ali", "W", 400.00);
        account1.displayBalance();

        // Task 2 – Deposit
        Account account2 = new Account(2002, "Abu", "D", 1100.00);
        account2.displayBalance();

        // Task 3 – Withdrawal
        Account account3 = new Account(3002, "Ahmad", "W", 600.00);
        account3.displayBalance();
    }
    
}
