package dev.arturo.first_crud.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "requests")


public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     
    @Column (name = "solicitant_name")
    private String solicitantName;

    @Column (name = "request_date")
    private LocalDateTime  requestDate;

    @Column (name = "subject_consult")
    private String subjectConsult;

    @Column (name = "description_consult")
    private String descriptionConsult;
    
    public Request(){
        
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSolicitantName() {
        return solicitantName;
    }

    public void setSolicitantName(String solicitantName) {
        this.solicitantName = solicitantName;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public String getSubjectConsult() {
        return subjectConsult;
    }

    public void setSubjectConsult(String subjectConsult) {
        this.subjectConsult = subjectConsult;
    }

    public String getDescriptionConsult() {
        return descriptionConsult;
    }

    public void setDescriptionConsult(String descriptionConsult) {
        this.descriptionConsult = descriptionConsult;
    }

    public Request(Long id, String solicitantName, LocalDateTime requestDate, String subjectConsult,
            String descriptionConsult) {
        this.id = id;
        this.solicitantName = solicitantName;
        this.requestDate = requestDate;
        this.subjectConsult = subjectConsult;
        this.descriptionConsult = descriptionConsult;
    }

    
}
