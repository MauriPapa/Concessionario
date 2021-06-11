package it.ntt.concessionario.repositories;

import org.springframework.data.repository.CrudRepository;

import it.ntt.concessionario.models.Concessionario;

public interface ConcessionarioRepository extends CrudRepository<Concessionario,Long>{
    
}
