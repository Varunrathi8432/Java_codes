public class InsertionSort {
    public static void main(String[] args){
        int[] arr=new int[]{6,8,9,2,5,3,7};
        decreasingSort(arr);
        display(arr);
        increasingSort(arr);
        display(arr);
    }

    public static void decreasingSort(int[] arr){
        int size=arr.length;
        for(int i=1;i<size;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>arr[j-1])
                    swap(arr,j-1,j);
                else
                    break;
            }
        }
    }

    public static void increasingSort(int[] arr){
        int size=arr.length;
        for(int i=size-2;i>=0;i--){
            for(int j=i;j<size-1;j++){
                if(arr[j]>arr[j+1])
                        swap(arr,j,j+1);
                else
                    break;
            }
        }
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
