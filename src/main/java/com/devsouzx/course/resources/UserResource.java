package com.devsouzx.course.resources;

import com.devsouzx.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findUser() {
        User u = new User(1L, "joao", "joaoemanuel2215@gmail.com", "99999999", "345456");
        return ResponseEntity.ok(u);
    }
}
