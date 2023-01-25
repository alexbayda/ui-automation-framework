package com.figma.beta.testdatalayer.builder;

import com.figma.beta.testdatalayer.dto.UserDto;

public class UserBuilder {

    public UserDto user = new UserDto();

    public UserDto make() {
        return user;
    }

    public UserBuilder setName(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder setSurname(String surname) {
        user.setSurname(surname);
        return this;
    }

    public UserBuilder setPassword(String password) {
        user.setPassword(password);
        return this;
    }

    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }
}

