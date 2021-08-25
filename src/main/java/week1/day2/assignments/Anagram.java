package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt1 = "Hitler Woman";
		String txt2 = "Mother In Law";
		String str1=txt1.replaceAll("\\s", "");
		String str2=txt2.replaceAll("\\s", "");
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		if(str1.length()==str2.length()) {
			Arrays.sort(ch1);
		   	Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2))
				System.out.println(txt1+" & "+txt2+" are"+" Anagram");
			else
				System.out.println(txt1+" & "+txt2+" are"+" Not a Anagram");
		}
		else {
			System.out.println("Unequal string count");
			}
	}

}
