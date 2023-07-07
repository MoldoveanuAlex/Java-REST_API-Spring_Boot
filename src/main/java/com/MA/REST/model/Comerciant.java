package com.MA.REST.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comerciant_info")
public class Comerciant {
    @Id
    private String comerciantId;
    private String comerciantNume;
    private String comerciantAdresa;
    private String comerciantTelefon;


    public Comerciant() {
    }

    public Comerciant(String comerciantID, String comerciantNume, String comerciantAdresa, String comerciantTelefon) {
        this.comerciantId = comerciantID;
        this.comerciantNume = comerciantNume;
        this.comerciantAdresa = comerciantAdresa;
        this.comerciantTelefon = comerciantTelefon;
    }



    public String getComerciantId() {
        return comerciantId;
    }

    public void setComerciantId(String comerciantId) {
        this.comerciantId = comerciantId;
    }

    public String getComerciantNume() {
        return comerciantNume;
    }

    public void setComerciantNume(String comerciantNume) {
        this.comerciantNume = comerciantNume;
    }

    public String getComerciantAdresa() {
        return comerciantAdresa;
    }

    public void setComerciantAdresa(String comerciantAdresa) {
        this.comerciantAdresa = comerciantAdresa;
    }

    public String getComerciantTelefon() {
        return comerciantTelefon;
    }

    public void setComerciantTelefon(String comerciantTelefon) {
        this.comerciantTelefon = comerciantTelefon;
    }
}
