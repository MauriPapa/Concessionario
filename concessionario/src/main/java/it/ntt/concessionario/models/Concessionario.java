package it.ntt.concessionario.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class Concessionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "concessionario")
    public Set<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(Set<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }
    private Set<Auto> listaAuto;

    @OneToMany(mappedBy = "concessionario")
    private Set<Dipendente> listaDipendenti;

    @NonNull 
    @Size(min= 1)
    private String nome;
    public Set<Dipendente> getListaDipendenti() {
        return listaDipendenti;
    }

    public void setListaDipendenti(Set<Dipendente> listaDipendenti) {
        this.listaDipendenti = listaDipendenti;
    }
    @NonNull 
    @Size(min= 1)
    private String via;
    @NonNull 
    @Size(min= 1)
    private Regione regione;
    @NonNull 
    @Size(min= 1)
    private String citta;

    public Concessionario(){

    }

    public Regione getRegione() {
        return regione;
    }
    public void setRegione(Regione regione) {
        this.regione = regione;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getVia() {
        return via;
    }
    public void setVia(String via) {
        this.via = via;
    }
   
    
    public String getCitta() {
        return citta;
    }
    public void setCitta(String citta) {
        this.citta = citta;
    }
}
