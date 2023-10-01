package de.unternehmensverwaltung.fuhrpark.management.fahrzeug;

import java.time.LocalDateTime;

public class Fahrzeug {
    private String marke;
    public String getMarke() {return marke;}
    public void setMarke(String marke) {this.marke = marke;}

    private String fahrzeugTyp;
    public String getFahrzeugTyp() {return fahrzeugTyp;}
    public void setFahrzeugTyp(String fahrzeugTyp) {this.fahrzeugTyp = fahrzeugTyp;}

    private String fahrzeugStatus;
    public String getFahrzeugStatus() {return fahrzeugStatus;}
    public void setFahrzeugStatus(String fahrzeugStatus) {this.fahrzeugStatus = fahrzeugStatus;}

    private String kennzeichen;
    public String getKennzeichen() {return kennzeichen;}
    public void setKennzeichen(String kennzeichen) {this.kennzeichen = kennzeichen;}

    double geschwindigkeit;
    boolean motorIstAn;

    String fahrerName;
    LocalDateTime uebergebenUm;

    public Fahrzeug() {
    }

    public Fahrzeug(String marke, String fahrzeugTyp, String fahrzeugStatus, String kennzeichen, double geschwindigkeit, String fahrerName) {
        this.marke = marke;
        this.fahrzeugTyp = fahrzeugTyp;
        this.fahrzeugStatus = fahrzeugStatus;
        this.kennzeichen = kennzeichen;
        this.geschwindigkeit = geschwindigkeit;
        this.fahrerName = fahrerName;
    }

    public void gasGeben() {
        if (motorIstAn) {
            geschwindigkeit = geschwindigkeit + 1.0;
        } else {
            System.out.println(marke + ": Motor ist nich an!");
        }
    }

    public void abBremsen() {
        if (motorIstAn) {
            geschwindigkeit = geschwindigkeit - 1.0;
        } else {
            System.out.println(marke + ": Motor ist nich an!");
        }
    }

    public void anFahrerUebergeben(String fahrerNahme) {
        this.fahrerName = fahrerNahme;
        this.uebergebenUm = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Fahrzeug {" +
                "Marke = " + marke + ", " +
                "Typ = " + fahrzeugTyp + ", " +
                "Kennzeichen = " + kennzeichen + ", " +
                ((motorIstAn) ? "Motorstatus = An, " : "Motorstatus = Aus, ") +
                "Geschwindigkeit = " + geschwindigkeit + ", " +
                "Fahrername = " + fahrerName + ""
                + "}";
    }
}