package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String b;
        do {
            System.out.println("Welcome to Quiz-Mania!!");
            System.out.print("Enter 1 for Mathematics Quiz OR 2 for Physics Quiz: ");
            Scanner sc = new Scanner(System.in);
            int o = sc.nextInt();
            if (o == 1) {
                MathsQuestionSet m = new MathsQuestionSet();
                m.startMaths();
            } else if (o == 2) {
                PhysicsQuestionSet p = new PhysicsQuestionSet();
                p.startPhysics();
            } else {
                System.out.println("Invalid input!!");
            }
            System.out.println("Press R to RESTART QUIZ.\n Press Q to QUIT QUIZ.");
            Scanner e = new Scanner(System.in);
            b = e.next();
        } while(b.equalsIgnoreCase("R"));


    }
}
