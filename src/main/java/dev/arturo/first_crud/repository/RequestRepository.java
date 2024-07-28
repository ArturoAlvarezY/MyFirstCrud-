package dev.arturo.first_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.arturo.first_crud.models.Request;
@Repository

public interface RequestRepository extends JpaRepository<Request, Long> {

    
}
