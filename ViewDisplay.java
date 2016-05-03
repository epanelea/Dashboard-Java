package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import brakebean.*;
/**
 *
 * @author Murad
 */
public class ViewDisplay extends JFrame implements MVCView {

    protected DialPanel speedDial;
    protected BarPanel petrolBar;
    protected DigitalPanel digitalDisplay;
    protected HalfDialPanel halfDial;
    private FactoryPanel factory = new FactoryPanel();
    
    BrakePanel brakePanel1 = new BrakePanel();
    
    public ViewDisplay() {
        buildGUI();
      
    }

    /**
     * builds GUI and adds panels which contain dials, bars, displays, e.c.t
     */
    private void buildGUI() {
        setLocationRelativeTo(null);
       
        JPanel dashboard = new JPanel();
        dashboard.setLayout(new FlowLayout());
        dashboard.setBackground(Color.BLACK);
        this.add(dashboard);
        // add the speed Dial
        speedDial = factory.getSpeedDial();
        dashboard.add(speedDial);
        

        // add the petrol Dial 
        halfDial = factory.getPetrolDial();
        dashboard.add(halfDial);
        
        // add the petrol Bar
        petrolBar = factory.getPetrolBar();
        dashboard.add(petrolBar);
        
        // add the digital display
        digitalDisplay = factory.getDigitalDisplay();
        dashboard.add(digitalDisplay);
        //this.setVisible(true);
        dashboard.add(brakePanel1);
        pack();
        // dashboard.pack();
        // centre the dashboard frame above the control frame
//        Point topLeft = this.getLocationOnScreen(); // top left of control frame (this)
//        int hControl = this.getHeight(); // height of control frame (this)
//        int wControl = this.getWidth(); // width of control frame (this)
//        int hDash = dashboard.getHeight(); // height of dashboard frame 
//        int wDash = dashboard.getWidth(); // width of dashboard frame 
//        // calculate where top left of the dashboard goes to centre it over the control frame
//        Point p2 = new Point((int) topLeft.getX() - (wDash - wControl) / 2, (int) topLeft.getY() - (hDash + hControl));
//        dashboard.setLocation(p2);
//        dashboard.setVisible(true);
    }

    @Override
    public void setValue(int value) {

    }

}
