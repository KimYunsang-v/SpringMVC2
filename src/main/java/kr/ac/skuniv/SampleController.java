package kr.ac.skuniv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {


    @GetMapping("/hello")
    public String hello(Model model){
        /*model.addAttribute("name","yunsang");
        return "hello";*/
        throw new SampleException();
    }
}