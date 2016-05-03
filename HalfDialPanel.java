package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Color;

public class HalfDialPanel extends PanelSetUp implements SetPanelValues  {

    private HalfDialDraw half;  // the dial itself
    
    /**
     * Default constructor
     */
    public HalfDialPanel() {
        half = new HalfDialDraw();
        add(half, BorderLayout.CENTER);
        setBackground(Color.BLACK);
    }
    
    /**
     * Set the value for the dial
     * @param value - value for the dial
     */
     @Override
    public void setValue(int value) {
        half.setValue(value);
    }
    
    
    /**
     * @param label - label to appear above the dial
     */
    @Override
    public void setLabel(String label) {
        lblTitle.setText(label);
    }
}