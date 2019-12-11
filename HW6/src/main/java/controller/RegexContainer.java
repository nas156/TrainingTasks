package controller;

public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЯІЇЄ][а-яіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}

