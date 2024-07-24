package dev.arturo.first_crud.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import dev.arturo.first_crud.models.Request;

public class RequestServiceImpl implements RequestService {

    @Override
    public List<Request> getAllRequests() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllRequests'");
    }

    @Override
    public Optional<Request> getRequestById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getRequestById'");
    }

    @Override
    public List<Request> getRequestBySolicitantName(String solicitantName) {
        throw new UnsupportedOperationException("Unimplemented method 'getRequestBySolicitantName'");
    }

    @Override
    public List<Request> getRequestByDate(LocalDateTime requestDate) {
        throw new UnsupportedOperationException("Unimplemented method 'getRequestByDate'");
    }

    @Override
    public List<Request> getRequestBySubjectConsult(String subjectConsult) {
        throw new UnsupportedOperationException("Unimplemented method 'getRequestBySubjectConsult'");
    }

    @Override
    public List<Request> getRequestByDescriptionConsult(String descriptionConsult) {
        throw new UnsupportedOperationException("Unimplemented method 'getRequestByDescriptionConsult'");
    }
    
}
