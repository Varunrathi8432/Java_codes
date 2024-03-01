import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char str='A';
        for (int i=0;i<26;i++){
            System.out.println(str + " ");
            str++;
        }
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=(i*i);
        }
        System.out.println(sum);
        int x=0,y=1;
        for (int i=0;i<n-1;i++){
            int fib=x+y;
            x=y;
            y=fib;
        }
        System.out.print(y);
    }
}