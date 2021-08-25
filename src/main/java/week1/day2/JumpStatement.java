package week1.day2;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=6 ; i++) {
			if(i%3==0) {
				System.out.println("Divided by Three");
				continue;
				//break; // will skip at this iteration when if "true"
			}
			System.out.println(i);
		}
	}

}
