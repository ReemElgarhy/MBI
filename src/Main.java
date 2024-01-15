
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello Welcome To The BMI Calculator ");
        System.out.println("Please Enter Your weight : ");
        double y = input.nextDouble();
        System.out.println("Please Enter Your Height :");
        double z = input.nextDouble();
        double BMI = y / Math.pow(z, 2);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25)
            System.out.println("Normal Weight");
        else if (BMI >= 25 && BMI < 30)
            System.out.println("Over weighT");
        else
            System.out.println("Obese");


    }
}


//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.



