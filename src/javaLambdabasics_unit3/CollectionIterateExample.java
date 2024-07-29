package javaLambdabasics_unit3;

import java.util.Arrays;
import java.util.List;

import javalambdabasics.Person;

public class CollectionIterateExample {
	
	public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Isuru", "Sankhajith", 10),
                new Person("Iu", "Shajith", 30),
                new Person("uru", "nkhajith", 50),
                new Person("suru", "nkhajith", 60),
                new Person("u", "ankhajith", 70)
        );
        
        System.out.println("Using for loop:");
        for (int i = 0; i < people.size(); i++) {
        	System.out.println(people.get(i));
        }
        
        System.out.println("Using for-each loop:");
        for (Person p : people) {
        	System.out.println(p);
        }
        
        System.out.println("Using lambda for-each loop:");
        people.forEach(p -> System.out.println(p));
	}
}
