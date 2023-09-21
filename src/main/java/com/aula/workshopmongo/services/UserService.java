package com.aula.workshopmongo.services;

import com.aula.workshopmongo.domain.User;
import com.aula.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> findALL(){
return repo.findAll();
    }
}
