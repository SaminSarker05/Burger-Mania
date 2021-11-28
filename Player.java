import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player {
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();

    if (key == 87) {
      System.out.println("W");
    }
    if (key == 65) {
      System.out.println("A");
    }
    if (key == 83) {
      System.out.println("S");
    }
    if (key == 68) {
      System.out.println("D");
    }

  }
}
