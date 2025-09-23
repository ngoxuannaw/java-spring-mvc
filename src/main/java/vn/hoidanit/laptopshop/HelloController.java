package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello World with nn";
    }

    @GetMapping("/user")
    public String userpage() {
        return "only user can access";
    }

    @GetMapping("/admin")
    public String adminpage() {
        return "only admin can access";
    }
}
