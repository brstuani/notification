package com.stuani.notification.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Notification_Type")
public class NotificationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SQ_NOTIFICATION_TYPE")
    @SequenceGenerator(sequenceName = "SQ_NOTIFICATION_TYPE", allocationSize = 1, name = "SQ_NOTIFICATION_TYPE")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOTIFICATION_NAME", length = 100, nullable = false)
    private String notificationName;

    @Column(name = "status", length = 1)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotificationName() {
        return notificationName;
    }

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
