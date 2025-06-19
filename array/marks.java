//marks for 3 subject
import java.util.*;

public class marks{
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args){
    int marks[] ={93,94,97};
    for(int i=0;i<marks.length;i++){
      System.out.print(marks[i] + " ");
    }
    System.out.println();
    }
}

//     public static void main(String[] args) {
//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("physics: " + marks[0] + ", chemistry: " + marks[1] + ", maths: " + marks[2]);
//     }
// }
