package com.system.event.evento.actuator;

import com.system.event.evento.model.Event;
import com.system.event.evento.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
@Endpoint(id = "get-health")
public class ServiceHealth {

    @Autowired
    EventRepository repo;

    @ReadOperation
    public List<Event> health(@Selector String name){
        return repo.getAllEventWithName(name.toUpperCase());
    }

    @DeleteOperation
    public void deleteById(@Selector Long id){
        repo.deleteById(id);
    }
}
