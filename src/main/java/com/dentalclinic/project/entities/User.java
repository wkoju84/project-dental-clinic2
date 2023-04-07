package com.dentalclinic.project.entities;

public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Integer acessLevel;

    public User() {
    }

    public User(Integer id, String name, String email, String password, Integer acessLevel) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.acessLevel = acessLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAcessLevel() {
        return acessLevel;
    }

    public void setAcessLevel(Integer acessLevel) {
        this.acessLevel = acessLevel;
    }
}
