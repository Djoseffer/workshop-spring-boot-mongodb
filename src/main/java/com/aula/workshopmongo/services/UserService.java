package com.aula.workshopmongo.services;

import com.aula.workshopmongo.domain.User;
import com.aula.workshopmongo.services.exception.ObjectNotFounException;
import com.aula.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> userOptional = repo.findById(id);
        return userOptional.orElseThrow(() -> new ObjectNotFounException("Object not found"));
    }

}
