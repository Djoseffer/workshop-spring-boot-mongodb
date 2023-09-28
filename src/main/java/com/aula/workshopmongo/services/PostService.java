package com.aula.workshopmongo.services;

import com.aula.workshopmongo.domain.Post;
import com.aula.workshopmongo.domain.User;
import com.aula.workshopmongo.dto.UserDTO;
import com.aula.workshopmongo.repository.PostRepository;
import com.aula.workshopmongo.repository.UserRepository;
import com.aula.workshopmongo.services.exception.ObjectNotFounException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> userOptional = repo.findById(id);
        return userOptional.orElseThrow(() -> new ObjectNotFounException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }
    }