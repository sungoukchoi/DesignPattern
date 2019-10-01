package Account;

import java.util.Date;

public abstract class Account {
protected Money remainder;
protected Money creditline;
protected Date contractexpiration;
protected CalculatePolicy calculatepolicy;
public Account(Money remainder,Money creditline,Date contractexpiration,CalculatePolicy calculatepolicy) {
	this.remainder=remainder;
	this.creditline=creditline;
	this.contractexpiration=contractexpiration;
	this.calculatepolicy=calculatepolicy;
}
protected int getBalance() {
	return remainder.getmoney();
}
protected void deposit(int m) {
	remainder.setmoney(remainder.getmoney()+m);
}
public abstract void withdraw(int a);
public abstract int calculateIntrest();

}
