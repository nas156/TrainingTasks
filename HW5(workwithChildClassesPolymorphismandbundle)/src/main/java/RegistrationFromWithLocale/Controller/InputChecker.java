package RegistrationFromWithLocale.Controller;

import RegistrationFromWithLocale.Model.UserAccount;
import RegistrationFromWithLocale.Model.UserGroup.Group;
import RegistrationFromWithLocale.View.TextConstants;
import RegistrationFromWithLocale.View.View;

import java.util.Scanner;

public class InputChecker {
    private  View view;
    private Scanner scanner;

    private String name;
    private String surname;
    private String thirdName;
    private String fullName;
    private String nickname;
    private String comment;
    private Group group;
    private String homePhoneNumber;
    private String cellphoneNumber;
    private String secondCellphoneNumber;
    private String email;
    private String skype;
    private String postIndex;
    private String city;
    private String street;
    private String flatNumber;
    private String houseNumber;
    private String fullAddress;
    private String dateOfInserting;
    private String dateOfUpdating;

    InputChecker(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    void checkInput() {
        UtilityController utilityController = new UtilityController(this.view, this.scanner);

        String nameSurnameThirdNameLocale = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegularExpressions.CHECK_NAME_SURNAME_THIRD_NAME_UKR : RegularExpressions.CHECK_NAME_SURNAME_THIRD_NAME_LAT;

        this.surname = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_NAME, nameSurnameThirdNameLocale);
        this.name = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_SURNAME, nameSurnameThirdNameLocale);
        this.thirdName = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_THIRD_NAME, nameSurnameThirdNameLocale);
        this.fullName = createFullName(this.surname, this.name);
        this.nickname = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_NICKNAME, RegularExpressions.CHECK_NICKNAME);
        this.comment = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_COMMENT, RegularExpressions.CHECK_COMMENT);
        this.group = setGroup(utilityController);
        this.homePhoneNumber = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_HOME_PHONE, RegularExpressions.CHECK_HOME_PHONE);
        this.cellphoneNumber = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_CELLPHONE, RegularExpressions.CHECK_CELLPHONE);
        this.secondCellphoneNumber = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_SECOND_CELLPHONE, RegularExpressions.CHECK_SECOND_CELLPHONE);
        this.email = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_EMAIL, RegularExpressions.CHECK_EMAIL);
        this.skype = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_SKYPE, RegularExpressions.CHECK_SKYPE);
        this.postIndex = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_INDEX, RegularExpressions.CHECK_INDEX);

        String cityCheckLocale = (String.valueOf(View.bundle.getLocale()).equals("ua"))

                ? RegularExpressions.CHECK_CITY_UKR : RegularExpressions.CHECK_CITY_LAT;
        this.city = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_CITY, cityCheckLocale);

        String streetCheckLocale = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegularExpressions.CHECK_STREET_UKR : RegularExpressions.CHECK_STREET_LAT;

        this.street = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_STREET, streetCheckLocale);
        this.flatNumber = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_FLAT_NUMBER, RegularExpressions.CHECK_FLAT_NUMBER);
        this.houseNumber = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_HOUSE_NUMBER, RegularExpressions.CHECK_HOUSE_NUMBER);
        this.fullAddress = createFullAddress(this.postIndex, this.city, this.street, this.flatNumber, this.houseNumber);
        this.dateOfInserting = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_DATE_OF_INSERTING, RegularExpressions.CHECK_DATE);
        this.dateOfUpdating = utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_DATE_OF_UPDATING, RegularExpressions.CHECK_DATE);
    }

    void setUserData(UserAccount userAccount) {
        userAccount.setName(this.name);
        userAccount.setSurname(this.surname);
        userAccount.setThirdName(this.thirdName);
        userAccount.setFullName(this.fullName);
        userAccount.setNickname(this.nickname);
        userAccount.setComment(this.comment);
        userAccount.setGroup(this.group);
        userAccount.setHomePhoneNumber(this.homePhoneNumber);
        userAccount.setCellphoneNumber(this.cellphoneNumber);
        userAccount.setSecondCellphoneNumber(this.secondCellphoneNumber);
        userAccount.setEmail(this.email);
        userAccount.setSkype(this.skype);
        userAccount.setPostIndex(this.postIndex);
        userAccount.setCity(this.city);
        userAccount.setStreet(this.street);
        userAccount.setFlatNumber(this.flatNumber);
        userAccount.setHouseNumber(this.houseNumber);
        userAccount.setFullAddress(this.fullAddress);
        userAccount.setDateOfInserting(this.dateOfInserting);
        userAccount.setDateOfUpdating(this.dateOfUpdating);
    }

    private String createFullAddress(String postIndex, String city, String street, String flatNumber, String houseNumber) {
        return postIndex + TextConstants.COMMA + city + TextConstants.COMMA + street + TextConstants.COMMA + flatNumber + TextConstants.COMMA + houseNumber;
    }

    private String createFullName(String surname, String name) {
        return surname + TextConstants.SPACE_BLANK + name.charAt(0) + TextConstants.DOT;
    }

    private Group setGroup(UtilityController utilityController) {
        if (utilityController.checkInput(TextConstants.MESSAGE_TO_INPUT_GROUP, RegularExpressions.CHECK_GROUP).equals("A"))
            return Group.Admin;
        else return Group.User;
    }
}
