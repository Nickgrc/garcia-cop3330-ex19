import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Your weight: ");
        double w;
        while (true) {
            try {
                String weight = in.nextLine();
                w = Double.parseDouble(weight);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, try again: ");
            }
        }

        System.out.print("Your height (in inches): ");
        double h;
        while (true) {
            try {
                String height = in.nextLine();
                h = Double.parseDouble(height);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, try again: ");
            }
        }

        //bmi = (weight / (height × height)) * 703

        double bmi = (w / (h * h)) * 703;

        if(bmi > 18.5 && bmi < 25){
            System.out.print("Your BMI is " + bmi + "\nYou are within the ideal weight range");
        }
        if(bmi > 25){
            System.out.print("Your BMI is " + bmi + "\nYou are overweight. You should see your doctor");
        }
        if(bmi < 18.5){
            System.out.print("Your BMI is " + bmi + "\nYou are underweight. You should see your doctor");
        }

    }
}