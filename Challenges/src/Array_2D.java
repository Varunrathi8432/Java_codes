import java.util.*;

public class Array_2D {
    public static int[][] input(int row,int col){
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++)
                arr[i][j]=input.nextInt();
        }
        return arr;
    }

    public static void view(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
