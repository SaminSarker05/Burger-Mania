import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player {

  BufferedImage image;
  Point position;

  public Player() {
    loadGraphics();
    position = new Point(140,90);
  }

  public void loadGraphics() {
    try {
      image = ImageIO.read(new File("images/player.png"));
    }
    catch (IOException exc) {
      System.out.println("no open");
    }
  }

  public void show(Graphics g, ImageObserver observer) {
    g.drawImage(image, position.x, position.y, observer);
  }


  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();

    //W
    if (key == 87) {
      position.translate(0, -10);
    }
    //A
    if (key == 65) {
      position.translate(-10, 0);
    }
    //S
    if (key == 83) {
      position.translate(0, 10);
    }
    //D
    if (key == 68) {
      position.translate(10, 0);
    }
  }
}
