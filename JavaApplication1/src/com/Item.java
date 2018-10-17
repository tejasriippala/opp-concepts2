package com;

public class Item implements Cloneable{
	
	private int id;
	private String name;
	private float price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}	
	
	public Item(int id, String name, float price) {
		setId(id);
		setName(name);
		setPrice(price);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Item i2 = (Item)obj;
//		
//		if(i2 != null) {
//		
//			if(this.id == i2.id && this.name.equals(i2.name) && this.price == i2.price) {
//				return true;
//			}
//		}
//		
//		return false;
//	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		}else {
			System.err.println("Invalid id");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

		
	

}
