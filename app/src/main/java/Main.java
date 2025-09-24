import jcurses.system.*;
import sun.misc.Signal;

public class Main {
    public static void main(String[] args){
        // int y = 0;
        // CharColor color = new CharColor(CharColor.BLACK, CharColor.WHITE);
        // Toolkit.init();
        // while (true) {
        //     InputChar c = Toolkit.readCharacter();
        //     if ('q' == c.getCharacter())
        //         break;
        //     Toolkit.printString(String.format("c : %c", c.getCharacter()), 0, y++, color);
        // }
        // Toolkit.shutdown();

        String[] test_args = {"Hello", "World"};
        
        try
        {
            MainWindow.main(test_args);
        }
        catch (Exception e) {
            
        }
    }
}
