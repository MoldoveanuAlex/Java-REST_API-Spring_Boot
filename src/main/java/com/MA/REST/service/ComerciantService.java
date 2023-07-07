package com.MA.REST.service;

import com.MA.REST.model.Comerciant;

import java.util.List;

public interface ComerciantService {
    public String createComerciant(Comerciant comerciant);
    public String updateComerciant(Comerciant comerciant);
    public String deleteComerciant(String comerciantID);
    public Comerciant getComerciant(String comerciantID);
    public List<Comerciant> getAllComercianti();
}
