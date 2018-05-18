import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.int
    int a=200;
    int b=100;
    int x0=200;
    int y0=200;
    double alpha= 323.0;

    int x1 = x0;
    int y1 = y0;
    int x2 = 0;
    int y2 = 0;


    for (int i = 0; i <4; i++) {
      x2=x1+(int)(Math.sin(Math.PI*i/2) * Math.cos((alpha/180)*Math.PI)*a) - (int)(Math.cos(Math.PI*i/2)*(Math.sin((alpha/180)*Math.PI)*b));
      y2=y1+(int)(Math.cos(Math.PI*i/2) * Math.cos((alpha/180)*Math.PI)*b) + (int)(Math.sin(Math.PI*i/2)*(Math.sin((alpha/180)*Math.PI)*a));
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

  // Don't touch the code below
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }

}
