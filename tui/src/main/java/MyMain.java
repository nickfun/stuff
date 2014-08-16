package gs.nick;

import java.nio.charset.Charset;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.screen.*;
//import com.googlecode.lanterna.terminal.Color;

class MyMain {

    private GUIScreen gui;

    public static void main(String[] args) throws Exception {
        System.out.println("Starting!");

        MyMain app = new MyMain();
        app.execute();
    }

    public void execute() throws Exception {
        setup();
        
        ScreenWriter sw = new ScreenWriter(gui.getScreen());
        sw.setBackgroundColor(Terminal.Color.WHITE);
        sw.setForegroundColor(Terminal.Color.RED);
        sw.drawString(5, 2, "Hello World!");
        gui.getScreen().refresh();
        Thread.sleep(4000);
        teardown();
    }

    public void setup() {
        gui = TerminalFacade.createGUIScreen();
        gui.getScreen().startScreen();
        gui.setTitle("TUI is Best UI");
    }

    public void teardown() {
        gui.getScreen().stopScreen();
    }
}
