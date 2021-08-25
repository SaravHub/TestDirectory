package week1.day2.classroom;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char[] ch =new char[str.length()];
		char alpha='e';
		int count = 0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			ch[i]=str.charAt(i);
		}
		for (int i = 0; i < len; i++) {
			if(alpha==ch[i]) {
				count++;
			}
		}System.out.println(count);
	}
}
