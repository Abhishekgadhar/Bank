
public class Account {
 int accountNumber;
 double balance;
 
 Account(int accountNumber,double balance){
	 this.accountNumber=accountNumber;
	 this.balance=balance;
 }
 
 int getAccountNumber() {
	 return accountNumber;
 }
 double getbalance() {
	 return balance;
	 
 }
 void deposit(double amount) {
	 balance = balance+amount;
 }
 void withdraw(double amount) {
	 balance = balance-amount;
 }
 
 double calculateInterest() {
	 return 0.0;
 }
 
}
