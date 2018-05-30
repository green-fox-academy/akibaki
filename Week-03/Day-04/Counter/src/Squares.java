import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

  public static void mainDraw(Graphics graphics) {
    graphics.drawRect(0, 0,WIDTH, HEIGHT);
    int[]xy={0,0};
    int level=7;
    Squares(graphics, xy[0],xy[1], HEIGHT/3, level);

  }

  public static void Squares(Graphics graphics, int x, int y,int a, int level) {

      graphics.drawRect(x,y+a,a,a);
      graphics.drawRect(x + a,  y+ 2 * a,a,a);
      graphics.drawRect(x + a, y, a, a);
      graphics.drawRect(x + 2 * a,y + a, a, a);

      if (level > 1){
        Squares(graphics, x,y+a,a / 3, level-1);
        Squares(graphics,x + a,y+2 * a,a / 3, level-1);
        Squares(graphics,x + a, y, a / 3, level-1);
        Squares(graphics,x + 2 * a,y + a, a / 3, level-1);
      }


  }
  static int WIDTH = 729;
  static int HEIGHT = 729;

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
