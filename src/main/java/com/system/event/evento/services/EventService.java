package com.system.event.evento.services;

import com.system.event.evento.model.Event;
import com.system.event.evento.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {


    List<Event> getAllEvents();
}
