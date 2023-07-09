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
    public Comerciant createComerciant(Comerciant comerciant) {
//        comerciantRepository.save(comerciant);
//        return "Comerciant creat cu succes!";
        return comerciantRepository.save(comerciant);
    }

    @Override
    public String updateComerciant(Comerciant comerciant) {
        comerciantRepository.save(comerciant);
        return "Comerciant updatat cu succes!";
    }

    @Override
    public String deleteComerciant(String id) {
        comerciantRepository.deleteById(id);
        return "Comerciant sters cu succes!";
    }

    @Override
    public Comerciant getComerciant(String id) {
        if(comerciantRepository.findById(id).isEmpty())
            throw new ComerciantNotFoundException("Comerciantul nu exista!");
        return comerciantRepository.findById(id).get();
    }

    @Override
    public List<Comerciant> getAllComercianti() {
        return comerciantRepository.findAll();
    }
}
