package com.engeto.hotel;

public enum TypeOfStay {
    TYPEOFVACATION("dovolená") ,
    WORKING("pracovní pobyt");
    private String description;

    TypeOfStay(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
