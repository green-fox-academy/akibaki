import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void cc(Graphics graphics) {
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    graphics.setColor(new Color(r, g, b));
  }
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.
    for (int i = 0; i <4; i++) {
      cc(graphics);
      int x0 = (int)(Math.random()*WIDTH);
      int y0 = (int)(Math.random()*(HEIGHT - 23));
      int a = (int)(Math.random() * (WIDTH-x0));
      int b = (int)(Math.random() * ((HEIGHT - 23)-y0));

      graphics.fillRect(x0, y0 , a, b);
    }


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
