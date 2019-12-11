package controller;


import model.Model;
import model.entity.NoteBook;
import model.my_exception.MyException;
import view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();

        NoteBook noteBook = getLoginBook(inputNoteNoteBook);
        System.out.println(noteBook);
    }

    private NoteBook getLoginBook(InputNoteNoteBook inputNoteNoteBook) {
        NoteBook noteBook = null;
        while (true) {
            try {
                noteBook = new NoteBook(inputNoteNoteBook.getFirstName(),
                        inputNoteNoteBook.getLoginData());
                break;
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println("Not Unique login " + "\'" + e.getExistingLogin() + "\'");
                inputNoteNoteBook.inputLogin();
            }
        }
        return noteBook;
    }


}
