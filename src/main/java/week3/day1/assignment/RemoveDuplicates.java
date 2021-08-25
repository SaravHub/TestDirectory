package week3.day1.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String ori="PayPal India";
		ori=ori.replaceAll(" ", "");
		char[] charArray = ori.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		//Set<Character> dupSet=new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);	
		}
		for(Character ch:charSet)
			System.out.print(ch);
	}
}

/*for (int i=0;i<charSet.size();i++) {
if(charSet.isEmpty())
	charSet.remove(null);
}*/
/*Iterator<Character> it=charSet.iterator();
if(it.hasNext())
{
	charSet.add(charArray[i]);
}
else
{
	
}*/
