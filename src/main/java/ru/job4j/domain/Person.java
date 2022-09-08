package ru.job4j.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person {
    @EqualsAndHashCode.Include
    private int id;
    private String login;
    private String password;
}
