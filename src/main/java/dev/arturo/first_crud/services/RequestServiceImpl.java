package dev.arturo.first_crud.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.arturo.first_crud.models.Request;


@Service
public class RequestServiceImpl implements RequestService {

    @Override
    public List<Request> findAllRequests() {
        throw new UnsupportedOperationException("Unimplemented method 'findAllRequests'");
    }

    @Override
    public Optional<Request> findRequestById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findRequestById'");
    }

    @Override
    public List<Request> findRequestBySolicitantName(String solicitantName) {
        throw new UnsupportedOperationException("Unimplemented method 'findRequestBySolicitantName'");
    }

    @Override
    public List<Request> findRequestByDate(LocalDateTime requestDate) {
        throw new UnsupportedOperationException("Unimplemented method 'findRequestByDate'");
    }

    @Override
    public List<Request> findRequestBySubjectConsult(String subjectConsult) {
        throw new UnsupportedOperationException("Unimplemented method 'findRequestBySubjectConsult'");
    }

    @Override
    public List<Request> findRequestByDescriptionConsult(String descriptionConsult) {
        throw new UnsupportedOperationException("Unimplemented method 'findRequestByDescriptionConsult'");
    }



    
}
