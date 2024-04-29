package model;

public class ConversionRates {
    private double usdRate;
    private double copRate;
    private double arsRate;
    private double bobRate;
    private double brlRate;


    public ConversionRates(double usdRate, double copRate, double arsRate, double bobRate, double brlRate) {
        this.usdRate = usdRate;
        this.copRate = copRate;
        this.arsRate = arsRate;
        this.bobRate = bobRate;
        this.brlRate = brlRate;
    }

    public double getUsdRate() {
        return usdRate;
    }

    public void setUsdRate(double usdRate) {
        this.usdRate = usdRate;
    }

    public double getCopRate() {
        return copRate;
    }

    public void setCopRate(double copRate) {
        this.copRate = copRate;
    }

    public double getArsRate() {
        return arsRate;
    }

    public void setArsRate(double arsRate) {
        this.arsRate = arsRate;
    }

    public double getBobRate() {
        return bobRate;
    }

    public void setBobRate(double bobRate) {
        this.bobRate = bobRate;
    }

    public double getBrlRate() {
        return brlRate;
    }

    public void setBrlRate(double brlRate) {
        this.brlRate = brlRate;
    }
}
