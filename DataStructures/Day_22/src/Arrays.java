import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("secondLargestValue : " + secondLargestValue(arr));
//        char[] arr=createCharArray();
//        displayCharArray(arr);
    }

    public static int sum(int[] arr){
        int result=0;
        for(int i=0;i<20;i++){
            result+=arr[i];
        }
        return result;
    }

    public static int average(int[] arr){
        int size=arr.length;
        return sum(arr)/size;
    }

    public static int search(int[] arr,int val){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                index=i;
                break;
            }
        }
        return index;
    }

    public static char[] createCharArray(){
        Scanner taken=new Scanner(System.in);
        char[] arr=new char[26];
        arr=taken.next().toCharArray();
        return arr;
    }

    public static void displayCharArray(char[] arr){
        for(int i=0;i<26;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int secondLargestValue(int[] arr){
        int first= arr[arr[0] > arr[1] ? 0 : 1];
        int second= arr[arr[0] < arr[1] ? 0 : 1];

        for(int i=2;i<arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }
        }
        return second;
    }

}
