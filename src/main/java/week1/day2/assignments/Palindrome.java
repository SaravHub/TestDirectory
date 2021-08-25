package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Malayalam";
		String rev="";
		str1.toCharArray();
		for (int i = str1.length()-1; i>=0; i--) {
			rev=rev+str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(rev))
			System.out.println(str1+" is the Palindrome");
		else
			System.out.println(str1+" is Not the Palindrome");
	}
}