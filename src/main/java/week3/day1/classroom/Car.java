package week3.day1.classroom;

public class Car extends Vehicle{ ///Here inheriting the parent to child class
	public static void main(String args[]) {
		Car obj=new Car();
		obj.applyBrake();
		obj.soundHorn();
	}
	public void airCondition() {
		// TODO Auto-generated method stub
		System.out.println("Airconditon mtd from Car");
	}
}

//parent -vehicle
//Child - Car