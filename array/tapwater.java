import java.util.*;

public class tapwater{
    public static int traprain(int h[]){
        int n =heigth.length;
        int leftMax[] = new int[n];
        leftMax[0] = h[0];
        for(int i=1;i<n;i++){
            leftMax = Math.max(h[i],leftMax[i-1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = h[n-1];
        for(int i=n-2;i>0;i--){
            leftMax = Math.max(h[i],rightMax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0;i<n;i++){
            int waterlevel =Math.min(leftMax[i],rightMax[i]);
            trappedwater += waterlevel-h[i];
        } 
        return trappedwater;
    }
    public static void main(String[] args){
        int h[]={4,2,0,6,3,2,5};
        System.out.println(traprain(h));
    }
}