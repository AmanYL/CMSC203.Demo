public class CheckingAccount extends BankAccount{
	final static double FEE = 0.15;
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		this.setAccountNumber(super.getAccountNumber()+"-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		double amountForChecking = amount + FEE;
		return super.withdraw(amountForChecking);
	}
}
