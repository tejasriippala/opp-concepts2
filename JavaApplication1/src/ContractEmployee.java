import java.time.LocalDate;

public class ContractEmployee extends Employee{
	
	int contractPeriod;

	public ContractEmployee(int id, String name, String designation, GENDER gender, LocalDate dob, String phone,String email, int contractPeriod) {
		super(id, name, designation, gender, dob, phone, email);
		this.contractPeriod = contractPeriod;
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("ContractEmployee : calculateSalary()");		
	}

	
}
