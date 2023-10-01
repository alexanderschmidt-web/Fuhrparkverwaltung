package de.unternehmensverwaltung.fuhrpark.management;
/**
 * Zur Anwendung im Webbrowser werden folgende Funktionen gegeben:
 *  - Anlegen und entfernen Firmenfahrzeuge
 *  - Suchfunktion anhand Kennzeichen um bestimmte Autos zu finden
 *  - Protokollfunktion fuer Übergabe an den Fahrer und aktuelle Routing
 *  - Aktuelle Status zu Wartung/Reparatur/Untersuchung
 */

import de.unternehmensverwaltung.fuhrpark.management.fahrzeug.Fahrzeug;
import de.unternehmensverwaltung.fuhrpark.management.fahrzeug.Lkw;
import de.unternehmensverwaltung.fuhrpark.management.fahrzeug.Pkw;

import java.util.ArrayList;

public class FahrzeugManage {

    public static Fahrzeug suchErgebnis;
    public static Fahrzeug suchErgebnis2;

    private final ArrayList<Fahrzeug> kfz = new ArrayList();

    public void neuAnlegen(String typ, String marke, String kennz) {
        if(typ.equalsIgnoreCase("p")) {
            kfz.add(new Pkw(marke, "frei", kennz, 0.0, ""));
        }
        if(typ.equalsIgnoreCase("l")) {kfz.add(new Lkw(marke, "frei", kennz, 0.0, ""));}
    }

    public void fahrzeugAusgeben(String kennz) {
        for(Fahrzeug s: kfz)
            if(s.getKennzeichen().equalsIgnoreCase(kennz)) {
                suchErgebnis = s;
                suchErgebnis2 = s;
            }
    }

    public ArrayList<Fahrzeug> getKfz() {
        return kfz;
    }
}
