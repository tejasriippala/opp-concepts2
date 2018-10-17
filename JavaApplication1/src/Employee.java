import java.time.LocalDate;

//super class
abstract public class Employee {
	
	private int id;
	private String name;
	private String designation;
	private GENDER gender;
	private LocalDate dob;
	private String phone;
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}	
	
	public Employee(int id, String name, String designation, GENDER gender, LocalDate dob, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
	}



	abstract public void calculateSalary();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
