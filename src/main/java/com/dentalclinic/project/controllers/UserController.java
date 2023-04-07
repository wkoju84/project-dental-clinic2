package com.dentalclinic.project.controllers;

import com.dentalclinic.project.entities.User;
import com.dentalclinic.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public User save(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "acess level") Integer acessLevel){
        return service.save(new User(id, name, email, password, acessLevel));
    }

    @GetMapping("/search")
    public List<User> searchAll(){
        return service.searchAll();
    }

    @GetMapping("/{id}")
    public String exclude(@PathVariable Integer id){
        return service.exclude(id);
    }
}
