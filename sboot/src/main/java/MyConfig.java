package gs.nick;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.context.embedded.*;

@Component
public class MyConfig implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer con) {
        int port = Integer.parseInt(System.getenv("PORT"));
        System.out.println("");
        System.out.println("PORT IS: " + port);
        System.out.println("");
        con.setPort( port );
    }
}

