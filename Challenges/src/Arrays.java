import java.util.*;

public class Arrays {
    public static int[] input(int size){
        Scanner input=new Scanner(System.in);
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        return arr;
    }

    public static boolean issorted(int[] arr){
        int size=arr.length;
        for(int i=1;i<size;i++){
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }

    public static void view(int[] arr){
        int size=arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
