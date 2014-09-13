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
        if (System.getenv("PORT") == null) {
            System.out.println("");
            System.out.println("PORT IS NULL! FALLBACK TO DEFAULT!!");
            System.out.println("");
            return;
        }
        int port = Integer.parseInt(System.getenv("PORT"));
        System.out.println("");
        System.out.println("gs.nick.MyConfig SETTING PORT: " + port);
        System.out.println("");
        con.setPort( port );
    }
}

