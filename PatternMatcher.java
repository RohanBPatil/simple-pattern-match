package PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		String sample1 = "1abc";
		System.out.println(sample1 + "----->"+patternMatcher.validateInput(sample1));
	}
	
	private String validateInput(String sample) {
		String regex = "^([a-zA-Z]{3})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sample);
		if(matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
}
