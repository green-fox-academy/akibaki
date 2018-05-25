import javafx.scene.shape.Polyline;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochSnowFlake {

  public static void mainDraw(Graphics graphics) {
    int[]xy={50, 150};
    int level=5;
    int a = HEIGHT / 3;
    Element (graphics, xy[0], xy[1], 0, a , level);
    Element (graphics, xy[0]+ a * 3 , xy[1], -(2  * Math.PI / 3),a, level);
    Element (graphics, xy[0] + a * 3 / 2, xy[1] + a * Math.sqrt(0.75) * 3, -(4  * Math.PI / 3),a, level);

  }

  public static void Element(Graphics graphics ,double x, double y, double orient, int a, int level) {

    double dx = (a * Math.cos(orient));
    double dy = (a * Math.sin(orient));
    double x2 = (x + dx + a * Math.cos(orient + Math.PI/3));
    double y2 = (y - dy - a * Math.sin(orient + Math.PI/3));


    double xs[] = {x ,  x + dx, x2,  x + 2 * dx, x + 3 * dx};
    double ys[] = { y ,  y - dy, y2, y - 2 * dy,  y - 3 * dy};

    if (level > 1) {
      for (int i = 0; i < 4; i++) {
        double orient2;
        if (i == 1){ orient2 = orient + Math.PI/3; }
        else if (i == 2){ orient2 = orient - Math.PI/3; }
        else {orient2 = orient;}
        Element(graphics, xs[i], ys[i], orient2,a/3, level-1);
      }
    } else{
      graphics.drawLine(
              (int)(Math.round(xs[0])),
              (int)(Math.round(ys[0])),
              (int)(Math.round(xs[4])),
              (int)(Math.round(ys[4])));
    }

  }



  static int WIDTH = 486;
  static int HEIGHT = 486;

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