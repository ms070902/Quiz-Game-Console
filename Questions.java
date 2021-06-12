package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Questions {
    private String questions;
    private ArrayList<String>options;
    private String answer;

    public Questions(String questions, String []options, String answer) {
        this.questions = questions;
        this.options = new ArrayList<String>();
            for(int i = 0;i<options.length;i++){
                this.options.add(options[i]);
            }
        Collections.shuffle(this.options);
        this.answer = answer;
    }

    public String getQuestions(){

        return questions;
    }

    public ArrayList<String> getOptions(){
        return options;
    }

    public String getAnswer(){
        return answer;
    }
}
