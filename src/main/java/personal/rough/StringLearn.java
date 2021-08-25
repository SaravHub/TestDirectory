package personal.rough;

public class StringLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Saravanan";
		String str2="saravanan";
		String str3=new String("Saravanan");
		String str4=new String("saravanan");
		System.out.println(str1==str2);//false
		System.out.println(str1==str3);//false
		System.out.println(str1==str4);//false
		System.out.println(str3==str4);//false
		System.out.println(str2.equals(str4));//true
		System.out.println(str1.equals(str3));//true
	}
}
