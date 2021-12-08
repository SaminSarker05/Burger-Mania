// music

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener, KeyListener{

  private static final long serialVersionUID = 490905409104883233L;

  Player player;
  Map map;
  int score = 0;
  Alien alien1, alien2, alien3, alien4;

  int[] a1 = new int[2];
  int[] a2 = new int[2];
  int[] a3 = new int[2];
  int[] a4 = new int[2];


  public Panel() {
    setBackground(new Color(100,100,100));
    map = new Map();
    player = new Player();
    alien1 = new Alien(200,200);

    a1[0] = alien1.position.x;
    a1[1] = alien1.position.y;

    alien2 = new Alien( (int) (Math.random() * 230 + 1),  (int) (Math.random() * 540 + 1));

    a2[0] = alien2.position.x;
    a2[1] = alien2.position.y;

    alien3 = new Alien( (int) (Math.random() * 230 + 1),  (int) (Math.random() * 540 + 1));

    a3[0] = alien3.position.x;
    a3[1] = alien3.position.y;

    alien4 = new Alien( (int) (Math.random() * 230 + 1),  (int) (Math.random() * 540 + 1));

    a4[0] = alien4.position.x;
    a4[1] = alien4.position.y;

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



  public static boolean closeEnough(double a, double b) {

   if (a == 0.0 && b == 0.0) {
     return true;
   }

   double percent = (a-b)/a * 100;

   if (Math.abs(percent) <= 16 ) {
     return true;
   }
   return false;
 }

  public void displayScore() {
    if (closeEnough(player.position.getX(), a1[0]) && closeEnough(player.position.getY(), a1[1])) {
      a1[0] = -100;
      a1[1] = -100;
      alien1.position.setLocation(-100,-100);
      score++;
    }

    if (closeEnough(player.position.getX(), a2[0]) && closeEnough(player.position.getY(), a2[1])) {
      a2[0] = -100;
      a2[1] = -100;
      alien2.position.setLocation(-100,-100);
      score++;
    }

    if (closeEnough(player.position.getX(), a3[0]) && closeEnough(player.position.getY(), a3[1])) {
      a3[0] = -100;
      a3[1] = -100;
      alien3.position.setLocation(-100,-100);
      score++;
    }

    if (closeEnough(player.position.getX(), a4[0]) && closeEnough(player.position.getY(), a4[1])) {
      a4[0] = -100;
      a4[1] = -100;
      alien4.position.setLocation(-100,-100);
      score++;
    }

    if (score == 4) {
      System.out.println("you win!!");
      score = 0;
      Game.cardLayout.show(Game.main, "end");
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
    graphics.setFont(new Font("PT Mono", Font.PLAIN, 20));
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
