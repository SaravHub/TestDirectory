package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("Size of desktop: '1366x768'");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop ob=new Desktop();
		ob.computerModel();
		ob.desktopSize();
	}

}
