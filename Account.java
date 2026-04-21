/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MRPC
 */
public class Account {
    //Define instance variables...
    
    private int accNumber;
    private String PersonInCharge;
    private String Transactiontype;
    private double withdraw;
    private double debit;
    
    //Define cass variable and default to RM1000.00...
    private static double balance= 1000.00;
    
    //Define class variable and default to 0...
    private static int transactionNo = 0;
    
    //Define default constructor...
    public Account(){
    }
    
        //Define 2nd constructor...
        public Account (int accountNum, String PersonInCharge, String transaction, double amount){
           //Generate new transaction no...
           transactionNo++;
           
           //initialize the value...
           setaccNumber(accountNum);
           setPersonInCharge(PersonInCharge);
           setTransactiontype(transaction);
           
           //Identify the transaction...D = Deposit... W=Withdrawal...
           if(getTransactiontype().equals("D")){
               setBalance(getBalance() + amount);
           }
           else if (getTransactiontype().equals("W")){
               setBalance(getBalance() - amount);
           }
        }
           
           //Define setter and getter for each of the instance variables
           public int getaccNumber(){
               return (this.accNumber);
           }
           
           public void setaccNumber(int accNumber) {
               this.accNumber = accNumber;
           }
           
           public String getPersonInCharge(){
               return PersonInCharge;
           }
           
           public void setPersonInCharge(String PersonInCharge){
               this.PersonInCharge= PersonInCharge;
           }
           
           public String getTransactiontype(){
               return Transactiontype;
           }
           
           public void setTransactiontype(String Transaction){
               this.Transactiontype= Transaction;
           }
           
           //Define setter and getter for each of the static variables
           public static double getBalance() { //static adalah kepunyaan class, bukan objek
               return(Account.balance);
           }
        
           public static void setBalance(double balance){
               Account.balance=balance;
           }
           
           public static int gettransactionNo(){
               return (Account.transactionNo);
           }
           
           public static void settransactionNo(int transactionNo){
               Account.transactionNo=transactionNo;
           }
           
           public void displayBalance(){
               System.out.println("-------------------------");
               System.out.printf("Account Number = %d\n", getaccNumber());
               System.out.printf("Person In- Charge = %s\n", getPersonInCharge());
               System.out.printf("Transaction No = %d\n", gettransactionNo());
               System.out.printf("Current Balance = %.2f\n", getBalance());
               System.out.println("                ");
           }

    
    }

