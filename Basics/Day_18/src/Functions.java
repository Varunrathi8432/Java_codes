public class Functions {
    public static void main(String[] args){
//        System.out.print(cube(4));
        System.out.print(combi(23,7));

    }
    public static long cube(int n){
        return (long)(n*n*n);
    }

    public static int reverse(int n){
        int num=0;
        while(n>0){
            num=(num*10)+(n%10);
            n/=10;
        }
        return num;
    }

    public static long combi(int n,int r){
        int nume=1;
        int deno=1;
        int num=r;
        for(int i=0;i<num;i++){
            nume*=(n--);
            deno*=(r--);
        }
        return (long) (nume/deno);
    }
}
