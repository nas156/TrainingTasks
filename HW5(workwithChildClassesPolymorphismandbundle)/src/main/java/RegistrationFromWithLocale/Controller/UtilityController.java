package RegistrationFromWithLocale.Controller;

import RegistrationFromWithLocale.View.View;

import java.util.Scanner;

public class UtilityController {
    private View view;
    private Scanner scanner;

    public UtilityController(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }

    String checkInput(String message, String regex) {
        String checkedInput;
        view.printStringInput(message);
        while (!(this.scanner.hasNext() && (checkedInput = this.scanner.next()).matches(regex))) {
            this.view.printWrongStringInput(message);
        }
        return checkedInput;
    }
}
