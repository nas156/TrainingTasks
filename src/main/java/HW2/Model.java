package HW2;

import static java.lang.Math.random;

public class Model {
    private int numberToGuess;
    private final int MIN = 0;
    private final int MAX = (int) (random() * 100);
    private int minGuessRange = 0;
    private int maxGuessRange = 100;

    public int myRand(int min, int max) {
        return  (int) (random() * (max - min) + min);
    }

    public int myRand() {
        return  (int) (random() * (MAX - MIN) + MIN);
    }


    public boolean analyzeForBiggerInput(int a) {
        if (a > this.numberToGuess) {
            this.maxGuessRange = a - 1;
            return true;
        }
        return false;
    }

    public boolean analyzeForLowerInput(int a) {
        if (a < this.numberToGuess) {
            this.minGuessRange = a + 1;
            return true;
        }
        return false;
    }

    public int getMaxGuessRange() {
        return this.maxGuessRange;
    }

    public int getMinGuessRange() {
        return minGuessRange;
    }

    public void setNumberToGuess(){
        this.numberToGuess = this.myRand();
    }

    public void setNumberToGuess(int min, int max){
        this.numberToGuess = this.myRand(min, max);
    }
}