import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Temperature : ");
        int temperature=input.nextInt();

        //  Logical Operator ( && and // )
        if(temperature>35 && temperature<50)
            System.out.print("Yes, good time for swim");
        else
            System.out.print("No, Not good time for swim");

        // Bitwise Operator
        System.out.println(6<<2); // 6*(2^2)
        System.out.println(12>>2);// 6/(2^2>
        System.out.println(6^4);// XOR
        System.out.println(~30);// compliment(NOT)
        System.out.println(1&2);// AND
        System.out.println(6|20);// OR
    }
}
