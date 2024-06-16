import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;

public class Car extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        drawCar(g2);
    }

    private void drawCar(Graphics2D g2) {
        drawCarBody(g2);
        drawWheels(g2);
        drawWheelArches(g2);
        drawRearPart(g2);
        drawFrontPart(g2);
        drawWindows(g2);
    }

    private void drawCarBody(Graphics2D g2) {
        // Paint the car body
        g2.setColor(Color.YELLOW);
        g2.setStroke(new BasicStroke(14));
        g2.drawLine(220, 316, 210, 316);
        g2.drawLine(365, 316, 380, 316);

        g2.setStroke(new BasicStroke(18));
        int[] xp5 = {220, 233, 255, 275, 295, 320, 420, 440, 470, 500, 530, 555, 565, 575};
        int[] yp5 = {305, 282, 258, 243, 237, 231, 231, 230, 240, 254, 276, 296, 305, 315};
        g2.drawPolyline(xp5, yp5, 14);

        g2.setStroke(new BasicStroke(22));
        g2.drawLine(375, 231, 375, 305);

        g2.setStroke(new BasicStroke(5));
        g2.drawLine(567, 320, 584, 320);

        g2.setStroke(new BasicStroke(14));
        g2.setColor(Color.YELLOW);
        g2.drawArc(181, 391, 138, 138, 10, 160);
        g2.drawArc(581, 391, 138, 138, 10, 160);

        g2.setStroke(new BasicStroke(10));
        g2.draw(new QuadCurve2D.Double(153, 452, 129, 425, 159, 414));

        int[] xp3 = {588, 312, 312, 285, 251, 230, 193, 188, 153, 144, 152, 161, 175, 182, 183, 203, 594, 722, 724, 726, 730, 748, 781, 793, 791, 772, 713, 711, 664, 624, 600, 585};
        int[] yp3 = {458, 456, 416, 393, 394, 390, 418, 458, 458, 424, 413, 381, 381, 375, 330, 322, 322, 361, 374, 376, 380, 392, 392, 415, 433, 457, 458, 416, 390, 395, 410, 425};
        g2.fillPolygon(xp3, yp3, 32);
        g2.fillOval(174, 333, 12, 16);

        g2.setColor(Color.RED);
        g2.fillOval(162, 353, 22, 31);
    }

    private void drawWheels(Graphics2D g2) {
        // Draw the wheels
        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.BLACK);
        g2.fillOval(197, 407, 106, 106);
        g2.fillOval(597, 407, 106, 106);

        g2.setColor(Color.WHITE);
        g2.fillOval(225, 435, 50, 50);
        g2.fillOval(625, 435, 50, 50);
    }

    private void drawWheelArches(Graphics2D g2) {
        // Draw the wheel arches
        g2.setColor(Color.BLACK);
        g2.drawArc(190, 400, 120, 120, 0, 180);
        g2.drawArc(590, 400, 120, 120, 0, 180);
        g2.drawLine(310, 460, 590, 460);
    }

    private void drawRearPart(Graphics2D g2) {
        // Draw the rear part of the car
        g2.drawLine(190, 460, 150, 460);
        g2.draw(new QuadCurve2D.Double(149, 459, 120, 425, 150, 410));
        g2.drawLine(150, 410, 160, 380);
        g2.draw(new QuadCurve2D.Double(165, 380, 185, 385, 180, 350));
        g2.drawLine(179, 350, 171, 350);
        g2.draw(new QuadCurve2D.Double(165, 380, 150, 380, 170, 350));
        g2.drawArc(171, 320, 80, 60, 110, 70);
        g2.draw(new QuadCurve2D.Double(200, 320, 240, 220, 330, 220));
    }

    private void drawFrontPart(Graphics2D g2) {
        // Draw the front part of the car
        g2.drawLine(710, 460, 770, 460);
        g2.draw(new QuadCurve2D.Double(770, 460, 820, 420, 770, 380));
        g2.draw(new QuadCurve2D.Double(770, 380, 680, 340, 590, 320));
        g2.draw(new QuadCurve2D.Double(780, 390, 725, 395, 725, 362));
        g2.draw(new QuadCurve2D.Double(590, 320, 505, 225, 420, 220));
        g2.drawLine(420, 220, 330, 220);
    }

    private void drawWindows(Graphics2D g2) {
        // Draw the windows
        int[] xp1 = {225, 362, 362, 330};
        int[] yp1 = {320, 320, 238, 238};
        g2.drawPolyline(xp1, yp1, 4);
        g2.draw(new QuadCurve2D.Double(330, 238, 265, 242, 225, 318));

        int[] xp2 = {567, 388, 388, 420};
        g2.drawPolyline(xp2, yp1, 4);
        g2.draw(new QuadCurve2D.Double(420, 238, 490, 235, 565, 317));
        g2.drawLine(390, 340, 410, 340);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Автомобиль");
        Car t = new Car();
        jFrame.add(t);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(900, 600);
        jFrame.setLocation(420, 20);
    }
}
