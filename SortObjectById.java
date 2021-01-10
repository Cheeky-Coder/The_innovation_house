import java.util.*;
public class SortObjectById{

	public static void main(String[] args)
	{

		Map<Integer, String> hashMap = new HashMap<Integer, String>()
		{{
     		put(4, "abc");
     		put(10, "abc2");
     		put(5, "abc3");
     		put(6, "abc5");
		}};

		 ArrayList<Integer> sortedKeys =  new ArrayList<Integer>(hashMap.keySet()); 
          
        Collections.sort(sortedKeys);  
  
        for (String x : sortedKeys)  
            System.out.println("Key = " + x + ", Value = " + hashMap.get(x)); 
	}
}