import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener, KeyListener{

  private static final long serialVersionUID = 490905409104883233L;
  public static final int TILE_SIZE = 50;
  public static final int ROWS = 12;
  public static final int COLUMNS = 18;
  public static final int NUM_COINS = 5;

  Player player;

  public Panel() {
    setBackground(new Color(100,100,100));
    player = new Player();

    Timer timer = new Timer(25,this);
    timer.start();

  }

  public void actionPerformed(ActionEvent e) {
    if (player.position.equals(new Point(0,0))) {
      //
    }
    repaint();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    player.show(g, this);
  }

  public void keyTyped(KeyEvent e) {
    //
  }

  public void keyPressed(KeyEvent e) {
    player.keyPressed(e);
  }

  public void keyReleased(KeyEvent e) {
    //
  }

}
