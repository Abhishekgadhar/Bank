
public class CheckingAccount extends Account	 {
    double monthlyfee;
    CheckingAccount(int accountNumber,double balance,double monthlyfee){
    	super(accountNumber, balance);
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    	this.monthlyfee=monthlyfee;
    }
   double calculateInterest() {
	   return 0.0;
   }
}
