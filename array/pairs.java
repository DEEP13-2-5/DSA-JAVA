// pairs of 2,4,6,8,10 => (2,4)...(2,10),(4,6)...(4,10)......(8,10)
import java.util.*;

public class Pairs {
    public static void pairs(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) { 
                int curr = number[i];
                System.out.println("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs = " + tp);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        pairs(number);
    }
}
