public class Patterns {
    public static void main(String[] args){
//        Firstpattern(5);
//        Secondpattern(5);
//        Thirdpattern(5);
        Fourthpattern(5);
    }
    public static void Firstpattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((i-j+1) + " ");
            }
            System.out.println();
        }
    }
    public static void Secondpattern(int n){
        char x='A';
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++) {
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(x+" ");
            }
            x++;
            System.out.println();
        }
    }
    public static void Thirdpattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++) {
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(n-j + " ");
            }
            System.out.println();
        }
    }
    public static void Fourthpattern(int n){
        char x='A';
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++) {
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print((char)(x+n-j-1) + " ");
            }
            System.out.println();
        }
    }
}
