package kr.ac.skuniv.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    List<User> users = new ArrayList<User>();


    @PostMapping("/create")
    public @ResponseBody String create(User user){
        System.out.println(user);
        users.add(user);

        return "create";
    }
}
