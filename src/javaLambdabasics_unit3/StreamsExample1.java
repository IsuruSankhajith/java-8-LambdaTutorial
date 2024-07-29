package javaLambdabasics_unit3;

import java.util.Arrays;
import java.util.List;

import javalambdabasics.Person;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Isuru", "Sankhajith", 10),
                new Person("Iu", "Shajith", 30),
                new Person("uru", "nkhajith", 50),
                new Person("suru", "nkhajith", 60),
                new Person("u", "ankhajith", 70)
        );
        
        people.stream()
              .filter(p -> p.getLastName().startsWith("n"))
              .forEach(p -> System.out.println(p.getFirstName()));
    }
}
