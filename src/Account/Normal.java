package Account;

import java.util.Date;

public class Normal extends Account{

	

	public Normal(Money remainder, Money creditline, Date contractexpiration, CalculatePolicy calculatepolicy) {
		super(remainder, creditline, contractexpiration, calculatepolicy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateIntrest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
