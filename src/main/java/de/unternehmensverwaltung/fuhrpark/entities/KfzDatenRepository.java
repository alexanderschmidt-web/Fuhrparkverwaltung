package de.unternehmensverwaltung.fuhrpark.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// das Interface stellt dank Implementierung von JpaRepository dem Java-Programm CRUD-Funktionalitaet zur Verfuegung
public interface KfzDatenRepository extends JpaRepository<KfzDaten, Long> {

}


