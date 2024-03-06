public class SelectionSort {
    public static void main(String[] arg){
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
            int maxindex=i;
            for(int j=i+1;j<size;j++){
                if(arr[maxindex]<=arr[j])
                    maxindex=j;
            }
            swap(arr,maxindex,i);
        }
    }

    public static void increasingsort(int[] arr){
        int size=arr.length;
        for(int i=size-1;i>0;i--){
            int maxindex=i;
            for(int j=i-1;j>=0;j--){
                if(arr[maxindex]<=arr[j])
                    maxindex=j;
            }
            swap(arr,maxindex,i);
        }
    }

    public static void chararraysort(char[] arr){
        int size=arr.length;
        for(int i=size-1;i>0;i--){
            int maxindex=i;
            for(int j=i-1;j>=0;j--){
                if(arr[maxindex]<=arr[j])
                    maxindex=j;
            }
            swap(arr,maxindex,i);
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
