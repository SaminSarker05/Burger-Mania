import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Alien {

  BufferedImage image;
  Point position;

  //alien has x and y position on board
  public Alien(int x, int y) {
    loadGraphics();
    position = new Point(x,y);
  }

  //loads alien image
  public void loadGraphics() {
    try {
      image = ImageIO.read(new File("images/alien.png"));
    }
    catch (IOException exc) {
      System.out.println("no open");
    }
  }

  public void show(Graphics g, ImageObserver observer) {
    g.drawImage(image, position.x, position.y, observer);
  }

}
