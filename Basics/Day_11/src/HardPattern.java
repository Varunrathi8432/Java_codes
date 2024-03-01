class Pattern {
    public static void main(String[] args){
//        Firstpattern(5);
//        secondpattern(5);
//        Thirdpattern(5);
        Fourthpattern(5);
    }


    public static void Firstpattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void secondpattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            int j=0;
            for (;j<=i;j++){
                System.out.print(" " + (j+1));
            }
            for (;j<=i*2;j++){
                System.out.print(" " + (j+1));
            }
            System.out.println();
        }
    }
    public static void Thirdpattern(int n){
        char x='A';
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(" " + x++);
            }
            x--;
            for (int j=0;j<i;j++){
                System.out.print(" " + --x);
            }
            System.out.println();
        }
    }
    public static void Fourthpattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n-i-1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
