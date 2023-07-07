package com.MA.REST.controller;

import com.MA.REST.model.Comerciant;
import com.MA.REST.service.ComerciantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comerciant")
public class ComerciantController {

    ComerciantService comerciantService;

    public ComerciantController(ComerciantService comerciantService) {
        this.comerciantService = comerciantService;
    }

    @GetMapping("{comerciantID}")
    public Comerciant getComerciantDetalii(@PathVariable("comerciantID") String comerciantID){
        return comerciantService.getComerciant(comerciantID);
    }

    @GetMapping()
    public List<Comerciant> getAllComerciantDetalii(){
        return comerciantService.getAllComercianti();
    }

    @PostMapping
    public String createComerciant(@RequestBody Comerciant comerciant){
        comerciantService.createComerciant(comerciant);
        return "Comerciant adaugat cu succes!";
    }

    @PutMapping
    public String updateComerciant(@RequestBody Comerciant comerciant){
        comerciantService.updateComerciant(comerciant);
        return "Comerciant updatat cu succes!";
    }

    @DeleteMapping("{comerciantID}")
    public String deleteComerciant(@PathVariable("comerciantID") String comerciantID){
        comerciantService.deleteComerciant(comerciantID);
         return "Comerciant sters cu succes!";
    }
}
