public class Test extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount account = new SavingsAccount(101, 5000, "active", 1234, "AVNT");
		
//		account.accountNo = 101;
//		account.balance = 5000;
//		account.status = "active";
//		account.pin = 1234;
//		account.branch = "AVNT";
		
		SavingsAccount account2 = new SavingsAccount(102,11000,"active",2345,"MTN");
		
//		account2.accountNo = 102;
//		account2.balance = 11000;
//		account2.status = "active";
//		account2.pin = 2345;
//		account2.branch = "MTN";
//		
		
		
		account.withdraw(2000);

		account.withdraw(2000,1234);
		
		account2.withdraw(3000);
		
		
		account.getDetails();
		
		System.out.println();
		
		account2.getDetails();
		
		System.out.println("InterestRate : "+SavingsAccount.getInterestrate());
				
	}

}
