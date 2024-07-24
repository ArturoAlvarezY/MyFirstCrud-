package dev.arturo.first_crud.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import dev.arturo.first_crud.models.Request;

public interface RequestService {
    
List <Request> getAllRequests();

Optional <Request> getRequestById(Long id);  

List <Request> getRequestBySolicitantName(String solicitantName);

List <Request> getRequestByDate(LocalDateTime requestDate);

List <Request> getRequestBySubjectConsult(String subjectConsult);

List <Request> getRequestByDescriptionConsult(String descriptionConsult);





}
