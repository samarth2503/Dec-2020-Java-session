package EncapsulationSession;

public class ATM {
	
	private double cur_bal = 20000;
	private double min_bal = 500;
	
	public double getCur_bal() {
		return cur_bal;
	}


	public void setCur_bal(double cur_bal) {
		this.cur_bal = cur_bal;
	}


	public double getMin_bal() {
		return min_bal;
	}


	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}
	
	public void getFetchCash(double amount)
	{
		fetchCash(amount);
	}
	
	private void fetchCash(double amount)
	{
		if(amount>cur_bal)
		{
			System.out.println("You don't have sufficent cash to withdraw...Please enter denomination less than : "+cur_bal);
		}
		else if(amount<cur_bal && amount>min_bal)
		{
			cur_bal = cur_bal - amount;
			setCur_bal(cur_bal);
			if(cur_bal<=500)
			{
				System.out.println("Please maintain minimum balance of Rs 500 in your account..Deposit Rs "+(500-cur_bal)+" in your account to maintain balance..");
			}
			
			System.out.println("Your withdrawl is successful....");
		}
		else {
			System.out.println("Please maintain minimum balance of Rs 500 in your account..");
		}
		
	}



	public static void main(String[] args)
	{
		
	}

}
