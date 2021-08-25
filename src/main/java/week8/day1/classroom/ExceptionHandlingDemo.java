package week8.day1.classroom;

public class ExceptionHandlingDemo {
	private static int div(int i, int j) {
		int result=i/j;
		return result;
	}
	public static void main(String[] args) {
		int res=div(5,10);
		System.out.println(res);
	}


}
