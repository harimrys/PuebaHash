import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class PruebaSetyMap {
    public static void main(String args[]) {
      
      //HashSet
        HashSet<String> list = new HashSet<>();
        list.add("watermelon");
        list.add("banana");
        list.add("cherry");
        list.add("pear");
        
        for(String palabra : list){
            System.out.println(palabra);
        }
    }
    
    //HashMap
    HashMap<String, String> map = new HashMap<>();
    map.put("Kenobi", "jedi");
    map.put("Ahsoka", "padawan");
    map.put("Anakin", "jedi");
    map.put("Vader", "Lord Sith");
    
    for(Map.Entry<String, String> pair : map.entrySet()){
        String key = pair.getKey();
        String value = pair.getValue();
        System.out.println(key + " - " + value);   
    } 
    
    //devuelve solo la key (la primera palabra)
    for(String key : map.keySet()){
        System.out.println(key);
    }
    
    //devuelve solo el value (la segunda palabra)
    for(String value : map.values()){ 
        System.out.println(value);
    }     
}
