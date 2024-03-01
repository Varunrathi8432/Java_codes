public class Main {
    public static void main(String[] args) {
        double d=100.5;
        long l=(long)d;
        int i=(int)l;
        System.out.println("Double value " + d);
        System.out.println("long value " + l);
        System.out.println("Int value " + i);

        int i1 = 257;
        double d1 = 323.142;

        byte b;
        b=(byte) i1;
        System.out.println("Conversion of int to byte.");

        System.out.println("i = " + i + " b = " + b);
    }
}