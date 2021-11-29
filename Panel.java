// make alien placement random
// make func to determine if player close to alien
// music
// win page

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener, KeyListener{

  private static final long serialVersionUID = 490905409104883233L;

  Player player;
  Map map;
  int score = 0;
  Alien alien1, alien2, alien3, alien4;

  public Panel() {
    setBackground(new Color(100,100,100));
    map = new Map();
    player = new Player();
    alien1 = new Alien(130,140);
    alien2 = new Alien(300,400);
    alien3 = new Alien(70,600);
    alien4 = new Alien(200,500);


    Timer timer = new Timer(25,this);
    timer.start();

  }

  public void actionPerformed(ActionEvent e) {
    checkBorders();
    displayScore();
    repaint();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    map.show(g,this);
    alien1.show(g,this);
    alien2.show(g,this);
    alien3.show(g,this);
    alien4.show(g,this);
    player.show(g,this);

    drawScore(g);
  }

  public void displayScore() {
    if (player.position.equals(alien1.position)) {
      score++;
      alien1.position.setLocation(-100,-100);
    }
  }

  public void drawScore(Graphics g) {
    String text = "Score: " + score;
    Graphics2D graphics = (Graphics2D) g;
    graphics.setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics.setRenderingHint(
        RenderingHints.KEY_RENDERING,
        RenderingHints.VALUE_RENDER_QUALITY);
    graphics.setRenderingHint(
        RenderingHints.KEY_FRACTIONALMETRICS,
        RenderingHints.VALUE_FRACTIONALMETRICS_ON);
    graphics.setColor(new Color(234, 182, 118));
    graphics.setFont(new Font("PT Mono", Font.PLAIN, 18));
    FontMetrics metrics = graphics.getFontMetrics(graphics.getFont());
    Rectangle rect = new Rectangle(0,0,0,0);

    graphics.drawString(text,10,20);
  }

  public void checkBorders() {
    if (player.position.y >= Game.HEIGHT- 90) {
      player.position.y = Game.HEIGHT - 90 - 1;
    }

    if (player.position.y < 0) {
      player.position.y = 0;
    }


    if (player.position.x < 0) {
      player.position.x = 0;
    } else if (player.position.x >= Game.WIDTH-55) {
      player.position.x = Game.WIDTH - 55 - 1;
    }
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
