// largest elemnt with the help of linearsearch
import java.util.*;
public class largest{
    public static int getLargest(int number[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length;i++){
            if(Largest<number[i]){
                Largest = number[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args){
        int number[] ={1,2,6,5,4};
        System.out.println("largest number is "+ getLargest(number));
    }
}