import javax.swing.*;

public class Game {

  public static void main(String[] args) {

    JFrame frame = new JFrame("Title...");
    frame.setSize(350,350);

    Panel panel = new Panel();
    frame.add(panel);
    frame.addKeyListener(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // positions frame to open in the center of screen
    frame.setVisible(true);

  }
}
