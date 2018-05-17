import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainBowBoxes {

    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.


  public static void mainDraw(Graphics graphics) {
    for (int i = 200; i >0; i-=10) {
      Rectangle(graphics, i, color(graphics));
    }
  }

  public static void Rectangle(Graphics graphics, int a, Color color) {

    graphics.setColor(color);
    int b=a;
    int x0=WIDTH/2-a/2;
    int y0=(HEIGHT-23)/2-b/2;

    graphics.fillRect(x0, y0 , a, b);
    }

  public static Color color(Graphics graphics) {
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    return new Color(r,g,b);
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
