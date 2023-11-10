package com.example.crud.domain.events;

import jakarta.persistence.*;
import lombok.*;

@Table(name="events")
@Entity(name="events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Events {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    private Boolean active = true;

    public Events(RequestEvents requestEvents){
        this.name = requestEvents.name();
        this.price_in_cents = requestEvents.price_in_cents();
        this.active = true;
    }
}
