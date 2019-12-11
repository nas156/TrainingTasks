package model.entity;

import model.my_exception.MyException;

public class NoteBook {
    private String name;
    private String loginData;

    public NoteBook(String name, String loginData)
            throws MyException {
        if (NoteBookContainer.checkForLoginExistent(loginData)){
            throw new MyException("Not Unique Login",
                    loginData);
        }
        this.name = name;
        this.loginData = loginData;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLoginData() {
        return loginData;
    }
    public void setLoginData(String loginData) {
        this.loginData = loginData;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "firstName='" + name + '\'' +
                ", loginData='" + loginData + '\'' +
                '}';
    }
}