import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;

public class Panel extends JPanel implements ActionListener, KeyListener{

  private static final long serialVersionUID = 490905409104883233L;
  private Timer timer;

  public Panel() {
    setBackground(new Color(200,100,100));
    Player player = new Player();

  }


  public void actionPerformed(ActionEvent e) {
    System.out.println("s");
  }

  public void keyTyped(KeyEvent e) {
    //
  }

  public void keyPressed(KeyEvent e) {
    //
  }

  public void keyReleased(KeyEvent e) {
    //
  }

}
