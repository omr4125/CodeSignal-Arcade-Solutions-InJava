package codegaming;

import java.util.Arrays;

public class LetterCount {

	public static void main(String[] args) {
		String[] names = {"william", "jones", "aaron", "seppe", "frank", "gilliam"};
		System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive(names));
	}
	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
		return Arrays.stream(names).filter(str -> str.length() > 5)
									.mapToInt(String::length)//Stream<integer>
									.sum();
	}
}
