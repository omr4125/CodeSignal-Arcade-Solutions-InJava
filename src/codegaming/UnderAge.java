package codegaming;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class UnderAge {

	public static void main(String[] args) {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		Person anna = new Person("Anna", 5);
		
		List<Person> collection = Arrays.asList(sara, eva, viktor, anna);
		
		System.out.println(getKidNames(collection));
		 
	}
	
	public static Set<String> getKidNames(List<Person> people) {
		
		return people.stream()//stream 4 person
							.filter(p -> p.getAge() < 18)//stream 2 person(Sara,anna)
							.map(Person::getName)//stream (Sara.getname(), anna.getName)
							.collect(Collectors.toSet());
		
//		Set<String> kids = new HashSet<>();
//		for (Person person : people) {
//			if (person.getAge() < 18) {
//				kids.add(person.getName());
//			}
//		}
//		return kids;
	}
}
