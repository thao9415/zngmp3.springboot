package com.codegym.zingmp3.dto;

import com.codegym.zingmp3.model.User;

public class UserDto {
    private Integer id;
    private String name;
    private String email;

    public void copy(User item) {
        this.id = item.getId();
        this.name = item.getName();
        this.email = item.getEmail();
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
}
