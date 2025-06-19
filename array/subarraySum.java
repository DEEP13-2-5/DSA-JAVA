// sum {2,4,6,8,10} =>{2,4}=6,{2,4,6,8,10}=24...... max sum out of all
import java.util.*;

public class SubarraySum {
    // 1st method (brute force method)
    public static void maxSum(int[] number) {
        int maxSum = Integer.MIN_VALUE;
        int currSum;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                }
                System.out.println("Sum of subarray [" + i + "," + j + "] = " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
//sum store in prefix then calculated
  public static void prefixsum(int number[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[number.length];
    
    // Initialize the prefix array
    prefix[0] = number[0];
    for (int i = 1; i < prefix.length; i++) {
        prefix[i] = prefix[i - 1] + number[i];
    }
    
    // Calculate the maximum subarray sum using the prefix array
    for (int i = 0; i < prefix.length; i++) {
        for (int j = i; j < prefix.length; j++) {
            currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
    }
    
    System.out.println("Max Sum = " + maxSum);
}

//kadane's method 
public static void kadane(int number[]) {
    int ms = Integer.MIN_VALUE; // Initialize max sum to the smallest possible integer
    int cs = 0; // Current sum

    for (int i = 0; i < number.length; i++) {
        cs = cs + number[i];
        if (cs > ms) {
            ms = cs; // Update max sum if current sum is greater
        }
        if (cs < 0) {
            cs = 0; // Reset current sum if it becomes negative
        }
    }

    System.out.println("Max number is: " + ms);
}

    public static void main(String[] args) {
        int[] number = {-2,-4,-6,-8,-10};
        kadane(number);
    }
}

