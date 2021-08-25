package week3.day1.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		int len = input.length;
		List<String> li = Arrays.asList(input);
		Collections.sort(li);
		ListIterator<String> it=li.listIterator(len);
		/*while(it.hasPrevious())
			System.out.print(it.previous()+",");*/
		/*for (int i = len-1; i >=0; i--) {
			System.out.print(li.get(i)+",");
		}*/
		for(String s:li)
		{   
			System.out.print(s+",");
		}
	}

}
