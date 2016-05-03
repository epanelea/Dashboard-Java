package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DialDrawPanel extends AbstractUIElement {

     private int radius; // radius of dial
    private double handLength; // length of indicator hand
    private BufferedImage image;


    /**
     * The extent of the dial. For a full circle this would be 360
     */
    public static final float DIAL_EXTENT_DEGREES = 270;

    /**
     * Where the dial starts being draw from. Due north is 90.
     */
    public static final float DIAL_START_OFFSET_DEGREES = -45;

    /**
     * Default constructor - sets default values
     */
    public DialDrawPanel() {
        this(100, 10, 100, 0);
        setBackground(Color.BLACK);
         try {                
          image = ImageIO.read(new File("images/dial.png"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    /**
     * @param radius - radius of the dial
     * @param padding - padding outside the dial
     * @param maxValue - dial runs from 0 to dialMaxValue
     * @param value - current value - where the hand will point
     */
    public DialDrawPanel(int radius, int padding, int maxValue, int value) {
       super(padding, value);
        // set size of the JPanel to be big enough to hold the dial plus padding
        setPreferredSize(new Dimension(2 * (radius + padding), 2 * (radius + padding)));
        this.radius = radius;
        this.maxValue = maxValue;
        handLength = 1 * radius; // hand length is fixed at 90% of radius
    }

    /**
     * This method is called every time the Dial needs drawing for instance
     * when the value has changed.  It draws the dial itself and the hand in the
     * correct position to indicate the current value
     * @param g - graphics object used to draw on the JPanel
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; // get a Graphics2D object to draw with
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, 0));
        //draws the dial itself
        g.drawImage(image, 0, 0, null); 
        
        // draw the hand to indicate the current value
        g2.setColor(Color.red);
        double angle = Math.toRadians(222 - (value * (DIAL_EXTENT_DEGREES / maxValue)));
        drawHand(g2, angle, handLength);
    }

     /**
     * Draw one of the little lines at the end of the dial
     * @param g2 - graphics object used to draw on the JPanel
     * @param  angle - the angle on the dial where the line is to be drawn
     */
    private void drawDialEnd(Graphics2D g2, double angle) {
        // calculate endpoint of line furthest from centre of dial
        Point2D outerEnd = new Point2D.Double((radius + padding) + radius * Math.cos(angle),
                (radius + padding) - radius * Math.sin(angle));
        // calculate endpoint of line closest to centre of dial
        Point2D innerEnd = new Point2D.Double((radius + padding) + ((radius + padding) * .8) * Math.cos(angle),
                (radius + padding) - ((radius + padding) * .8) * Math.sin(angle));
        // draw the line
        g2.draw(new Line2D.Double(outerEnd, innerEnd));
    }

     /**
     * Draw the hand on the dial to indicate the current value
     * @param g2 - graphics object used to draw on the JPanel
     * @param  angle - the angle on the dial at which the hand is to point
     * @param handLength - length of the hand
     */
    private void drawHand(Graphics2D g2, double angle, double handLength) {
        // calculate the outer end of the hand
        Point2D end = new Point2D.Double((radius + padding ) + handLength * Math.cos(angle),
                (radius + padding) - handLength * Math.sin(angle));
        // calculate the centre 
        Point2D center = new Point2D.Double(radius + padding, radius + padding);
        //     Draw the line
        g2.draw(new Line2D.Double(center, end));
    }

    @Override
    void setValue(int value) {
        this.value = value > maxValue ? (int) maxValue : value;
        repaint(); // causes paintComponent() to be called
    }
}//end of DailDraw class
