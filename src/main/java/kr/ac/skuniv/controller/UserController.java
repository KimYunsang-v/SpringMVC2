package kr.ac.skuniv.controller;

import kr.ac.skuniv.exception.ResouceNotFoundException;
import kr.ac.skuniv.model.User;
import kr.ac.skuniv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllNotes() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createNote(@Valid @RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable(value = "userId") String userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResouceNotFoundException("User", "userId", userId));
    }

    @PutMapping("/users/{userId}")
    public User updateUser(@PathVariable(value = "userId") String userId, @Valid @RequestBody User userDetails) {
        User user = userRepository.findById(userId)
                .orElseThrow(()->new ResouceNotFoundException("User", "userId", userId));

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());

        User updateUser = userRepository.save(user);

        return updateUser;
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "userId") String userId) {
        User user = userRepository.findById((userId))
                .orElseThrow(()->new ResouceNotFoundException("User", "userId", userId));

        userRepository.delete(user);

        return ResponseEntity.ok().build();
    }

}
