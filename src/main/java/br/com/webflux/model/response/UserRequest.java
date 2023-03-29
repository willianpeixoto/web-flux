package br.com.webflux.model.response;

public record UserRequest(
        String name,
        String email,
        String password
) {
}
