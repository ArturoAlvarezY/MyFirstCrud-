package dev.arturo.first_crud.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arturo.first_crud.models.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request>findBySolicitantName(String solicitantName);

    List<Request>findByRequestDate(LocalDateTime requestDate);

    Request findByIdAndSolicitantName(Long id, String solicitantName);

    List <Request> findByDescriptionConsult(String descriptionConsult);

    List <Request> findBySubjectConsult(String subjectConsult);

    List <Request> findByDate(LocalDateTime requestDate);


} 
