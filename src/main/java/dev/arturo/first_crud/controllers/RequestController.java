package dev.arturo.first_crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.arturo.first_crud.models.Request;
import dev.arturo.first_crud.services.RequestService;

@RestController
public class RequestController{
    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService){
        this.requestService= requestService;
    }

    @GetMapping(path = "/all")
    public List<Request> getAllRequests() {
        return this.requestService.findAllRequests();
    } 

    @GetMapping(path = "/{id}")
    public Optional <Request> getRequestById(@PathVariable Long id){

        return this.requestService.findRequestById(null);
    }

    




}
