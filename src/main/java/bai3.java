/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author My PC
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();
        if (input > 0) {
            if (input < 1){
                System.out.println("Positive small number");
            }
            else if (input > 1000000){
                System.out.println("Positive large number");
            }
            else{
                System.out.println("Positive number");
            }
        }
        else if (input < 0){
            if (Math.abs(input) < 1){
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000){
                System.out.println("Negative large number");
            }
            else {
                System.out.println("Negative number");
            }
        }
        else {
            System.out.println("Zero");
        }
    }
}