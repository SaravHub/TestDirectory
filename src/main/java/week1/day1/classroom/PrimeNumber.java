package week1.day1.classroom;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=21;
		boolean flag=false;
		if(input==0||input==1)
		{
			System.out.println(input +" is not a Prime Number");
		}
		else {
			for(int i=2;i<=input/2;i++) {
				if(input%i==0) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(input +" is a Prime Number");
			}
			else{
				System.out.println(input +" is not a Prime Number");
			}
		}	
	}
}

/*Learnings from this code
 * 1. How the for loop is working 
 * 2. How to find the Prime No.
 * 3. shortcuts for print in console,for loop & create mainClass*/
