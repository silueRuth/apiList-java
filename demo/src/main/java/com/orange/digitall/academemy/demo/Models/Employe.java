package com.orange.digitall.academemy.demo.Models;

import javax.persistence.*;

import org.springframework.lang.Nullable;

import java.io.Serializable;

@Entity
@Table(name = "employes")
public class Employe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(
        name = "nom",
        nullable = false,
        columnDefinition = "TEXT"    
    ) private String nom;

    @Column(
        name = "prenom",
        nullable = false,
        columnDefinition = "TEXT"    
    ) private String prenom;

    @Column(
        name = "numero",
        nullable = false,
        columnDefinition = "INT"    
    ) private int numero;

    public Employe(long id, String nom, String prenom, int numero){

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }

    public Employe(){
        
    }

    //gettters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    


  

    
}
