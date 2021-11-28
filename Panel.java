import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener, KeyListener{

  private static final long serialVersionUID = 490905409104883233L;

  Player player;

  public Panel() {
    setBackground(new Color(200,100,100));
    player = new Player();

    Timer timer = new Timer(25,this);
    timer.start();


  }


  public void actionPerformed(ActionEvent e) {
    repaint();


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
