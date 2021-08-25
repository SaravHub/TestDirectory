package week1.day2.classroom;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		int i;
		Arrays.sort(arr);
		System.out.println("Sorted array: "+Arrays.toString(arr));
		for (i = 1; i < arr.length; i++) {
			if(i!=arr[i-1]) {
				break;
			}
		}System.out.println("Missing Element is "+i);
	}

}
