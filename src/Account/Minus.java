package Account;

import java.util.Date;

import Policy.WithdrawCondition;

public class Minus extends Account{

	public Minus(Money remainder, Money creditline, Date contractexpiration, CalculatePolicy calculatepolicy) {
		super(remainder, creditline, contractexpiration, calculatepolicy);
		// TODO Auto-generated constructor stub
	}

	private CalculatePolicy calculatepolicy;
	private WithdrawCondition withdrawcondition;
	
	

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
