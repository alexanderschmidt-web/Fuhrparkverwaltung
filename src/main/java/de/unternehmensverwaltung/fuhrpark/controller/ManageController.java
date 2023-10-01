package de.unternehmensverwaltung.fuhrpark.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
