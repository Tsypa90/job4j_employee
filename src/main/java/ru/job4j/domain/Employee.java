package ru.job4j.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder(builderMethodName = "of")
public class Employee {
    @EqualsAndHashCode.Include
    private int id;
    private String name;
    private String surname;
    private int taxIdentifier;
    private LocalDateTime hireDate;
    private List<Person> persons;
}
