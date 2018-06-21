import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Cubes {

  public static void mainDraw(Graphics graphics) {
    int[]xy={256, 256};
    int level = 4;
    Hexagon (graphics, xy[0], xy[1], HEIGHT / 2);
    Cubes(graphics, xy[0], xy[1], HEIGHT / 4, level);

  }

  public static void Hexagon(Graphics graphics, int x, int y, int sideOfHexagon) {
    for (int i = 0; i < 6; i++) {
      graphics.drawLine(
              (int)(x + sideOfHexagon * Math.cos(i * Math.PI / 3)),
              (int)(y - sideOfHexagon * Math.sin(i * Math.PI / 3)),
              (int)(x + sideOfHexagon * Math.cos((i+1) * Math.PI / 3)),
              (int)(y - sideOfHexagon * Math.sin((i+1) * Math.PI / 3)));
    }
  }

  public static void Cubes(Graphics graphics, int x, int y, int sideOfHexagon, int level) {

    int xs[] = {x - sideOfHexagon / 2, x - sideOfHexagon / 2, x + sideOfHexagon};
    int ys[] = {(int)(y - sideOfHexagon * Math.sqrt(3.0) / 2), (int)(y + sideOfHexagon * Math.sqrt(3.0) / 2), y};

    for (int i = 0; i <3; i++) {
      Hexagon(graphics, xs[i],ys[i], sideOfHexagon );
      if (level > 1){
        Cubes(graphics, xs[i],ys[i], sideOfHexagon / 2, level - 1);
      }
    }
  }

  static int WIDTH = 450;
  static int HEIGHT = 450;

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
