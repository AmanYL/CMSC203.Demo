public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	//Constructor
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber = (super.getAccountNumber()+"-"+savingsNumber);
	}
	public SavingsAccount(SavingsAccount otherAccount, double amount)
	{
		super(otherAccount, amount);
		savingsNumber++;
		this.accountNumber = (super.getAccountNumber()+"-"+savingsNumber);
	}
	
	public void postInterest()
	{
		double interest = this.getBalance() * rate/12;
		double newBalance = interest + this.getBalance();
		this.setBalance(newBalance);
	}
	@Override
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
}