package it.dstech.formazione.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.dstech.formazione.users.model.Immagine;

@Repository
public interface ImmagineRepository extends JpaRepository<Immagine, Long> {

}
