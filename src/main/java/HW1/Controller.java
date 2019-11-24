package HW1;

import java.util.Scanner;

class Controller {

    private Model model;
    private View view;

    //Constructor
    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    //The work method
    void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setHello(inputHelloWithScanner(sc));
        model.setJava(inputJavaWithScanner(sc));

        view.printHelloJava(model.createHelloJava());
    }

    //Utility methods
    private String inputHelloWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_HELLO);
        while(!sc.hasNext(View.EXPECTED_INPUT_HELLO)) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_HELLO);
            sc.next();
        }
        return sc.next();
    }

    private String inputJavaWithScanner(Scanner sc){
        view.printMessage(View.INPUT_JAVA);
        while(!sc.hasNext(View.EXPECTED_INPUT_JAVA)) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_JAVA);
            sc.next();
        }
        return sc.next();
    }

}