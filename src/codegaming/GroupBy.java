package codegaming;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class GroupBy {

	public static void main(String[] args) {
		Person sara = new Person("Sara", 4, "Norwegian");
	    Person viktor = new Person("Viktor", 40, "Serbian");
	    Person eva = new Person("Eva", 42, "Norwegian");
	    List<Person> collection = Arrays.asList(sara, eva, viktor);
	    
	    Map<String, List<Person>> map = groupByNationality(collection);
	    System.out.println(map);
	}
	
	public static Map<String, List<Person>> groupByNationality(List<Person> people) {
		
		return people.stream().collect(Collectors.groupingBy(Person::getNationality));
		
//		Map<String, List<Person>> map = new HashMap<>();
//		for (Person person : people) {
//			if (!map.containsKey(person.getNationality())) {
//				map.put(person.getNationality(), new ArrayList<>());
//			}
//			map.get(person.getNationality()).add(person);
//		}
//		return map;
	}
}
