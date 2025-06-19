// ^n java
public class optimizepower{
    // public static int power(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return x*power(x,n-1);
    // }
    public static int power(int a ,int n){
        if(n == 0){
            return 1;
        }
        int halfPower = power(a,n/2)*power(a,n/2);
        // n is odd
        if(n%2 != 0){
            halfPower = a*halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args){
        System.out.println(power(2,10));
    }
}