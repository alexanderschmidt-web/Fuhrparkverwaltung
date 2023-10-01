package de.unternehmensverwaltung.fuhrpark.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity // This tells Hibernate to make a table out of this class
public class KfzDaten {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String Fahrzeugtyp;
    private String Marke;
    private String Kennzeichen;
    private String Status;
    private String Geschwindigkeit;
    private String Fahrername;

    public KfzDaten() {
    }

    public String getFahrzeugtyp() {
        return Fahrzeugtyp;
    }
    public void setFahrzeugtyp(String fahrzeugtyp) {
        Fahrzeugtyp = fahrzeugtyp;
    }

    public String getMarke() {
        return Marke;
    }
    public void setMarke(String marke) {
        Marke = marke;
    }

    public String getKennzeichen() {
        return Kennzeichen;
    }
    public void setKennzeichen(String kennzeichen) {
        Kennzeichen = kennzeichen;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }

    public String getGeschwindigkeit() {
        return Geschwindigkeit;
    }
    public void setGeschwindigkeit(String geschwindigkeit) {
        Geschwindigkeit = geschwindigkeit;
    }

    public String getFahrername() {
        return Fahrername;
    }
    public void setFahrername(String fahrername) {
        Fahrername = fahrername;
    }
}
