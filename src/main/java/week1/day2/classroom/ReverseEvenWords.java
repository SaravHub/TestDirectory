package week1.day2.classroom;
public class ReverseEvenWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I love to travel whole world";
		char[] ch= {};
		String temp = "" ;
		String[] strArray=test.split(" ");
		String[] newstr=new String[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			if(i%2==0) {
				ch= strArray[i].toCharArray();
				for (int j=ch.length-1; j >=0 ; j--) {
					temp+=ch[j];
				}
				newstr[i]=temp.toString();
				temp="";
			}	
		}
		for (int i = 0; i < newstr.length; i++) {
			if(i%2==1)
				System.out.print(strArray[i]+" ");
			else
				System.out.print(newstr[i]+" ");	
		}
	}
}
