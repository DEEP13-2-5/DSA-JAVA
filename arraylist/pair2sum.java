import java.util.ArrayList;

public class pair2sum {
    public static boolean pair2(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            // Check if the sum of the pair is equal to the target
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Move left pointer if the sum is less than the target
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            // Move right pointer if the sum is greater than the target
            else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pair2(list, target));
    }
}
