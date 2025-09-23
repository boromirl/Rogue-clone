import jcurses.system.*;
import jcurses.widgets.*;
import jcurses.util.*;
import jcurses.event.*;

public class MainWindow extends Window implements ItemListener, ActionListener,
    ValueChangedListener, WindowListener, WidgetsConstants {
  static MainWindow window = null;
  static TextField textfield = null;
  static Button button = null;

  public MainWindow(int width, int height) {
    super(width, height, true, "JCurses Test");
  }

  public static void main(String[] args) throws Exception {
    window = new MainWindow(30, 20);
    window.init();
  }

  public void init() {
    DefaultLayoutManager mgr = new DefaultLayoutManager();
    mgr.bindToContainer(window.getRootPanel());
    mgr.addWidget(
        new Label("Hello World!",
                  new CharColor(CharColor.WHITE, CharColor.GREEN)),
                  0, 0, 20, 10,
                  WidgetsConstants.ALIGNMENT_CENTER,
                  WidgetsConstants.ALIGNMENT_CENTER);

    textfield = new TextField(10);
    mgr.addWidget(textfield, 0, 0, 20, 20,
        WidgetsConstants.ALIGNMENT_CENTER,
        WidgetsConstants.ALIGNMENT_CENTER);

    button = new Button("Quit");
    mgr.addWidget(button, 0, 0, 20, 30,
        WidgetsConstants.ALIGNMENT_CENTER,
        WidgetsConstants.ALIGNMENT_CENTER);

    button.setShortCut('q');
    button.addListener(this);
    window.addListener((WindowListener) this);
    window.show();
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    Widget w = event.getSource();
    if (w == button) {
      new Message("HowTo", "You are about to quit", "OK").show();
      window.close();
    }
  }

  @Override
  public void stateChanged(ItemEvent e) {  }

  @Override
  public void valueChanged(ValueChangedEvent e) {  }

  @Override
  public void windowChanged(WindowEvent event) {
    if (event.getType() == WindowEvent.CLOSING) {
      event.getSourceWindow().close();
      // Toolkit.clearScreen(new CharColor(CharColor.WHITE, CharColor.BLACK));
    }
  }
}