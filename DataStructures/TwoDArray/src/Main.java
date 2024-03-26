public class Main {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3,5},{4,5,6,6},{7,8,9,7},{1,2,3,4}};
        int sum=0,n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
        }
        for(int i=0;i<n;i++){
            sum+=arr[i][n-i-1];
        }
        if(n%2!=0){
            sum-=arr[n/2][n/2];
        }
    System.out.print(sum);
    }
}