package com.aula.workshopmongo.services;

import com.aula.workshopmongo.domain.User;
import com.aula.workshopmongo.dto.UserDTO;
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

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User update(User obj) {
        Optional<User> userOptional = repo.findById(obj.getId());
        User newObj = userOptional.orElseThrow(() -> new ObjectNotFounException("Object not found"));
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());

    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
