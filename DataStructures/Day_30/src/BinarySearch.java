public class BinarySearch {
    public static void main(String[] args){
        int[] arr=new int[]{0,2,3,4,5,7,9};
        System.out.println(increasingOrderFound(arr,7));
        int[] arr2=new int[]{9,7,5,4,3,2,0};
        System.out.print(decreasingOrderFound(arr2,2));
    }
    public static int increasingOrderFound(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
                return mid;
            else if(target>arr[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }

    public static int decreasingOrderFound(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}
