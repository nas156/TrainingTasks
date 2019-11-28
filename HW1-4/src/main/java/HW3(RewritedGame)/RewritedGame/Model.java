package HW3.RewritedGame;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Model {
    private int maxBarrier = 100;
    private int minBarrier = 0;
    private int secreteValue;

    private List<Integer> guessingWay = new ArrayList<Integer>();

    public int myRand() { //Tested 23.11.2019 15:02
        return (int) (random() * ((this.maxBarrier - 1) - (this.minBarrier + 1)) + (this.minBarrier + 1));
    }

    public void secreteValue() {
        this.secreteValue = myRand();
    }

    public boolean analyzeInput(int number) {
        this.guessingWay.add(number);
        if (number == this.secreteValue) {
            return false;
        }
        if (number > this.secreteValue) {
            this.maxBarrier = number;

        } else {
            this.minBarrier = number;
        }
        return true;
    }

    public void setBarriers(int minBarrier, int maxBarrier) {
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public void setSecreteValue(int secreteValue) {
        this.secreteValue = secreteValue;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public String getGuessingWay() {
        return guessingWay.toString();
    }

    public int getSecreteValue() {
        return this.secreteValue;
    }
}
