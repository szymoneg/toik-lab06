package com.szymonbilinski;

public class QuizImpl implements Quiz {
    private int digit;

    public QuizImpl() {
        this.digit = 254;    // zmienna moze ulegac zmianie!
    }

    @Override
    public void isCorrectValue(int value) throws ParamTooSmall, ParamTooLarge {
        if (this.digit > value){
            throw new ParamTooSmall();
        }else if (this.digit < value){
            throw new ParamTooLarge();
        }
    }
}
