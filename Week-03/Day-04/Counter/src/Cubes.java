import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Cubes {

  public static void mainDraw(Graphics graphics) {
    int[]xy={300,300};
    int level=5;
    Hexagon (graphics, xy[0], xy[1], HEIGHT/2);
    Cubes(graphics, xy[0], xy[1], HEIGHT/4, level);

  }

  public static void Hexagon(Graphics graphics ,int x, int y, int a) {
    for (int i = 0; i <6; i++) {
      graphics.drawLine(
              (int)(x + a * Math.cos(i * Math.PI / 3)),
              (int)(y - a * Math.sin(i * Math.PI / 3)),
              (int)(x + a * Math.cos((i+1) * Math.PI / 3)),
              (int)(y - a * Math.sin((i+1) * Math.PI / 3)));
    }
  }

  public static void Cubes(Graphics graphics, int x, int y,int a, int level) {

    Hexagon(graphics, x - a/2,(int)(y - a * Math.sqrt(3.0) / 2),a);
    Hexagon(graphics, x - a/2,(int)(y + a * Math.sqrt(3.0) / 2),a);
    Hexagon(graphics, x + a, y ,a);

    if (level > 1){
      Cubes(graphics, x - a/2,(int)(y - a * Math.sqrt(3.0) / 2),a / 2, level-1);
      Cubes(graphics,x - a/2,(int)(y + a * Math.sqrt(3.0) / 2),a / 2, level-1);
      Cubes(graphics,x + a, y , a / 2, level-1);

    }


  }

  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT+23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
