package dev.arturo.first_crud.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import dev.arturo.first_crud.models.Request;

public interface RequestService {
    
List <Request> findAllRequests();

Optional <Request> findRequestById(Long id);  

List <Request> findRequestBySolicitantName(String solicitantName);

List <Request> findRequestByDate(LocalDateTime requestDate);

List <Request> findRequestBySubjectConsult(String subjectConsult);

List <Request> findRequestByDescriptionConsult(String descriptionConsult);

}
