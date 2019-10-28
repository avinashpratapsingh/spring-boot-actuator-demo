package com.system.event.evento.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "EVENT_NAME" ,length = 250,nullable = false)
    private String name;
}
