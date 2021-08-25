package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="saravanankb"; 
		char[] ch=new char[str.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=str.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0)
				System.out.print(Character.toUpperCase(ch[i]));
			else
				System.out.print(ch[i]);
		}
		/* Another Solution
		 * for (int i = 0; i < ch.length; i=i+2) {
			System.out.print(Character.toUpperCase(ch[i]));
		}*/
	}

}
