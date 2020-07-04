package com.stuani.notification.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Business_Notification")
public class BusinessNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SQ_BUSINESS_NOTIFICATION")
    @SequenceGenerator(sequenceName = "SQ_BUSINESS_NOTIFICATION", allocationSize = 1, name = "SQ_BUSINESS_NOTIFICATION")
    @Column(name = "ID")
    private Long id;

    @JoinColumn(name = "IdBusinessEventType")
    @ManyToOne(fetch = FetchType.LAZY)
    private BusinessEventType businessEventType;

    @JoinColumn(name = "IdNotificationType")
    @ManyToOne(fetch = FetchType.LAZY)
    private NotificationType notificationType;

    @Column(name = "status", length = 1)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BusinessEventType getBusinessEventType() {
        return businessEventType;
    }

    public void setBusinessEventType(BusinessEventType businessEventType) {
        this.businessEventType = businessEventType;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
