package gs.nick;

import java.nio.charset.Charset;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.terminal.*;

class MyMain {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting!");

        MyMain app = new MyMain();
        app.execute();
    }

    public void execute() throws Exception {

        Terminal term = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        term.enterPrivateMode();
        System.out.println("hello");
        Thread.sleep(3000);
        term.exitPrivateMode();
    }
}
