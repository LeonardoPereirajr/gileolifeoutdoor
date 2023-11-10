package com.gileolifeoutdoor.app.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
