public class Patterns {
    public static void main(String[] args){
//        Firstpattern();
//        Secondpattern();
//        Thirdpattern();
        Fourthpattern();
    }

    public static void Firstpattern(){
        for (int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                System.out.print(4+" ");
            }
            System.out.println();
        }
    }

    public static void Secondpattern(){
        for (int i=0;i<6;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j*j + " ");
            }
            System.out.println();
        }
    }

    public static void Thirdpattern(){
        for (int i=0;i<5;i++){
            for(int j=1;j<=6;j++){
                System.out.print(j*j*j + " ");
            }
            System.out.println();
        }
    }

    public static void Fourthpattern(){
        for (int i=0;i<5;i++){
            for (char j='F';j<='K';j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
