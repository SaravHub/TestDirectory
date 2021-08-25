package practice_mock;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num=153; // 1*1*1 + 5*5*5 + 3*3*3
		int orgNum=num, sum=0;
		while(num>0)
		{
			int res=num%10;
			sum=sum+(res*res*res);
			num=num/10;
		}
		if(orgNum==sum)
			System.out.println(orgNum +" is an ArmstrongNum");
		else
			System.out.println(orgNum +" is not an ArmstrongNum");
	}
}
