package hashmap.prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl {
     static HashMap<Integer,Employee> hm = new HashMap<>();
     
     static
     {
    	 hm.put(111, new Employee("Alan", 90000.0,111));
    	 hm.put(222, new Employee("Jennifer", 18000.0,222));
    	 hm.put(333, new Employee("Aarya", 4000.0,333));
         hm.put(444, new Employee("Jen", 100000.0,444));
    	 hm.put(555, new Employee("Jack", 25000.0,555));
         hm.put(444, new Employee("Jenny", 100000.0,444));

    	 
     }
     
     public static void addEmployee(Employee emp) {
    	 hm.put(emp.id, emp);
     }
     
     public static boolean deleteEmployee(int id) {
    	 hm.remove(id);
    	 if (!hm.containsKey(id))
    		 return true;
    	 return false;
     }
     
    public static String showEmpByInsuranceScheme(String insuranceScheme) {
    	 String s = "";
    	 /*for (Integer key : hm.keySet()) {
    		 if (hm.get(key).insuranceScheme.equals(insuranceScheme)) {
    			 s += hm.get(key);
    		 }
    	 }
    	 return s;*/
    	 Collection<Employee> values = hm.values();
    	 
    	 List<Employee> ans = values.stream().filter(map -> map.insuranceScheme == insuranceScheme).collect(Collectors.toList());
    	 for (Employee e : ans) {
    		 s += "name:" + e.name + " designation:" + e.designation + System.lineSeparator();
    	 }
    	 return s;
    	 
    }
     
     public static ArrayList<Employee> showAllEmpDetails(){
    	 ArrayList<Employee> emp = new ArrayList<Employee>();
    	 for (Integer key : hm.keySet()) {
    		 emp.add(hm.get(key));
    	 }
    	 return emp;
    	
     }
     
}
