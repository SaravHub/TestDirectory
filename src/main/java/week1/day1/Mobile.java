package week1.day1;

public class Mobile {
	public String mobileModel="Xioami";
	public int mobileWeight= 2000;
	public boolean isFullCharge=true;
	public double mobileCost=1000000.5;
	 
	public void makeCall() {
		System.out.println("Initiating the Call...");
	}
	public void sendMsg() {
		System.out.println("Initiating the Message...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mblobj = new Mobile();
		mblobj.makeCall();
		mblobj.sendMsg();
		System.out.println(mblobj.mobileModel);
		System.out.println(mblobj.mobileWeight);
		System.out.println(mblobj.isFullCharge);
		System.out.println(mblobj.mobileCost);
	}

}
