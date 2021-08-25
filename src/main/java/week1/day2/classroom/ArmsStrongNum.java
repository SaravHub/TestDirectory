package week1.day2.classroom;

public class ArmsStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153, oriNum=num, sum=0;
		while(num>0) {
			int a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
			//System.out.println(sum);
		}
		if(oriNum==sum)
			System.out.println(oriNum+" is  Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
	}

}
