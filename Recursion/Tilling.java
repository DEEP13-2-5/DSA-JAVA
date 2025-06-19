public class Tilling{
    public static int Tilling(int n){
    if(n==0 || n==1){
        return 1;
    }
    //vertical choice
    int fnm1 = Tilling(n-1);
    // horizantal choice
    int fnm2 = Tilling(n-2);
    
    int totalWay = fnm1+fnm2;
    return totalWay;
    }

    public static void main(String[] args){
        System.out.println(Tilling(3));
    } 
}