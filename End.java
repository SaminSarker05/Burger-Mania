import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class End extends JPanel implements ActionListener{

  Player player;
  Map map;

  public End() {
    setBackground(new Color(100,100,100)); //default color
    map = new Map();
    player = new Player();

    Timer timer = new Timer(25,this);
    timer.start();
  }

  public void actionPerformed(ActionEvent e) {
    repaint();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    map.show(g,this);
    draw(g);
  }

  //panel draws message to frame
  public void draw(Graphics g) {
    String text = "You Win!!!";
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

    graphics.drawString(text,130,300);
  }
}
