import com.Item;

public class TestJavaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item item = new Item(10,"iPhone",390);
		
//		item.setId(10);
//		item.setName("iPhone");
//		item.setPrice(390);
		
		System.out.println("Id  : "+item.getId());
		System.out.println("Name: "+item.getName());
		System.out.println("Price: "+item.getPrice());

	}

}
