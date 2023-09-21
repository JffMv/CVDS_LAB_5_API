package com.example.servingwebcontent;
import java.util.Random;
public class Guess {
    private int number_real;
    private int score = 100000;
    private int user;

    public Guess(int user) {
        Random rand = new Random();
        this.number_real = rand.nextInt(10)+1;
        this.user =user;
    }
    public void lose(){
        this.score = score-10000;
    }
    public boolean isCorrect(int number){
        return number == number_real;
    }
    public int scoreEnd(){
        return score;
    }
    public int getUser(){
        return user;
    }
    public int getNumber_real(){
        return number_real;
    }
}
