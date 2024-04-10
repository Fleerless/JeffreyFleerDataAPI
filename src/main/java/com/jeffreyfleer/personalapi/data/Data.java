package com.jeffreyfleer.personalapi.data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Data {
    @Id
    @SequenceGenerator(
            name = "data_sequence",
            sequenceName = "data_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "data_sequence"
    )
    private Long id;
    private String name;
    @Transient
    private Integer age;
    private LocalDate birthdate;
    private String email;

    public Data() {
    }

    public Data(Long id, String name, LocalDate birthdate, String email) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.email = email;
    }

    public Data(String name, LocalDate birthdate, String email) {
        this.name = name;
        this.birthdate = birthdate;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                '}';
    }
}

