package com.aula.workshopmongo.dto;

import com.aula.workshopmongo.domain.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class UserDTO implements Serializable {
    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
