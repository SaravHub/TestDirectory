package week3.day1.assignment;

public class MovingZerosRight {

	public static void main(String[] args) {
		int[] num = {4,0,3,0,1,5,2,0};
		int count=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]==0)
				count++;
			else
				System.out.print(num[i]+",");
		}
		for (int i = 0; i < count; i++) {
			System.out.print("0");
		}
	}
}
