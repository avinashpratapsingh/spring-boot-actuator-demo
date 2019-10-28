package com.system.event.evento.controller;

import com.system.event.evento.model.Event;
import com.system.event.evento.services.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/evento")

public class EventController {

    public final EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public List<Event> getAllEvent(){
        return eventService.getAllEvents();
    }


}
