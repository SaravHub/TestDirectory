package week3.day1.assignment;

import java.util.Arrays;

public class MissinElementInArray {
	public static void main(String[] args) {
		int [] arr= {2,3,7,5,8,10,15,12};
		Arrays.sort(arr);
		int[] res=new int[arr[arr.length-1]+1];
		for (int i : arr) {//foreach to set the value exists set to 1 otherwise make it as 0
			res[i]=1;
		}
		for (int i = 1; i < res.length; i++) {
			if(res[i]==0)
				System.out.println(i);
		}	
	}
}
/*List<int[]> li=Arrays.asList(arr);// here i'm converting int[]--> List so generic type should be List<int[]>
*/	