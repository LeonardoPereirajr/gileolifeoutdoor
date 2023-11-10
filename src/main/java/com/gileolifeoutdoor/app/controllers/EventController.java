package com.gileolifeoutdoor.app.controllers;

import com.gileolifeoutdoor.app.domain.events.Events;
import com.gileolifeoutdoor.app.repositories.EventRepository;
import com.gileolifeoutdoor.app.domain.events.RequestEvents;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository repository;

    @PostMapping
    public ResponseEntity registerEvent(@RequestBody @Valid RequestEvents data){
        Events newEvents = new Events(data);
        repository.save(newEvents);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getEvents() {
        var allEvents = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allEvents);
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateEvents(@RequestBody @Valid RequestEvents data){
        Optional<Events> optionalEvent = repository.findById(data.id());
        if (optionalEvent.isPresent()) {
            Events events = optionalEvent.get();
            events.setName(data.name());
            events.setPrice_in_cents(data.price_in_cents());
            return ResponseEntity.ok(events);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteEvent(@PathVariable String id){
        Optional<Events> optionalEvent = repository.findById(id);
        if (optionalEvent.isPresent()) {
            Events events = optionalEvent.get();
            events.setActive(false);
            return ResponseEntity.noContent().build();
        } else {
            throw new EntityNotFoundException();
        }
    }

}
