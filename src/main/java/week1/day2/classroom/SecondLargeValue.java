package week1.day2.classroom;

import java.util.Arrays;

public class SecondLargeValue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {3,2,11,4,6,7};
		int sizeOfArr=myArr.length;
		Arrays.sort(myArr);//sorting
		System.out.println("Sorted array: "+Arrays.toString(myArr));
		System.out.print("Second largest value is "+ myArr[sizeOfArr-2]);
			//System.out.print(myArr[i]+" ");
	}

}
