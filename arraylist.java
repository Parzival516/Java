import java.util.*;
import java.lang.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>(10);
        // list.add(12);
        // list.add(13);
        // list.add(14);
        // list.add(15);
        // list.add(16);
        // System.out.println(list);
        // System.out.println(list.contains(14));
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list);
            
        }
        
    }
    
}
