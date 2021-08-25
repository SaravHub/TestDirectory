package practice_mock;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String txt1="cute ";
		String txt2="etucw";
		String str1= txt1.replaceAll("\\s", "");
		String str2 = txt2.replaceAll("\\s", "");
		char[] charArr1 = str1.toLowerCase().toCharArray();
		char[] charArr2 = str2.toLowerCase().toCharArray();
		if(charArr1.length==charArr1.length) {
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			if(Arrays.equals(charArr1, charArr2))
				System.out.println("Given is a Anagram");
			else
				System.out.println("Given is not a Anagram");
		}
		else {
			System.out.println("Given strings are diff length charc");
		}	
	}
}
