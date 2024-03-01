class Patterns {
    public static void main(String[] args){
//        Firstpattern(6);
//        Secondpattern(5);
//        Thirdpattern(6);
        Fourthpattern(4);
    }


    public static void Firstpattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
     public static void Secondpattern(int n){
        for (int i=0;i<n;i++){
            char x='A';
            for (int j=0;j<=i;j++){
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
     }
    public static void Thirdpattern(int n){
        for (int i=0;i<n;i++){
            int x=10;
            for (int j=0;j<=i;j++){
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
    public static void Fourthpattern(int n){
        for (int i=0;i<n;i++){
            char x='A';
            for (int j=0;j<n-i;j++){
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}
