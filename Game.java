import javax.swing.*;

public class Game {

  static int HEIGHT = 700;
  static int WIDTH = 350;

  public static void main(String[] args) {


    JFrame frame = new JFrame("Title...");
    frame.setSize(WIDTH,HEIGHT);

    Panel panel = new Panel();
    frame.add(panel);
    frame.addKeyListener(panel);

    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // positions frame to open in the center of screen
    frame.setVisible(true);

  }
}
