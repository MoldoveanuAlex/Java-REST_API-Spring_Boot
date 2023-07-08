package com.MA.REST.service.impl;

import com.MA.REST.exception.ComerciantNotFoundException;
import com.MA.REST.model.Comerciant;
import com.MA.REST.repository.ComerciantRepository;
import com.MA.REST.service.ComerciantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComerciantServiceImpl implements ComerciantService{

    ComerciantRepository comerciantRepository;

    public ComerciantServiceImpl(ComerciantRepository comerciantRepository) {
        this.comerciantRepository = comerciantRepository;
    }

    @Override
    public String createComerciant(Comerciant comerciant) {
        comerciantRepository.save(comerciant);
        return "Comerciant creat cu succes!";
    }

    @Override
    public String updateComerciant(Comerciant comerciant) {
        comerciantRepository.save(comerciant);
        return "Comerciant updatat cu succes!";
    }

    @Override
    public String deleteComerciant(String comerciantID) {
        comerciantRepository.deleteById(comerciantID);
        return "Comerciant sters cu succes!";
    }

    @Override
    public Comerciant getComerciant(String comerciantID) {
        if(comerciantRepository.findById(comerciantID).isEmpty())
            throw new ComerciantNotFoundException("Comerciantul nu exista!");
        return comerciantRepository.findById(comerciantID).get();
    }

    @Override
    public List<Comerciant> getAllComercianti() {
        return comerciantRepository.findAll();
    }
}
