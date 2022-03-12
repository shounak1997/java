package ass.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
    	Main m = new Main();
    	Product p1 = new Product(1,"Rice",2500);
    	Product p2 = new Product(2,"Roti",1500);
    	Product p3 = new Product(3,"Chappati",250000);

    	Product p4 = new Product(4,"Maida",500);

    	List<Product> list = new ArrayList<>();
    	list.add(p1);
    	list.add(p2);
    	list.add(p3);
    	list.add(p4);
    	
    	System.out.println(m.sumOfPrices(list));
    	System.out.println(m.maxPrice(list));
    	System.out.println(m.getProductName(list));
    }
    	 double sumOfPrices(List<Product> list) {
    		double sum = list.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
    		return sum;
    		
    	}
    	
    	float maxPrice(List<Product> list) {
        	float max =  list.stream().map(Product::getPrice).collect(Collectors.reducing(Float ::max)).get();   		
            return max;

    	}
    	
    	float minPrice(List<Product> list) {
    		float min = list.stream().map(Product::getPrice).collect(Collectors.reducing(Float ::min)).get();
  
        	return min;

    	}
    	
    	List<String> getProductName(List<Product> list){
    		List<Product> products = list.stream().filter(i -> i.getPrice()>25000).collect(Collectors.toList());
    		List<String> ans = new ArrayList<>();
    		for(Product p : products) {
    			ans.add(p.getName());
    		
    	}
    		return ans;


 

    	
    	
	
  }
}
