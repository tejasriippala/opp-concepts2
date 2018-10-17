
public class TestEncapsulation {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount(101, 5000, "active", 1234, "AVNT");
		
		account.withdraw(2000);
		
		System.out.println(account.getBalance());
	}

}
