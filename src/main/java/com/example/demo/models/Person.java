package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

/**
 * @author timtims
 * @date 26.09.2020
 */
@Entity
@Table(name = "person", schema = "test")
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="person_seq")
    @SequenceGenerator(name="person_seq", schema = "test",
            sequenceName="person_seq", allocationSize = 1)
    @Column(name = "id") private Long id;
    @Column(name = "surname") private String surName;
    @Column(name = "name") private String name;
    @Column(name = "patronyc") private String patronyc;
    @Column(name = "birthday") private Date borthday;

    @OneToOne()
    @JoinColumn(name="id")
    private TestModel account;

    public TestModel getAccount() {
        return account;
    }

    public Person() { }

    public Person(String surName, String name, String patronyc) {
        this.surName = surName;
        this.name = name;
        this.patronyc = patronyc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronyc() {
        return patronyc;
    }

    public void setPatronyc(String patronyc) {
        this.patronyc = patronyc;
    }

    public Date getBorthday() {
        return borthday;
    }

    public void setBorthday(Date borthday) {
        this.borthday = borthday;
    }
}
