import java.util.*;

public class Normal {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        {
            int Temp = list.get(idx1);
            list.set(idx1,list.get(idx2));
            list.set(idx2,Temp);       
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add elements to the list
        list.add(1);
        list.add(21);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int idx1=1,idx2=3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);      
    }
}
