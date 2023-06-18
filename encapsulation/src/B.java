class BankAccount 
{
	private double balance;

	private double getBalance()
	{
		return balance;
	}

	public void setdeposit(double amount)
	{
		this.balance += amount;
	}
	public void setwithdraw(double amount)
	{
		this.balance -= amount;
	}
}
class MyDriver
{
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount();
		System.out.println("balance Initial:" + account.getBalance());
		account.setdeposit(1000);
		System.out.println("balance After Deposit:" + account.getBalance());
		account.withdraw(400);
		System.out.println("balance After Withdraw:" + account.getBalance());
	}
}
