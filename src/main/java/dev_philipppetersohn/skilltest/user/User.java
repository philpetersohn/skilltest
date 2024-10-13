package dev_philipppetersohn.skilltest.user;

public record User (
    Integer id,
    String userName,
    String firstName,
    String lastName,
    String email,
    Integer phoneNumber
) {}
