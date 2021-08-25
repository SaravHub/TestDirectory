package week3.day1.classroom;

public class CalculatorMtdOverloading {
	public void add(int no1,int no2) {
		// TODO Auto-generated method stub
		System.out.println("Add(2)Numbers:"+no1+no2);
	}
	public void add(int no1,int no2,int no3) {
		// TODO Auto-generated method stub
		System.out.println("Add(3)Numbers:"+no1+no2+no3);
	}
	public void mul(int no1,int no2) {
		// TODO Auto-generated method stub
		System.out.println("Mul(2)Numbers:"+no1+no2);
	}
	public void mul(int no1,double no2) {
		// TODO Auto-generated method stub
		System.out.println("Mul(2)Numbers:"+no1+no2);
	}
	public void sub(int no1,int no2) {
		// TODO Auto-generated method stub
		System.out.println("Sub(2)Numbers:"+no1+no2);
	}
	public void sub(double no1,double no2) {
		// TODO Auto-generated method stub
		System.out.println("Sub(2)Numbers:"+no1+no2);
	}
	public void div(int no1,int no2) {
		// TODO Auto-generated method stub
		System.out.println("Div(2)Numbers:"+no1+no2);
	}
	public void div(int no1,double no2) {
		// TODO Auto-generated method stub
		System.out.println("Div(2)Numbers:"+no1+no2);
	}
	public static void main(String[] args) {
		CalculatorMtdOverloading c=new CalculatorMtdOverloading();
		c.add(1, 2);
		c.add(2, 2, 2);
		c.mul(2, 2244.5504343252335);
		c.mul(2, 4);
		c.div(2, 2424.325235235235);
		c.div(10, 2);
		c.sub(2424.23232323, 2424.2424252525);
		c.sub(3, 1);
	}	
}
