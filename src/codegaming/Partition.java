package codegaming;

import java.util.*;
import java.util.stream.Collectors;

public class Partition {

	public static void main(String[] args) {
		Person sara = new Person("Sara", 4);
	    Person viktor = new Person("Viktor", 40);
	    Person eva = new Person("Eva", 42);
	    List<Person> collection = Arrays.asList(sara, eva, viktor);
	    
	    Map<Boolean, List<Person>> map = partitionAdults(collection);
	    System.out.println(map);
	}
	
	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		
		return people.stream()
							.collect(Collectors.groupingBy(p -> p.getAge() >= 18));
		
//		Map<Boolean, List<Person>> map = new HashMap<>();
//		map.put(true, new ArrayList<>());
//		map.put(false, new ArrayList<>());
//		for (Person person : people) {
//			map.get(person.getAge() >= 18).add(person);
//		}
//		return map;
	}
}
