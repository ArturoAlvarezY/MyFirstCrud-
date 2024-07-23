package dev.arturo.first_crud.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arturo.first_crud.models.RequestModels;

public interface RequestRepository extends JpaRepository<RequestModels, Long> {

    List<RequestModels>findBySolicitantName(String solicitantName);

    List<RequestModels>findByRequestDate(LocalDateTime requestDate);

    RequestModels findByIdAndSolicitantName(Long id, String solicitantName);

    
} 
