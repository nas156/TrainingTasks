package RegistrationFromWithLocale.Controller;

public interface RegularExpressions {
    String CHECK_NAME_SURNAME_THIRD_NAME_UKR = "^[[А-Я][^ЭЫЫ]ІЇЩ]{1}[а-я]{1,14}$";
    String CHECK_NAME_SURNAME_THIRD_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String CHECK_NICKNAME = "^[A-Za-z0-9]{5,20}$";
    String CHECK_COMMENT = "(.{0,})|";
    String CHECK_GROUP = "^A|U$";
    String CHECK_HOME_PHONE = "[0-9]{8}";
    String CHECK_CELLPHONE = "^\\+380\\d{3}\\d{2}\\d{2}\\d{2}$";
    String CHECK_SECOND_CELLPHONE = "\\+380\\d{3}\\d{2}\\d{2}\\d{2}|(^-$)";
    String CHECK_EMAIL = "^(?!.*@.*@.*$)(?!.*@.*\\-\\-.*\\..*$)(?!.*@.*\\-\\..*$)(?!.*@.*\\-$)(.*@.+(\\..{1,11})?)$";
    String CHECK_SKYPE = "^[A-Za-z0-9]{4,20}$";
    String CHECK_INDEX = "^[0-9]{5}$";
    String CHECK_CITY_UKR = "^[[А-Я][^ЭЫЫ]ІЇЩ]{1}[а-я]{1,14}$";
    String CHECK_STREET_UKR = "^[[А-Я][^ЭЫЫ]ІЇЩ]{1}[а-я]{1,14}$";
    String CHECK_CITY_LAT = "^[A-Z][a-z]{1,20}$";
    String CHECK_STREET_LAT = "^[A-Z][a-z]{1,20}$";
    String CHECK_FLAT_NUMBER = "^[1-100]$";
    String CHECK_HOUSE_NUMBER = "[1-100][ABC]?";
    String CHECK_DATE = "^[1-31]\\.[1-12]\\.20[01][0-9]$";
}
