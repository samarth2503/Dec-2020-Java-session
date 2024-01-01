package EncapsulationSession;

public class ATMTest {

	public static void main(String[] args) {
		
		/*ATM at = new ATM(20000);
		
		To withdrwal the cash and check balance
		System.out.println("Balalnce is "+at.getBalance()); */
		
		
		// To check only CurrentBalance
		
		ATM at1 = new ATM();
		System.out.println("Current balance "+at1.getCur_bal());
		
		System.out.println("Current balance before cash withdrawl is :"+at1.getCur_bal());
		at1.getFetchCash(19700);
		
		double balance = at1.getCur_bal();
		System.out.println("Current balance after cash withdrawl is "+balance);

	}

}
