import java.util.*;

public class Normal {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add elements to the list
        list.add(1);
        list.add(21);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Collections.sort(list); // corrected 'collections' to 'Collections'
        System.out.println(list); 
        
        Collections.sort(list,Collections.reverseOrder()); // corrected 'collections' to 'Collections'
        System.out.println(list);       
    }
}

