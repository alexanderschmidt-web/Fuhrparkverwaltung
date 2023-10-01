package de.unternehmensverwaltung.fuhrpark.management;

import java.util.Scanner;

public class FahrzeugUI {
    private static final Scanner scanner = new Scanner(System.in);
    private final FahrzeugManage manage = new FahrzeugManage();

    public static void main(String[] args) {
        new FahrzeugUI().start();
    }

    private void start() {
        String input = "";
        String marke = "";
        String kennzeichen = "";

        while (true) {
            System.out.println("Bitte Aktion waehlen: ('p'= neues PKW anlegen, 'l'= neues LKW anlegen, 'a'-Liste ausgeben, 's'-suchen, 'e'-exit)");
            input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "p":
                    // Daten von dem neuen Fahrzeug ueber Benutzereingabe
                    System.out.println("Geben Sie die Markenbezeichnung ein:");
                    marke = scanner.nextLine().trim().toUpperCase();
                    System.out.println("Geben Sie Kennzeichen von dem Fahrzeug ein:");
                    kennzeichen = scanner.nextLine().trim().toUpperCase();
                    manage.neuAnlegen("p", marke, kennzeichen);
                    break;
                case "l":
                    // Daten von dem neuen Fahrzeug ueber Benutzereingabe
                    System.out.println("Geben Sie die Markenbezeichnung ein:");
                    marke = scanner.nextLine().trim().toUpperCase();
                    System.out.println("Geben Sie Kennzeichen von dem Fahrzeug ein:");
                    kennzeichen = scanner.nextLine().trim().toUpperCase();
                    manage.neuAnlegen("l", marke, kennzeichen);
                    break;
                case "a":  // ganze Fahrzeugflotte auslesen
                    System.out.println(manage.getKfz());
                    break;
                case "s":  //Fahrzeug anhand gesuchten Kennzeichen ausgeben
                    System.out.println("Kennzeichen?:");
                    String GesKennz = scanner.nextLine().trim().toUpperCase();
                    manage.fahrzeugAusgeben(GesKennz);
                    System.out.println(FahrzeugManage.suchErgebnis);
                    break;
                case "e":
                    System.exit(0);
            }
        }
    }


}
