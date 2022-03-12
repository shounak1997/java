package hashmap.prac;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	// TODO Auto-generated constructor stub+
	Employee e = new Employee("Sheldon",85000,666);
	EmployeeServiceImpl.addEmployee(e);
	System.out.println(EmployeeServiceImpl.deleteEmployee(111));		
	
	List empDetails = EmployeeServiceImpl.showAllEmpDetails();
	empDetails.forEach(System.out :: println);
	
	System.out.println(EmployeeServiceImpl.showEmpByInsuranceScheme("scheme a"));
	}
	                  
}

