package com.codigojava.rest.webservices.user;

import java.time.LocalDate;

public record User(Integer id, String name, LocalDate birthDate) {

}
