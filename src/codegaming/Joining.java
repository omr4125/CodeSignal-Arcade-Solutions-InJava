package codegaming;
import java.util.*;
import java.util.stream.Collectors;
public class Joining {

	public static void main(String[] args) {
		Person sara = new Person("Sara", 4);
	    Person viktor = new Person("Viktor", 40);
	    Person eva = new Person("Eva", 42);
	    List<Person> collection = Arrays.asList(sara, viktor, eva);
	    
	    System.out.println(namesToString(collection));
		
	}
	public static String namesToString(List<Person> people) {
		
		return "Names: " + people.stream()//Stream<Person>
							.map(Person::getName)//Stream<String>
							.collect(Collectors.joining(",")) + ".";
							
		
//		String label = "Names: ";
//		StringBuilder sb = new StringBuilder(label);
//		for (Person person : people) {
//			if (sb.length() > label.length()) {
//				sb.append(", ");
//			}
//			sb.append(person.getName());
//		}
//		sb.append(".");
//		return sb.toString();
	}
}
