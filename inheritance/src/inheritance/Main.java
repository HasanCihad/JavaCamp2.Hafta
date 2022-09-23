package inheritance;

public class Main {

	public static void main(String[] args) {
		 Customer customer = new Customer();
		 customer.firstName="Hasan";
		 Employee employee = new Employee();
		 employee.salary=150000;
		 EmployeeManager employeeManager = new EmployeeManager();
		 CustomerManager customerManager = new CustomerManager();
		 employeeManager.Add();
		 customerManager.List();

	}

}
