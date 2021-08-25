package week3.day1.assignment;

import java.util.TreeSet;
import java.util.Set;

public class RemoveDuplicatesCollection {
	public static void main(String[] args) {
		String str="PayPal India";
		System.out.println(removeDulicate(str));	
	}
	 static String removeDulicate(String str) {
		char [] chrArr=str.toCharArray();
		Set<Character> charset=new TreeSet<Character>();
		for (char ch : chrArr) {
			charset.add(ch);
		}
		StringBuffer sb=new StringBuffer();
		for (char c : charset) {
			sb.append(c);
		}
		return sb.toString();
	}
}
