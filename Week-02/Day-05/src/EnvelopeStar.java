import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static int n=16;
  public static int pitch = 15;
  public static int size = 14;
  public static int[] xy0 = new int[]{200,200};


  public static void mainDraw(Graphics graphics) {


    graphics.setColor(Color.green);
    for (int i = 0; i <n; i++) {
      double anglepitch=360.0/n;
      nets(graphics, i*anglepitch, anglepitch, xy0[0], xy0[1]);
    }
  }

  public static void nets(Graphics graphics, double orient,double anglepitch, int x0, int y0) {

    for (int i = 0; i != size; i++) {

      graphics.drawLine(
              (int)(x0-pitch*i*Math.sin(orient*Math.PI/180)),
              (int)(y0-pitch*i*Math.cos(orient*Math.PI/180)),
              (int)(x0-pitch*(size-i)*Math.sin((orient+anglepitch)*Math.PI/180)),
              (int)(y0-pitch*(size-i)*Math.cos((orient+anglepitch)*Math.PI/180)));
    }
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
