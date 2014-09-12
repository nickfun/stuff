package gs.nick;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, World! This is my Sprin Boot thing :-)";
    }

    public static void main( String[] args) throws Exception {
        SpringApplication.run(Hello.class, args);
    }

}

