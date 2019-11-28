package HW2;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setNumberToGuess();
        while (true) {
            int inputGuess = inputGuess(sc);
            if (model.analyzeForBiggerInput(inputGuess)) {
                view.printMessage(View.MESSAGE_ABOUT_LOWER);
            } else {
                if (model.analyzeForLowerInput(inputGuess)) {
                    view.printMessage(View.MESSAGE_ABOUT_BIGGER);
                } else {
                    view.printMessage(View.CONGRATULATION_MESSAGE + view.updateUserInfo(inputGuess));
                    break;
                }
            }
            view.printMessage(view.updateUserInfo(inputGuess));
        }
    }

    public int inputGuess(Scanner sc) {
        view.inputMessage(model.getMinGuessRange(), model.getMaxGuessRange());
        int res = 0;
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_MESSAGE);
                sc.next();
            }

            if ((res = sc.nextInt()) < model.getMinGuessRange() ||
                    res > model.getMaxGuessRange()) {
                view.printMessage(View.WRONG_RANGE_MESSAGE);
                continue;
            }
            break;
        }
        return res;
    }

}
