import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=input.nextInt();
//        First(n);
//        System.out.print(Second(n));
//        Third(n);
        if(Six(n)) System.out.print("Yes, it is Prime");
        else System.out.print("No, it is not Prime");
    }
    public static void First(int n){
        int i=2;
        do{
            System.out.print(i + " ");
            i+=2;
        }while (i<=n);
    }

    public static int Second(int n){
        int fact=1;
        int i=1;
        while (i<=n){
            fact*=i;
            i++;
        }
        return fact;
    }

    public static void Third(int n){
        int i=1;
        while (i<=n){
            if(i%3==0||i%5==0) {
                i++;
                continue;
            }
            System.out.print(i++ + " ");
        }
    }

    public static boolean Six(int n){
        if(n==0||n==1) return false;
        for(int i=2;i*i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
