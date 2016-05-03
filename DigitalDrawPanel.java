package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

    public class DigitalDrawPanel extends AbstractUIElement{
    
    private int digitalLength; // length/width of the bar
    private int digitalHeight; // height of the bar
    private int maxValue;
    
    public DigitalDrawPanel() {
        this(200, 20, 8, 100000, 0);
        setBackground(Color.BLACK);
    }
     public DigitalDrawPanel(int length, int height, int padding, int maxValue, int value) {
        super(padding, value);
        // set size of the JPanel to be big enough to hold the bar plus padding
        setPreferredSize(new Dimension(length + (2 * padding), height + (2 * padding)));

        this.digitalLength = length;
        this.digitalHeight = height;
        this.maxValue = maxValue;
      
     }
     
     @Override
     public void paintComponent(Graphics g) {
          super.paintComponent(g);
           Graphics2D g2 = (Graphics2D) g; // get a Graphics2D object to draw with
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           
            g2.setColor(Color.red);
             Font myFont = new Font("",Font.BOLD, 20);
            g.setFont(myFont);
            String s = String.valueOf(value);
            g.drawString(s, (digitalLength/2) + padding, (digitalHeight/2) + padding);
         
     }

    @Override
    void setValue(int value) { 
         this.value = value > maxValue ? (int) maxValue : value;
        repaint(); // causes paintComponent() to be called
    }
     
}
