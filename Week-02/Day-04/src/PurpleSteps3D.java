import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {

  // Reproduce this:
  // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

  public static int a=1;
  public static int b=1;
  public static int n=20;
  public static int step1=1;
  public static int step2=1;



  public static void mainDraw(Graphics graphics) {

    graphics.setColor(new Color(128,0,128));
    int x0=0;
    int y0=0;
    for (int i = 0; i <n; i++) {

      Rectangle(graphics, x0, y0);
      x0+=a;
      y0+=b;
      a=a+step1;
      b=b+step2;
    }

  }

  public static void Rectangle(Graphics graphics, int x0, int y0) {

    graphics.fillRect(x0, y0 , a, b);
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

