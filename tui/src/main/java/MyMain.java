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
        screen.putString(5,1,"Hello world!", Terminal.Color.RED, Terminal.Color.BLACK, ScreenCharacterStyle.Bold);
        screen.refresh();
        Thread.sleep(3000);
        screen.stopScreen();
    }
}
