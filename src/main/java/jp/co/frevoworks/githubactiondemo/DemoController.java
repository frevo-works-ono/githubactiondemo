package jp.co.frevoworks.githubactiondemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello, GitHub Actions.";
    }

}