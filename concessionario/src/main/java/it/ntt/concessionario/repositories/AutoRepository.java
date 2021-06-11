package it.ntt.concessionario.repositories;

import org.springframework.data.repository.CrudRepository;

import it.ntt.concessionario.models.Auto;

public interface AutoRepository extends CrudRepository<Auto,Long>  {
    
}
