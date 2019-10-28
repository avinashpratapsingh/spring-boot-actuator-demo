package com.system.event.evento.services;

import com.system.event.evento.model.Event;
import com.system.event.evento.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepository repo;

    @Override
    public List<Event> getAllEvents() {
        return repo.findAll();
    }


}
