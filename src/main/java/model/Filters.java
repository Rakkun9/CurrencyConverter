package model;

public class Filters {
    private  String originalString;
    private  String ultimateString;
    private  String processedString;

    public Filters() {
    }

    public Filters(String originalString, String ultimateString, String processedString) {
        this.originalString = originalString;
        this.ultimateString = ultimateString;
        this.processedString = processedString;
    }
    public Filters(String originalString, String ultimateString) {
        this.originalString = originalString;
        this.ultimateString = ultimateString;
    }

    public Filters(String originalString) {
        this.originalString = originalString;
    }




    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    public void setUltimateString(String ultimateString) {
        this.ultimateString = ultimateString;
    }

    public void setProcessedString(String processedString) {
        this.processedString = processedString;
    }

    public String getOriginalString() {
        return originalString;
    }

    public String getUltimateString() {
        return ultimateString;
    }

    public String getProcessedString() {
        return processedString;
    }

    public static String removeSpacesAndUppercase(String userInput) {
        return userInput.toUpperCase().replace(" ", "");
    }

}
