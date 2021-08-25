package week1.day2;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=7;
		switch(day) {
		case 1: System.out.println("Madness Monday");
		case 2: System.out.println("Thrill Tuesday");
		case 3: System.out.println("Waking-on Wednesday");
		case 4: System.out.println("Thunder Thursday");
		case 5: System.out.println("Frying Friday");
		default: 
			if(day==6)
				System.out.println("Dude... Holiday(Saturday) !!!");
			else
				System.out.println("Dude... Holiday(Sunday) !!!");
		}
	}

}
