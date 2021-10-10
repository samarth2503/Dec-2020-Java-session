package EncapsulationSession;

public class ATM {
	
	private double curr_bal=2000;
	private final double min_bal=500;
	
	public ATM(double amt)
	{
		fetchCash(amt);
	}
	
	public ATM()
	{
		
	}
	
	public double getCurrentbalance()
	{
		return curr_bal;
	}
	
	public void setBalance(double bal)
	{
		this.curr_bal=bal;
	}
	
	public double getBalance()
	{
		return curr_bal;
	}
	
	
	private void fetchCash(double amount)
	{
		if(amount>curr_bal)
		{
			System.out.print("You dont have sufficent balance.");
			setBalance(curr_bal);
		}
		else if(amount<curr_bal && amount>min_bal)
		{
			curr_bal=curr_bal-amount;
			System.out.println("Fetching cash....");
			System.out.print("Your Current Balance is "+curr_bal);
			setBalance(curr_bal);
		}
		else if(curr_bal<=min_bal)
		{
			System.out.print("You cant withdraw the cash.Minium balance should be Rs. "+min_bal+" ");
			setBalance(curr_bal);
		}
		
		//return curr_bal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
