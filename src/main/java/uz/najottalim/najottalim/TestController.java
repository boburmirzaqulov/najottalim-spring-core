package uz.najottalim.najottalim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    @Qualifier("get")
    Student get;

    @GetMapping("/hello")
    public String get() {
        return "<h1>" + get.getName() + "</h1>";
    }
}
