package week1.day2.classroom;

public class Calculator {

	public int add(int a,int b) {
		int sum=a+b ;
		return sum ;	
	}
	public double sub(double a,double b) {
		double result=a-b ;
		return result;	
	}
	public double mul(double a,double b) {
		double result=a*b;
		return result ;	
	}
	public int div(int a,int b) {
		int result=a/b ;
		return result ;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		System.out.println(obj.add(2, 5));
		System.out.println(obj.sub(2.25, 5.5));
		System.out.println(obj.mul(2.25, 5.5));
		System.out.println(obj.div(2, 5));
	}
}
