package com.MA.REST.controller;

import com.MA.REST.model.Comerciant;
import com.MA.REST.response.ResponseHandler;
import com.MA.REST.service.ComerciantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comerciant")
@CrossOrigin
public class ComerciantController {

    ComerciantService comerciantService;

    public ComerciantController(ComerciantService comerciantService) {
        this.comerciantService = comerciantService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getComerciantDetalii(@PathVariable("id") String id){
        return ResponseHandler.responseBuilder("Datele cerute sunt aici.", HttpStatus.OK, comerciantService.getComerciant(id));
    }

    @GetMapping("getAllComerciantDetalii")
    public List<Comerciant> getAllComerciantDetalii(){
        return comerciantService.getAllComercianti();
    }

    @PostMapping("createComerciant")
    public String createComerciant(@RequestBody Comerciant comerciant){
        comerciantService.createComerciant(comerciant);
        return "Comerciant adaugat cu succes!";
    }

    @PutMapping
    public String updateComerciant(@RequestBody Comerciant comerciant){
        comerciantService.updateComerciant(comerciant);
        return "Comerciant updatat cu succes!";
    }

    @DeleteMapping("{id}")
    public String deleteComerciant(@PathVariable("id") String id){
        comerciantService.deleteComerciant(id);
         return "Comerciant sters cu succes!";
    }
}
