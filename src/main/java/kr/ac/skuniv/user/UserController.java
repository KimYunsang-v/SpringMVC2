package kr.ac.skuniv.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class UserController {



    @PostMapping("/put/user")
    public @ResponseBody String create(User user){
        System.out.println(user);



        return "create";
    }
}
