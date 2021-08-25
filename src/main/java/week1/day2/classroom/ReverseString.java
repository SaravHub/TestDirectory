package week1.day2.classroom;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
		char[] chArray=test.toCharArray();
		for (int i = chArray.length-1; i>=0 ; i--) {
			System.out.print(chArray[i]);
		}
	}

}
