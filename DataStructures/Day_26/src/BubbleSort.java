public class BubbleSort {
    public static void main(String[] args){
        int[] arr=new int[]{6,8,9,2,5,3,7};
        decreasingsort(arr);
        display(arr);
        increasingsort(arr);
        display(arr);
        char[] arr2=new char[]{'k','e','d','c','a','f'};
        chararraysort(arr2);
        display(arr2);
    }

    public static void decreasingsort(int[] arr){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            boolean isswap=true;
            for(int j=0;j<size-i-1;j++){
                if(arr[j]<arr[j+1]){
                    isswap=false;
                    swap(arr,j,j+1);
                }
            }
            if(isswap) break;
        }
    }

    public static void increasingsort(int[] arr){
        int size=arr.length;
        for(int i=size-1;i>0;i--){
            boolean isswap=true;
            for(int j=size-1;j>=size-i;j--){
                if(arr[j]<arr[j-1]){
                    isswap=false;
                    swap(arr,j-1,j);
                }
            }
            if(isswap) break;;
        }
    }

    public static void chararraysort(char[] arr){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            boolean isswap=true;
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    isswap=false;
                    swap(arr,j,j+1);
                }
            }
            if(isswap) break;
        }
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(char[] array, int index1, int index2){
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void display(char[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
