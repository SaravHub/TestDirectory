package week3.day2.classroom;

public class Desktop implements Hardware,Software{
	
	public void desktopModels() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Model from..Desktop");
	}
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software resrc");
	}
	public void softwareResources(int str) {
		// TODO Auto-generated method stub
		int no=str;
		System.out.println("Software resrc"+no);
	}
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware resrc");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopModels();
		d.softwareResources();
		d.softwareResources(5);
		d.hardwareResources();
		
	}
}
