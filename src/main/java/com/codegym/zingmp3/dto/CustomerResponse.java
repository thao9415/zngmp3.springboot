package com.codegym.zingmp3.dto;

import java.util.List;

public class CustomerResponse {
    public String name;
    public List<UserDto> listUser;

    public CustomerResponse() {
    }

    public CustomerResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserDto> getListUser() {
        return listUser;
    }

    public void setListUser(List<UserDto> listUser) {
        this.listUser = listUser;
    }
}
