package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PhysicsQuestionSet {
    private ArrayList<Questions>Physics;
    public PhysicsQuestionSet(){
        Physics = new ArrayList<Questions>();
        String q1 = "370 centigrade is equal to … Fahrenheit.";
        String [] a1 = {"98.6","970","96.4","97.4"};
        Physics.add(new Questions(q1,a1,"98.6"));
        String q2 ="What is the density of water?";
        String [] a2 = {"1", "1.01", "0.99", "0.996"};
        Physics.add(new Questions(q2,a2,"1"));
        String q3 = "The potential difference required to pass a current 0.2 A in a wire of resistance 20 ohm is ...";
        String [] a3 = {"4","0.01","100","40"};
        Physics.add(new Questions(q3,a3,"4"));
        Collections.shuffle(Physics,new Random());
    }
    public int startPhysics(){
        int result = 0;
        for(int i = 0;i<Physics.size();i++){
            System.out.println(Physics.get(i).getQuestions());
            int numOption = Physics.get(i).getOptions().size();
            for(int j = 0; j<numOption; j++){
                System.out.println((j+1)+": " + Physics.get(i).getOptions().get(j));
            }
            System.out.println("Enter your response: ");
            Scanner s = new Scanner(System.in);
            int playerAnswer = s.nextInt();
            ArrayList<String> answerSet = Physics.get(i).getOptions();
            String correctAnswer = Physics.get(i).getAnswer();
            int correctAnswerIndex = answerSet.indexOf(correctAnswer);
            if(playerAnswer==correctAnswerIndex+1){
                result++;
            }
        }
        System.out.println("Your Score is : "+ result + "/3");
        return result;
    }
}
