package person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {
     public static void main(String[] args) {
	    List<Person> people = getPeople();
	    
	    System.out.println("Details of Sheldon");
	    Person person = people.stream().filter(p ->p.getName().equals("Sheldon")).collect(Collectors.toList()).get(0);
	    System.out.println(person);
	    /*
	    List<Person> females = people.stream()
	    	 .filter(p -> p.getGender().equals(Gender.FEMALE))
	    	 .collect(Collectors.toList());
	    females.forEach(System.out::println);
	    
	    System.out.println("Reversed Sorted List");
	    List<Person> sortedList = people.stream()
	    		.sorted(Comparator.comparing(Person::getAge).reversed()) // Reversed sorted list.
	    		.collect(Collectors.toList());
	    sortedList.forEach(System.out::println);
	    
	    //Comparing on the basis of two or more parameters using thenComparing.
	    System.out.println("Sorting with age and gender");
	    List<Person> sortedList2 = people.stream()
	    		.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed())
	    		.collect(Collectors.toList());
	    sortedList2.forEach(System.out::println); 
	    
	    System.out.println("The eldest person is  ");
	     people.stream()
	    		.max(Comparator.comparing(Person :: getAge))
	    		.ifPresent(old -> System.out.println(old.getName()));*/
	    
     }
     
     public static List<Person> getPeople(){
    	 List<Person> people = new ArrayList<>();
    	 people.add( new Person("Sheldon",41,Gender.MALE));
    	 people.add(new Person("Howard",40,Gender.MALE));
    	 people.add(new Person("Penny",40,Gender.FEMALE));
    	 people.add(new Person("Raj",45,Gender.MALE));
    	 
    	 return people;
     }
}
