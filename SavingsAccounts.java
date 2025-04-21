
public class SavingsAccounts extends Account{
	double interestRate;
	SavingsAccounts(int accountNumber,double balance, double interestRate){
		super(accountNumber,balance);
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	double calculateInterest() {
		return interestRate*balance;
		
	}

}
