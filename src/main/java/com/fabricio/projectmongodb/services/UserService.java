package com.fabricio.projectmongodb.services;

import com.fabricio.projectmongodb.domain.User;
import com.fabricio.projectmongodb.dto.UserDTO;
import com.fabricio.projectmongodb.repository.UserRepository;
import com.fabricio.projectmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User update (User obj){
        User newobj = findById(obj.getId());
        updateData(newobj, obj);
        return repo.save(newobj);
    }

    public void updateData(User newObj, User oldObj) {
        newObj.setName(oldObj.getName());
        newObj.setEmail(oldObj.getEmail());
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(),objDto.getName(),objDto.getEmail());
    }

}
