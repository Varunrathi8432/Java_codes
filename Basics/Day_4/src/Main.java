import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner taken=new Scanner(System.in);
        System.out.println("Enter Two Number :");
        int a=taken.nextInt();
        int b=taken.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        System.out.println("Enter Number :");
        int n=taken.nextInt();
        for (int i=0;i<n;i+=2){
            System.out.println(i+1);
        }
    }
}