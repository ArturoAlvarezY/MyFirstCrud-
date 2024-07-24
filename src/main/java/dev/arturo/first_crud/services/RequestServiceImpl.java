package dev.arturo.first_crud.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.arturo.first_crud.Repository.RequestRepository;
import dev.arturo.first_crud.models.Request;


@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }

    @Override
    public List<Request> findAllRequests() {
       return requestRepository.findAll();
    }

    @Override
    public Optional<Request> findRequestById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id cant be null!");
        }

        return requestRepository.findById(id);
    }

    @Override
    public List<Request> findRequestBySolicitantName(String solicitantName) {

        if (solicitantName.trim().isEmpty() || solicitantName == null) {
            throw new IllegalArgumentException("Name cant be empty, must set a name");
        }

        return requestRepository.findBySolicitantName(solicitantName);
    }

    @Override
    public List<Request> findRequestByDate(LocalDateTime requestDate) {
        if (requestDate == null) {
            throw new IllegalArgumentException("Request Date cant be null");
        }
    return requestRepository.findByRequestDate(requestDate);
    }

    @Override
    public List<Request> findRequestBySubjectConsult(String subjectConsult) {
        if (subjectConsult.trim().isEmpty()) {
        throw new IllegalArgumentException("The consult, must has a subject!");    
        }

        return requestRepository.findBySubjectConsult(subjectConsult);
    }

    @Override
    public List<Request> findRequestByDescriptionConsult(String descriptionConsult) {
    return requestRepository.findByDescriptionConsult(descriptionConsult);

    }
}
