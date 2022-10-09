import java.util.*;

public class p7_2{
	public static void main(String[] args){
		String str = "Alice is girl and Bob is boy";

        //HashMap to store values of count
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] words = str.split(" ");
		for (String word : words) {
			// containsKey(key) will return a boolean value True if present
			if (hashMap.containsKey(word))
				hashMap.put(word, hashMap.get(word) + 1); //data counting
			else
				hashMap.put(word, 1); //data entry 
		}

        //sorting using TreeMap
        TreeMap<String, Integer> tm = new  TreeMap<String, Integer> (hashMap);  
        Iterator itr=tm.keySet().iterator();  
        while(itr.hasNext()){    
            String key=(String)itr.next();  
            System.out.println(key + hashMap.get(key));  
        }  
        
		//System.out.println(hashMap);
	}
}
