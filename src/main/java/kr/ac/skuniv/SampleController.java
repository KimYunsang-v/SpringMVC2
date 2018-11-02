package kr.ac.skuniv;

import kr.ac.skuniv.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello(Model model){
        /*model.addAttribute("name","yunsang");
        return "hello";*/
        throw new SampleException();
    }

    @GetMapping("/login")
    public @ResponseBody String login(String id, String pw){
        System.out.println("id = " + id + "   pw = " + pw);

        return "login";
    }
}