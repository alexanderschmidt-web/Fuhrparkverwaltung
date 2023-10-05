package de.unternehmensverwaltung.fuhrpark.controller;
import  de.unternehmensverwaltung.fuhrpark.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kfz")
public class ManageController {
    @GetMapping("/")
    public ResponseEntity getKfz() {
        try {
            return ResponseEntity.ok("Server ist im Betrieb");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Es ist ein Fehler aufgetretten!");
        }
    }

    @Autowired
    // Erweiterung des Spring Boot Controllers um das JpaRepository um auf die Datenbank zuzugreifen. "@Autowired" nimmt uns den üblichen Initialisierungsaufwand ab.
    KfzDatenRepository kfzDatenRepository;
    // alle Fahrzeuge auslesen
    @GetMapping("/fahrzeuge")  // url: http://localhost:8080/kfz/fahrzeuge
    public List<KfzDaten> getAllNotes() {
        return kfzDatenRepository.findAll();
    }
}
