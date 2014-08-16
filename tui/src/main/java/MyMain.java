package gs.nick;

import java.nio.charset.Charset;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.screen.*;
//import com.googlecode.lanterna.terminal.Color;


class MyMain {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting!");

        MyMain app = new MyMain();
        app.execute();
    }

    public void execute() throws Exception {

        Screen screen = TerminalFacade.createScreen();
        screen.startScreen();
        // draw something ???
        screen.putString(5,5,"Hello world!", Terminal.Color.Red, Terminal.Color.Green, false, false, false);
        screen.refresh();
        Thread.sleep(3000);
        screen.stopScreen();
    }
}
