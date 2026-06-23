import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args){
        ArrayList<String> friuts = new ArrayList<>();
        friuts.add("apple");
        friuts.add("Kiwi");
        friuts.add("mango");

        Iterator<String> iterator = friuts.iterator();
        while (iterator.hasNext()){
            String fruits  = iterator.next();
            if (fruits.equals("mango")) {
                iterator.remove();
            }
        }
        System.out.println(friuts);
    }
}
