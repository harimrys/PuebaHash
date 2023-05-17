import java.util.HashMap;
import java.util.Map;

public class PruebahashMap {
    public static void main(String args[]){
        HashMap<String, String> map = new HashMap<>();
        map.put("watermelon", "melon");
        map.put("banana", "fruit");
        map.put("cherry", "fruit");
        map.put("pear", "fruit");
        map.put("cantaloupe", "melon");
        map.put("blackberry", "fruit");
        map.put("ginseng", "root");
        map.put("strawberry", "fruit");
        map.put("iris", "flower");
        map.put("potato", "tuber");
        
        for(Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }   
    }
//Mostrar las llaves:
public static void main(String[] args) throws Exception {
  HashMap<String, String> map = new HashMap<String, String>();
  map.put("Sim", "Sim");
  map.put("Tom", "Tom");
  map.put("Arbus", "Arbus");
  map.put("Baby", "Baby");
  map.put("Cat", "Cat");
  map.put("Dog", "Dog");
  map.put("Eat", "Eat");
  map.put("Food", "Food");
  map.put("Gevey", "Gevey");
  map.put("Hugs", "Hugs");
  
  printKeys(map);
}
 public static void printKeys(Map<String, String> map) {
   for(String key : map.keySet()){
     System.out.println(key);
     }
}

//Mostrar los valores: 
public static void main(String[] args) throws Exception {
  HashMap<String, String> map = new HashMap<String, String>();
  map.put("Sim", "Sim");
  map.put("Tom", "Tom");
  map.put("Arbus", "Arbus");
  map.put("Baby", "Baby");
  map.put("Cat", "Cat");
  map.put("Dog", "Dog");
  map.put("Eat", "Eat");
  map.put("Food", "Food");
  map.put("Gevey", "Gevey");
  map.put("Hugs", "Hugs");
  
  printValues(map);
  }

  public static void printValues(Map<String, String> map) {
    for(String value : map.values()){
      System.out.println(value);
      }
   }    
}
