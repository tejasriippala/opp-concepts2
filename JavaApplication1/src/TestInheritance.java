
public class TestInheritance {

	public static void main(String[] args) {
		
		JuniorSavingsAccount account = new  JuniorSavingsAccount(101, 5000, "active", 1234, "AVNT", "Hary");
		
		
		account.withdraw(2000);
		
		account.getDetails();
		
		
	}

}
