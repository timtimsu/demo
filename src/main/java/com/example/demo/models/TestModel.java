package com.example.demo.models;

import javax.persistence.*;

/**
 * @author timtims
 * @date 19.09.2020
 */
@Entity
@Table(name = "test", schema = "test")
public class TestModel {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="test_seq")
    @SequenceGenerator(name="test_seq", schema = "test",
            sequenceName="test_seq", allocationSize = 1)
    @Column(name = "id") private Long id;
    @Column(name = "llichnost_id") Long personId;
    @Column(name = "login") String login;
    @Column(name = "password") String password;

    @OneToOne(mappedBy="account")
    private Person person;

    public TestModel() {}

    public TestModel(Long personId, String login, String password) {
        this.personId = personId;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
