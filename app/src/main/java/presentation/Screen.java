package presentation;

import jcurses.system.InputChar;
import jcurses.system.CharColor;
import jcurses.system.Toolkit;

public class Screen {
    public static void startScreen(){
        CharColor backgroundColor = new CharColor(CharColor.BLACK, CharColor.BLACK);
        CharColor textColor = new CharColor(CharColor.BLACK, CharColor.WHITE);

        Toolkit.clearScreen(backgroundColor);
    
        String[] strings = {
"          _____                   _______                   _____                    _____                    _____          ",
"         /\\    \\                 /::\\    \\                 /\\    \\                  /\\    \\                  /\\    \\         ",
"        /::\\    \\               /::::\\    \\               /::\\    \\                /::\\____\\                /::\\    \\        ",
"       /::::\\    \\             /::::::\\    \\             /::::\\    \\              /:::/    /               /::::\\    \\       ",
"      /::::::\\    \\           /::::::::\\    \\           /::::::\\    \\            /:::/    /               /::::::\\    \\      ",
"     /:::/\\:::\\    \\         /:::/~~\\:::\\    \\         /:::/\\:::\\    \\          /:::/    /               /:::/\\:::\\    \\     ",
"    /:::/__\\:::\\    \\       /:::/    \\:::\\    \\       /:::/  \\:::\\    \\        /:::/    /               /:::/__\\:::\\    \\    ",
"   /::::\\   \\:::\\    \\     /:::/    / \\:::\\    \\     /:::/    \\:::\\    \\      /:::/    /               /::::\\   \\:::\\    \\   ",
"  /::::::\\   \\:::\\    \\   /:::/____/   \\:::\\____\\   /:::/    / \\:::\\    \\    /:::/    /      _____    /::::::\\   \\:::\\    \\  ",
" /:::/\\:::\\   \\:::\\____\\ |:::|    |     |:::|    | /:::/    /   \\:::\\ ___\\  /:::/____/      /\\    \\  /:::/\\:::\\   \\:::\\    \\ ",
"/:::/  \\:::\\   \\:::|    ||:::|____|     |:::|    |/:::/____/  ___\\:::|    ||:::|    /      /::\\____\\/:::/__\\:::\\   \\:::\\____\\",
"\\::/   |::::\\  /:::|____| \\:::\\    \\   /:::/    / \\:::\\    \\ /\\  /:::|____||:::|____\\     /:::/    /\\:::\\   \\:::\\   \\::/    /",
" \\/____|:::::\\/:::/    /   \\:::\\    \\ /:::/    /   \\:::\\    /::\\ \\::/    /  \\:::\\    \\   /:::/    /  \\:::\\   \\:::\\   \\/____/ ",
"       |:::::::::/    /     \\:::\\    /:::/    /     \\:::\\   \\:::\\ \\/____/    \\:::\\    \\ /:::/    /    \\:::\\   \\:::\\    \\     ",
"       |::|\\::::/    /       \\:::\\__/:::/    /       \\:::\\   \\:::\\____\\       \\:::\\    /:::/    /      \\:::\\   \\:::\\____\\    ",
"       |::| \\::/____/         \\::::::::/    /         \\:::\\  /:::/    /        \\:::\\__/:::/    /        \\:::\\   \\::/    /    ",
"       |::|  ~|                \\::::::/    /           \\:::\\/:::/    /          \\::::::::/    /          \\:::\\   \\/____/     ",
"       |::|   |                 \\::::/    /             \\::::::/    /            \\::::::/    /            \\:::\\    \\         ",
"       \\::|   |                  \\::/____/               \\::::/    /              \\::::/    /              \\:::\\____\\        ",
"        \\:|   |                   ~~                      \\::/____/                \\::/____/                \\::/    /        ",
"         \\|___|                                                                     ~~                       \\/____/         ",
    };

        final int width = strings[0].length();
        final int height = strings.length;

        int rows = Toolkit.getScreenHeight();
        int cols = Toolkit.getScreenWidth();

        int shiftX = (cols - width) / 2;
        int shiftY = (rows - height) / 2;

        for (int i = 0; i < height; i++) {
            Toolkit.printString(strings[i], 100, -10, textColor);
        }

        String continueText = "Press any key to continue...";
        shiftX = (cols - continueText.length()) / 2;
        Toolkit.printString(continueText, 0, height + 1, textColor);

        Toolkit.readCharacter();



    }

    public void menuScreen() {

    }

    public void deadScreen() {

    }

    public void endgameScreen() {

    }
}