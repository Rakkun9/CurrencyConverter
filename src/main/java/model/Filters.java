package model;

import java.util.Scanner;

public class Filters {
    private String global;

    public String RemoveSpaces(){
        return global;
    }
    public String RemoveSpaces(String userInput){
        String input = userInput.replaceAll("\\s", "").toUpperCase();
        global = input;
        return input;
    }
}
