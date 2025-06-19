public class bubblesort{
    public static void bubblesort(int arr[]){
        for(int i=0;i<number.length-1;i++){
            for(int j=0;j<number.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[i];
                    arr[i] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            
        }
    }
    public static void main(String[] args){

    }
}