package gs.nick;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.context.embedded.*;

@Controller
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, World! This is my Sprin Boot thing :-)";
    }

    public static void main( String[] args) throws Exception {

        int port, system_port;
        if (null == System.getenv("PORT")) {
            port = -1;
        } else {
            port = Integer.parseInt(System.getenv("PORT"));
        }
        if (null == System.getenv("SYSTEM_PORT")) {
            system_port = -1;
        } else {
            system_port = Integer.parseInt(System.getenv("SYSTEM_PORT"));
        }
        System.out.println("");
        System.out.println("PORT = " + port + "\tSYSTEM_PORT = " + system_port);
        System.out.println("");

        SpringApplication.run(Hello.class, args);
    }

}

