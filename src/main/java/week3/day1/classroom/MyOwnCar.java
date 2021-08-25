package week3.day1.classroom;

public class MyOwnCar extends BMW{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOwnCar obj=new MyOwnCar();
		obj.applyBrake();
		obj.soundHorn();//By creating obj for calling methods form the other class it will consume more memories
		obj.airBag();
		obj.airCondition();
		/*For that use Inheritance*/
	}

}
