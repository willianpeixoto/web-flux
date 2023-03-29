package br.com.webflux.model.request;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) {
}
