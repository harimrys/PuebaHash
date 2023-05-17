import java.util.HashSet;

public class PruebahashSet {
    public static void main(String args[]){
        
        HashSet<String> list = new HashSet<>();
        list.add("watermelon");
        list.add("banana");
        list.add("cherry");
        list.add("pear");
        list.add("cantaloupe");
        list.add("blackberry");
        list.add("ginseng");
        list.add("strawberry");
        list.add("iris");
        list.add("potato");
        
        for(String text : list){
            System.out.println(text);
        }     
    }
}
