 package hashmap.prac;

public class Employee {
	String name;
	double salary;
	Integer id;
	String designation;
	String insuranceScheme;
	
	public Employee(String name, double salary, Integer id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
		calDesignation();
		calInsuranceScheme();
	}
	
	public String calDesignation() {
		if (salary<5000)
			designation = "Clerk";
		else if (salary >= 5000 && salary <20000)
			designation = "System Associate";
		else if (salary >=20000 && salary <40000)
			designation = "Programmer";
		else 
			designation = "Manager";
		return designation;
	}
	
	public String calInsuranceScheme() {
		if (salary<5000)
			insuranceScheme = "no scheme";
		else if (salary >= 5000 && salary <20000)
			insuranceScheme = "scheme c";
		else if (salary >=20000 && salary <40000)
			insuranceScheme = "scheme b";
		else 
			insuranceScheme = "scheme a";
		return insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

}
