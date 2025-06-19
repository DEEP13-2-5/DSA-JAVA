// printing arraylist
import java.util.*;

public class Normal {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

    // get operation
    int element = list.get(2);
    System.out.println(element);

    // remove element 
    list.remove(2);
    System.out.println(list);

    // set
    list.set(2,10);
    System.out.println(list);

    // contain element 
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));

    // size of arraylist 
    System.out.println(list.size());

    //print all elemets
    for(int i=0;i<list.size();i++){
          System.out.print(list.get(i)+" ");
    }
    System.out.println();
    }
}
