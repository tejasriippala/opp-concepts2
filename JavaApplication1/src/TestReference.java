
public class TestReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount account = new JuniorSavingsAccount();
		
		account.withdraw(500,1234);
		
		JuniorSavingsAccount account2 = (JuniorSavingsAccount)account;

	}

}
