package dev.arturo.first_crud.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity<Request> getRequestById(@PathVariable Long id){
        Optional<Request> request = requestService.findRequestById(id);

        if (request.isEmpty()) {
        return ResponseEntity.notFound().build();            
        }
        return ResponseEntity.ok(request.get());
    }
    
      @GetMapping(path = "/byDate")
    public ResponseEntity<List<Request>> getRequestByDate(@RequestParam LocalDateTime requestDate) {
        List<Request> requests = requestService.findRequestByDate(requestDate);

        if (requests.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(requests);
    }

    @GetMapping(path = "/bySubjectConsult")
    public ResponseEntity<List<Request>> getRequestBySubjectConsult(@RequestParam String subjectConsult) {
        List<Request> requests = requestService.findRequestBySubjectConsult(subjectConsult);

        if (requests.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(requests);
    }

    @GetMapping(path = "/byDescriptionConsult")
    public ResponseEntity<List<Request>> getRequestByDescriptionConsult(@RequestParam String descriptionConsult) {
        List<Request> requests = requestService.findRequestByDescriptionConsult(descriptionConsult);

        if (requests.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(requests);
    }

    @PostMapping
    public ResponseEntity<Request> saveRequest(@RequestBody Request request) {
        Request savedRequest = requestService.saveRequest(request);
        return ResponseEntity.ok(savedRequest); 
    }
}
