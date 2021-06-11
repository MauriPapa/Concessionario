package it.ntt.concessionario.repositories;

import org.springframework.data.repository.CrudRepository;

import it.ntt.concessionario.models.Dipendente;

public interface DipendenteRepository extends CrudRepository<Dipendente,Long> {
    
}
