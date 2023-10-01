package de.unternehmensverwaltung.fuhrpark.management.fahrzeug;

import de.unternehmensverwaltung.fuhrpark.management.fahrzeug.Fahrzeug;

public class Pkw extends Fahrzeug {
    private boolean fahradTraeger;
    public void setFahradTraeger(boolean fahradTraeger) {
        this.fahradTraeger = fahradTraeger;
    }

    public Pkw(String marke, String fahrzeugStatus, String kennzeichen, double geschwindigkeit, String fahrerName) {
        super(marke, "PKW", fahrzeugStatus, kennzeichen, geschwindigkeit, fahrerName);
        this.fahradTraeger = true;
    }
}
