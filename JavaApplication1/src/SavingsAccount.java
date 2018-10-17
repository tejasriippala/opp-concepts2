
//Super class or Parent class or Base class
public class SavingsAccount extends Object implements IAccountService{
	
	//fields or instance variables or non-static variables
	protected int accountNo;
	private float balance;
	String status;
	private int pin;
	String branch;
	
	final static float interestRate=2.25f;
	
	//default constructor
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public SavingsAccount(int accountNo, float balance, String status, int pin, String branch) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
		this.branch = branch;
	}
	
	public void getDetails() {
		System.out.println("AccountNo : "+accountNo+" Balance : "+getBalance());
	}
	

	public boolean isPinValid(int pin) {
		if(this.pin == pin) {
			return true;
		}
		
		return false;
	}

	public static float getInterestrate() {
		return interestRate;
	}
	
	public float getBalance() {
		return balance;
	}
	
	
	//instance methods or non-static methods
	//withdraw(int)
	public void withdraw(int withdrawalAmount) {
		//business logic
		if(withdrawalAmount <= this.balance) {
			this.balance = this.balance - withdrawalAmount;
		}else {
			System.err.println("Invalid withdrawal amount");
		}
		
	}
	
	//withdraw(int,int)
	public void withdraw(int withdrawalAmount,int pin) {
		
		if(isPinValid(pin)) {
			
			if(withdrawalAmount <= 40000) {
				
				withdraw(withdrawalAmount);
				
			}else {
				System.err.println("Withdrawal limit execeeded");
			}
			
		}else {
			System.err.println("Invalid pin");
		}
		
	}

	
	//instance methods or non-static methods
	public void deposit(int depositAmount) {
		if(depositAmount > 0 ) {
			this.balance = this.balance + depositAmount;
		}else {
			System.err.println("Invalid deposit amount");
		}
	}
}
