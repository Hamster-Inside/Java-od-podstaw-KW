package com.example.obiekty.methods;

class Radio {
    int yearProduction;
    int volume;
    String station; // aktualna stacja


    Radio() {
        this.yearProduction = 2000;
        volume = 100; // to samo co this.volume =100
    }

    Radio(int yearProduction) {
        this(); // wywołanie konstruktora bezargumentowego
        this.yearProduction = yearProduction;
        this.changeStation("Rock");
    }

    public void changeStation(String newStation) {
        station = newStation;
    }

    public Radio getRadio() {
        return this;
    }

    public void printRadioInfo(Radio radio) {
        System.out.println("Radio production year: " + radio.yearProduction);
    }

}


public class ThisUsage {
    public static void main(String[] args) {
        Radio r = new Radio(1996);
        Radio r2 = new Radio(2010);
        r2.printRadioInfo(r2);

    }
}
