package com.MA.REST.model;

import jakarta.persistence.*;

@Entity
@Table(name = "comerciant_info")
public class Comerciant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String comerciantNume;
    private String comerciantAdresa;
    private String comerciantTelefon;


    public Comerciant() {
    }

    public Comerciant(int id, String comerciantNume, String comerciantAdresa, String comerciantTelefon) {
        this.id = id;
        this.comerciantNume = comerciantNume;
        this.comerciantAdresa = comerciantAdresa;
        this.comerciantTelefon = comerciantTelefon;
    }


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
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
