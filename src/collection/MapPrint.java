package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapPrint {
	public static void main(String[] args){
		Map <String,String>map = new HashMap<String,String>();
		map.put("熊大", "棕色");
		map.put("熊二", "黄色");
		for(Map.Entry<String, String> entry : map.entrySet()){
		    String mapKey = entry.getKey();
		    String mapValue = entry.getValue();
		    System.out.println(mapKey+":"+mapValue);
		}
		
		//key
		for(String key : map.keySet()){
		    System.out.println(key);
		}
		//value
		for(String value : map.values()){
		    System.out.println(value);
		}
		
		Iterator<Entry<String, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Entry<String, String> entry = entries.next();
		    String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println(key+":"+value);
		}
		
		for(String key : map.keySet()){
		    String value = map.get(key);
		    System.out.println(key+":"+value);
		}
	}
}
