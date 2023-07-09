package com.MA.REST.service;

import com.MA.REST.model.Comerciant;

import java.util.List;

public interface ComerciantService {
    public Comerciant createComerciant(Comerciant comerciant);
    public String updateComerciant(Comerciant comerciant);
    public String deleteComerciant(String id);
    public Comerciant getComerciant(String id);
    public List<Comerciant> getAllComercianti();
}
