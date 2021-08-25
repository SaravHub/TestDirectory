package week1.day2.classroom;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0,space=0,num=0,specialChar=0;
		
		char[] ch=new char[test.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=test.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i])) 
				letter++;
			else if(Character.isDigit(ch[i]))
				num++;
			else if(Character.isWhitespace(ch[i]))
				space++;
			else specialChar++;
		}
		System.out.println("letter: " + letter);
		System.out.println("letter: " + num);
		System.out.println("letter: " + specialChar);
		System.out.println("letter: " + space);
	}

}
