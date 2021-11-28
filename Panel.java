import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener, KeyListener{

  private static final long serialVersionUID = 490905409104883233L;

  Player player;
  Map map;

  public Panel() {
    setBackground(new Color(100,100,100));
    map = new Map();
    player = new Player();

    Timer timer = new Timer(25,this);
    timer.start();

  }

  public void actionPerformed(ActionEvent e) {
    if (player.position.y >= 400) {
      map.position.translate(0,-2);
    }

    if (player.position.y == 0) {
      map.position.translate(0,2);
    }
    repaint();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    map.show(g,this);
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
