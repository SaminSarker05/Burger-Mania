import javax.swing.*;
import java.awt.*;

public class Game {

  static int HEIGHT = 700;
  static int WIDTH = 350;
  static JPanel main;
  static CardLayout cardLayout;


  public static void main(String[] args) {
    cardLayout = new CardLayout();

    JFrame frame = new JFrame("Burger Mania!");
    frame.setSize(WIDTH,HEIGHT);

    main = new JPanel(cardLayout);



    Panel pane = new Panel();
    End end = new End();

    main.add(pane, "pane");
    main.add(end, "end");



    cardLayout.show(main, "pane");

    frame.add(main);
    frame.addKeyListener(pane);

    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // positions frame to open in the center of screen
    frame.setVisible(true);

  }
}
