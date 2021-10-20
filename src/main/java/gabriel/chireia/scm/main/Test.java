package gabriel.chireia.scm.main;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            double weight;
            int age;
            double calculation;

            Scanner read = new Scanner(System.in);

            System.out.print("Provide your age: ");
            age = read.nextInt();
            System.out.print("Provide your weight: ");
            weight = read.nextDouble();

            calculation = age * weight;

            System.out.println("Your calculation is: " + calculation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
