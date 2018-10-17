import java.lang.reflect.Method;

import com.Item;

public class TestGetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item  item = new Item(101,"iPhone", 200);
		
		Class class1 = item.getClass();
		
		System.out.println(class1.getName());
		
		Method[] methods = class1.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}

	}

}

