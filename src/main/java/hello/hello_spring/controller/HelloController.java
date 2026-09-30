package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // hello 경로
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        // resources:templates/ + {ViewName} + .html
        return "hello"; // ViewName이 hello
    }
}
