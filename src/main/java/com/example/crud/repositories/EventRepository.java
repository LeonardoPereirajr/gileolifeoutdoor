package com.example.crud.repositories;

import com.example.crud.domain.events.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Events, String> {

    List<Events> findAllByActiveTrue();
}
