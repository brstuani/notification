package com.stuani.notification.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "InAppMessage")
public class InAppMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SQ_INAPP_MESSAGE")
    @SequenceGenerator(sequenceName = "SQ_INAPP_MESSAGE", allocationSize = 1, name = "SQ_INAPP_MESSAGE")
    @Column(name = "ID")
    private Long id;

    @Column(name = "MESSAGE_BODY", length = 200, nullable = false)
    private String messageBody;

    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
