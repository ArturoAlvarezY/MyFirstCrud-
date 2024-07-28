package dev.arturo.first_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.arturo.first_crud.models.Request;
import dev.arturo.first_crud.repository.RequestRepository;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }

    public Request updateRequest(Long id, Request requestDetails) {
        Request request = requestRepository.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
        request.setSolicitantName(requestDetails.getSolicitantName());
        request.setRequestDate(requestDetails.getRequestDate());
        request.setSubjectConsult(requestDetails.getSubjectConsult());
        request.setDescriptionConsult(requestDetails.getDescriptionConsult());
        return requestRepository.save(request);
    }

    public void deleteRequest(Long id) {
        requestRepository.deleteById(id);
    }

    public Request getRequestById(Long id) {
        return requestRepository.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
    }
}
