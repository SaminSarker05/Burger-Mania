import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Map {
  //background image
  BufferedImage image;
  Point position;

  public Map() {
    loadGraphics();
    position = new Point(0,0);
  }

  public void loadGraphics() {
    try {
      image = ImageIO.read(new File("images/map.png"));
    }
    catch (IOException exc) {
      System.out.println("no open");
    }
  }
  //map does not move
  public void show(Graphics g, ImageObserver observer) {
    g.drawImage(image, position.x, position.y, observer);
  }

}
