package HW4.Controller;

import HW4.Model.UserAccount;
import HW4.View;

import java.util.Scanner;

public class Controller {
    View view;
    UserAccount userAccount;



    public Controller(UserAccount userAccount, View view) {
        this.userAccount = userAccount;
        this.view = view;
    }

    public void processeUser() {
        Scanner sc = new Scanner(System.in);
        InputChecker inputChecker = new InputChecker(sc, this.view);
        inputChecker.checkInput();
        inputChecker.setUserData(this.userAccount);
    }


}
