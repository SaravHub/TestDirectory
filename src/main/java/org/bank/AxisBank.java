package org.bank;

public class AxisBank extends BankInfo{ 
	/*if commented mtd deposit is accessible then the deposit mtd shoould be call from Axisbank class 
	 * else it will call from BankInfo*/
	/*public void deposit() {   
		// TODO Auto-generated method stub
		System.out.println("Deposit from AxisBank");
	}*/
	public static void main(String[] args) {
		AxisBank bankObj=new AxisBank();
		bankObj.deposit();
	}
}
