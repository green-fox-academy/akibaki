import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.

  public static void mainDraw(Graphics graphics) {
    int[][]xy0={{25,25},{154,25},{234,153}};
    for (int[]coo : xy0) {
      Rectangle(graphics, coo[0],coo[1]);
    }

  }

  public static void Rectangle(Graphics graphics, int x0, int y0) {
    int a=50;
    int b=50;

    int x1 = x0;
    int y1 = y0;
    int x2 = 0;
    int y2 = 0;


    for (int i = 0; i <4; i++) {
      x2=x1+(int)(Math.sin(Math.PI*i/2)*a);
      y2=y1+(int)(Math.cos(Math.PI*i/2)*b);
      cc(graphics);
      graphics.drawLine(x1, y1, x2, y2);
      x1=x2;
      y1=y2;
    }
  }
  public static void cc(Graphics graphics) {
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    graphics.setColor(new Color(r, g, b));
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
