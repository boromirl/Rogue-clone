import jcurses.system.*;
import jcurses.widgets.*;
import jcurses.util.*;
import jcurses.event.*;
import sun.misc.*;

public class Main {
    public static void main(String[] args) {
        Toolkit.init();

        final CharColor charColor = new CharColor(CharColor.WHITE, CharColor.RED);
        Toolkit.printString("Hello world", 0, 0, charColor);

        try {
            Thread.sleep(10000);  // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            // Handle interruption if needed
            Thread.currentThread().interrupt(); // Restore interrupt flag
        }

        Toolkit.shutdown();
    }
}