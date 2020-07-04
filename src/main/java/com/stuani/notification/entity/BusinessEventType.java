package com.stuani.notification.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BusinessEventType")
public class BusinessEventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SQ_BUSINESS_EVENT_TYPE")
    @SequenceGenerator(sequenceName = "SQ_BUSINESS_EVENT_TYPE", allocationSize = 1, name = "SQ_BUSINESS_EVENT_TYPE")
    @Column(name = "ID")
    private Long id;

    @Column(name = "BUSINESS_EVENT_NAME", length = 100, nullable = false)
    private String businessEventName;

    @Column(name = "BUSINESS_EVENT_STATUS", length = 1)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessEventName() {
        return businessEventName;
    }

    public void setBusinessEventName(String businessEventName) {
        this.businessEventName = businessEventName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
