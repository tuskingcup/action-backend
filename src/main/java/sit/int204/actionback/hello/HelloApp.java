package sit.int204.actionback.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloApp {
    @GetMapping("")
    public String home() {
        return "Hello Docker World";
    }

}
