package session5.assignment1;

import java.util.List;
import java.util.Set;

/**
 * 
 * @author Amit
 *
 */
public class Display {

	/**
	 * Displays the contents of the map
	 * @param myMap-the map object whose contents are to be displayed
	 */
	public void display(MyMap myMap) {
		Set<Character> charSet = myMap.getConcordanceMap().keySet();
		int totalChar = charSet.size();
		Object[] array = charSet.toArray();
		System.out.print("{ ");
		for (int index = 0; index < totalChar; index++) {
			char ch = (char) array[index];
			System.out.print(ch + "=[ ");
			List<Integer> values=myMap.getConcordanceMap().get(ch);
			int totalValues=values.size();
			for(int index2=0;index2<totalValues;index2++)
			{
				System.out.print(values.get(index2)+" ");
			}
			System.out.print("] ");
		}
		System.out.print("}");
	}
}
