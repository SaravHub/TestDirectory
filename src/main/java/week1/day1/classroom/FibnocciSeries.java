package week1.day1.classroom;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8, firstNum = 0, secNum = 1,sum=0;
		System.out.println(firstNum);
		
		for(int i=2;i<range;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;	
			System.out.println(sum);
		}
	}
}

/*Learnings from this code
 * 1. How the for loop is working 
 * 2. what is fibnocci series
 * 3. shortcuts for print in console,for loop & create mainClass*/
