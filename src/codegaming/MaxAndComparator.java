package codegaming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndComparator {

	public static void main(String[] args) {
		
	    
		Person sara = new Person("Sara", 4);
	    Person viktor = new Person("Viktor", 40);
	    Person eva = new Person("Eva", 42);
	    List<Person> collection = Arrays.asList(sara, eva, viktor);
	    
	    Person p =  getOldestPerson(collection);
	    System.out.println(p.getName());
	    System.out.println(p.getAge());
	}
	
	public static Person getOldestPerson(List<Person> people) {
		
		return people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).findFirst().get();
		
//		Person oldestPerson = new Person("", 0);
//		for (Person person : people) {
//			if (person.getAge() > oldestPerson.getAge()) {
//				oldestPerson = person;
//			}
//		}
//		return oldestPerson;
	}
	
}
