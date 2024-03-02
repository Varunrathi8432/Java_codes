import java.lang.*;
public class NumberSystem {
    public static void main(String[] args){
//        System.out.print(First(1010));
        System.out.print(Second(13));

    }
    public static int First(long n){
        int sum=0;
//        int i=0;
        int mul=1;
        for(;n>0;n=n/10){
            int temp=(int)(n%10);
//            sum+= (int) (temp * Math.pow(2,i));
            sum+=(int)(temp * mul);
            mul*=2;
//            i++;
        }
        return sum;
    }

    public static long Second(int n){
        long sum=0;
        int mul=1;
        while(n>0){
            int rem=n%2;
            sum+=rem*mul;
            n/=2;
            mul*=10;
        }
        return sum;
    }

}
