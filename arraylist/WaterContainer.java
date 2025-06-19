import java.util.*;

public class WaterContainer{
    public static int watercontainer(ArrayList<Integer> heigth){
        // maxWater
    //     int maxWater = 0;
    //     for(int i=0;i<heigth.length;i++){
    //         for(int j=i+1;j<heigth.length;j++){
    //             int ht = Math.min(heigth.get(i),heigth.get(j));
    //             int width=j-i;
    //             int currWater =ht*width;
    //             maxWater =Math.max(currWater,maxWater);
    //         }
    //     }
    //     return maxWater;
    // }
    // point 2
    int maxWater=0;
    int lp=0;
    int rp=heigth.size()-1;
    while(lp<rp){
    //calculate water area
        int ht=Math.min(heigth.get(lp),heigth.get(rp));
        int width = rp-lp;
        int currWater =ht*width;
        maxWater =Math.max(maxWater,currWater);
        //update 
        if(heigth.get(lp)<heigth.get(rp)){
                lp++;
        }else{
                rp--;
            }
        }
        return maxWater;
    }
   public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(watercontainer(height));
    }
}