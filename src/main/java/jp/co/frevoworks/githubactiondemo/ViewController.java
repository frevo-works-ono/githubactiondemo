package jp.co.frevoworks.githubactiondemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class ViewController {

    @GetMapping
    public String hello() {
        return "index";
    }

}