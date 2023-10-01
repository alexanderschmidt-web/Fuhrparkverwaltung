package de.unternehmensverwaltung.fuhrpark.management.fahrzeug;

import de.unternehmensverwaltung.fuhrpark.management.fahrzeug.Fahrzeug;

public class Lkw extends Fahrzeug {
    private double lastGrenze;
    public double getLastGrenze() {
        return lastGrenze;
    }
    public void setLastGrenze(double lastGrenze) {
        this.lastGrenze = lastGrenze;
    }

    public Lkw(String marke, String fahrzeugStatus, String kennzeichen, double geschwindigkeit, String fahrerName) {
        super(marke, "LKW", String.valueOf(fahrzeugStatus), kennzeichen, geschwindigkeit, fahrerName);
        this.lastGrenze = 20.000;
    }
}
