package com.gileolifeoutdoor.app.domain.events;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestEvents(
        String id,

        @NotBlank
        String name,
        @NotNull
        Integer price_in_cents
) {
}
