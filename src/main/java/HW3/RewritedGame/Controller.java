package HW3.RewritedGame;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        model.setBarriers(GlobalConstants.MIN_BARRIER, GlobalConstants.MAX_BARRIER);
        model.secreteValue();

        while (model.analyzeInput(inputIntValueWithScanner(sc)));

        view.printMessage(View.CONGRATULATION + model.getSecreteValue());
        view.printMessage(View.YOUR_WAY + model.getGuessingWay());


    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(getInputIntMessage());
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_MESSAGE + getInputIntMessage());
                sc.next();
            }
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.WRONG_INPUT_MESSAGE + getInputIntMessage());
                continue;
            }
            break;
        }
        return res;
    }

    private String getInputIntMessage() {
        return view.concatenateString(
                View.INPUT_INT_DATA, View.OPENS_SQUARE_BRACKET,
                String.valueOf(model.getMinBarrier()), View.SPACE_SING,
                String.valueOf(model.getMaxBarrier()),
                View.CLOSING_SQUARE_BRACKET, View.SPACE_SING,
                View.EQUAL_SING, View.SPACE_SING );
    }
}
