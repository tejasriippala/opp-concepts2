import java.time.LocalDate;

public class PermanentEmployee extends Employee{
	
	LocalDate dateOfJoining;

	public PermanentEmployee(int id, String name, String designation, GENDER gender, LocalDate dob, String phone,String email, LocalDate dateOfJoining) {
		super(id, name, designation, gender, dob, phone, email);
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("PermanentEmployee : calculateSalary()");		
	}

}
