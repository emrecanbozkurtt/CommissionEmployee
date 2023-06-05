package deneme;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
	CommissionEmployee employee = new CommissionEmployee("Emrecan", "Bozkurt", "218306", 10000, 0.6);
		
		System.out.println("Employee information obtained by get methods: \n");
		System.out.printf("%s %s \n", "First name is", employee.getFirstName());
		System.out.printf("%s %s\n", "Last name is", employee.getLastName());
		System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
	}

}
