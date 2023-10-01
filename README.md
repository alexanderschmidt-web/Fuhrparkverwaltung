# Fuhrparkverwaltung
Verwaltung von der Fahrzeugflotte mit aktuellen Status der Fahrzeuge
Zur Anwendung werden folgende Funktionen gegeben:
 - Anlegen und entfernen Firmenfahrzeuge
 - Suchfunktion anhand Kennzeichen um bestimmte Autos zu finden
 - Protokollfunktion fuer Übergabe an den Fahrer und aktuelle Routing
 - Aktuelle Status zu Wartung/Reparatur/Untersuchung

Die Applikation wird mit dem Framework Spring realisiert und über Webbrowser dem Benutzer zur Verfügung gestellt.
MySQL Datenbank enthält zwei Tabellen: Fahrzeug und Fahrer. Die Fahrer-Daten dienen fuer Verknuepfung an die Fahrzeuge im Fuhrpark. Somit wird an jede KFZ unterwaegs ein Fahrer abgelegt.
Die Wartung und Untersuchungfunktion beinhaltet alle Infos zu letzten und bevorstehender Inspektion sowie ein Schadenmanagement.
