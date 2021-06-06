package base;

import java.util.Scanner;

public class app {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("What is the first number?");
        String input0 = in.nextLine();

        int num0 = Integer.parseInt(input0);

        System.out.print("What is the second number?");
        String input1 = in.nextLine();

        int num1 = Integer.parseInt(input1);

        int add = num0 + num1;

        int sub = num0 - num1;

        int mult =num0 * num1;

        int div = num0/num1;




        System.out.println(num0 +" + " + num1 + " = " + add);
        System.out.println(num0 +" - " + num1 + " = " + sub);
        System.out.println(num0 +" * " + num1 + " = " + mult);
        System.out.println(num0 +" / " + num1 + " = " + div);






    }
}
