package com.company;
import java .util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MathsQuestionSet {
    private ArrayList<Questions> Math;
    public MathsQuestionSet(){
       Math = new ArrayList<Questions>();
       String q1 = "Which number is equivalent to 3^(4)÷3^(2)?";
       String [] a1 = {"6","3","9","12"};
       Math.add(new Questions(q1,a1,"9"));
       String q2 = "I am an odd number. Take away one letter and I become even. What number am I?";
       String []a2 = {"11","7","1","9"};
       Math.add(new Questions(q2,a2,"7"));
       String q3 = "Look at this series: 53, 53, 40, 40, 27, 27, … What number should come next?";
       String[]a3 = {"7","8","14","22"};
       Math.add(new Questions(q3,a3,"14"));
       Collections.shuffle(Math,new Random());

    }
    public int startMaths(){
        int result = 0;
        for(int i = 0;i<Math.size();i++){

            System.out.println(Math.get(i).getQuestions());
            int numOption = Math.get(i).getOptions().size();
            for(int j = 0; j<numOption; j++) {
                System.out.println((j+1) + ": " + Math.get(i).getOptions().get(j));
            }
            System.out.println("Enter your response: ");
            Scanner s = new Scanner(System.in);
            int playerAnswer = s.nextInt();
            ArrayList<String> answerSet = Math.get(i).getOptions();
            String correctAnswer = Math.get(i).getAnswer();
            int correctAnswerIndex = answerSet.indexOf(correctAnswer);
            if(playerAnswer==correctAnswerIndex+1){
                result++;
            }
//
        }
        System.out.println("Your got "+ result + "/3 correct answers.");
        if (result == 3){
            System.out.println("Your Score is 30 points!!\n CONGRATULATIONS!!");
        }else if (result ==2){
            System.out.println("Your Score is 20 points!!\n Well Done!!");
        }else if(result == 1){
            System.out.println("Your Score is 30 points!!\n Better Luck Next Time.");
        }else{
            System.out.println("Your Score is 0\n Please retry to score more.");
        }
        return result;
    }
}
