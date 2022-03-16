package codegaming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 44);
		System.out.println(getString(list));
	}
	
	public static String getString(List<Integer> list) {
		return list.stream()
							.map(s -> {
								String str = "";
								if (s % 2 == 0) {
									str += "e" + s; 
								}else {
									str += "o" + s;
								}
								return str;
							} 
							).collect(Collectors.joining());
	}
}
