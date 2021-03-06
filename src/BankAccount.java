public abstract class BankAccount
{
	//Fields
	static int nextAccNum;
	String name;
	int acctNumber;
	double balance;
	
	//Constructors
	/**
	 * Creates a bank account with a balance initialized as a specific value
	 * @param n		name
	 * @param b		balance
	 */
	public BankAccount(String n, double b)
	{
		name = n;
		acctNumber = nextAccNum;
		balance = b;
		nextAccNum ++;
	}
	/**
	 * Creates a bank account with a balance initialized as 0
	 * @param n		name
	 */
	public BankAccount(String n)
	{
		this(n,0);
	}
	//Methods
	/**
	 * Adds an amount to the balance of a bank account
	 * @param amt	amount
	 * @return		the balance of the account after an amount is deposited
	 */
	public double deposit(double amt)
	{
		if(amt > 0)
		balance += amt;
		else  throw  new IllegalArgumentException();
		return balance;
	}
	/**
	 * Withdraws an amount of the balance of a bank account
	 * @param amt	amount
	 * @return		the balance of the account after an amount is withdrawn
	 */
	public double withdraw(double amt)
	{
		if(amt > 0)
		balance -= amt;
		else throw new IllegalArgumentException();
		return balance;
	}
	/**
	 * Returns the name of the owner of the bank account
	 * @return	the name of the bank account owner
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Returns the balance of the bank account
	 * @return	the balance of the bank account
	 */
	public double getBalance()
	{
		return balance;
	}
	/**
	 * Abstract method to be instantiated in sub classes
	 */
	public abstract void endOfMonthUpdate();
	/**
	 * Transfers an amount from the balance of one bank account to another
	 * @param other		another bank account
	 * @param amt		the amount transferred to the other account
	 * @return			the balance of the bank account transferring money
	 */
	public double transfer(BankAccount other, double amt)
	{
		this.balance -= amt;
		balance += amt;
		return balance;
	}
	/**
	 * Returns the number, name, and balance associated with the bank account
	 */
	public String toString()
	{
		return "" + acctNumber +"\t" + name + "\t$" + balance;
	}
}
