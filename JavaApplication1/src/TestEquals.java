import com.Item;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item  item1 = new Item(101,"iPhone", 200);
		
		Item  item2 = new Item(101,"iPhone", 200);
		
		Item  item3 = new Item(101,"iPhone", 200);
		
//		Item item = null;
		
		System.out.println(item1.equals(null));
		
//		System.out.println(item2.equals(item3));
//		
//		System.out.println(item1.equals(item3));
		
//		String s1 = new String("Hello World!");
//		
//		String s2 = new String("Hello World!");
//		
//		System.out.println(s1.equals(s2));

	}

}
