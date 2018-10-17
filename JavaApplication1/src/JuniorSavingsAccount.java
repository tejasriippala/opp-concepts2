//Sub class or Child class or Derived class
public class JuniorSavingsAccount extends SavingsAccount{
	
	String guardianName;
	
	public JuniorSavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public JuniorSavingsAccount(int accountNo, float balance, String status, int pin, String branch,String guardianName) {
		super(accountNo, balance, status, pin, branch);
		this.guardianName = guardianName;
	}
	
	
	public void getDetails() {
		System.out.println("AccountNo : "+accountNo+" Balance : "+getBalance());
	}
	
	//withdraw(int,int)
	@Override
    public void withdraw(int withdrawalAmount, int pin) {
		if(isPinValid(pin)) {
			
			if(withdrawalAmount <= 10000) {
				
				withdraw(withdrawalAmount);
				
			}else {
				System.err.println("Withdrawal limit execeeded");
			}
			
		}else {
			System.err.println("Invalid pin");
		}
	
	}

}
