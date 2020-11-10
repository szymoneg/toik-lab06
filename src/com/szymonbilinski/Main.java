package com.szymonbilinski;

public class Main {

    public static void main(String[] args) {
        Quiz quiz = new QuizImpl();
        int min = quiz.MIN_VALUE;
        int max = quiz.MAX_VALUE;
        int digit = (min+max)/2; // zainicjuj zmienna

        for (int counter = 1; ; counter++) {
            try {
                quiz.isCorrectValue(digit);
                System.out.println("Trafiona proba!!! Szukana liczba to: "
                        + digit + " Ilosc prob: " + counter);
                break;
            }catch (Quiz.ParamTooLarge paramTooLarge) {
                System.out.println("Argument za duzy!!!");
                max = digit;
                digit = (min + max) / 2;
            }catch (Quiz.ParamTooSmall paramTooSmall) {
                System.out.println("Argument za maly!!!");
                min = digit;
                digit = (min + max) / 2;

            }
        }
    }
}
