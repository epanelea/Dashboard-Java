package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 * DialPanel.  Container for DialDrawPanel to hold dial and label.
 * If a label is not needed DialDrawPanel an be used on its own
 */
public class DialPanel extends PanelSetUp implements  SetPanelValues, MVCView {

    private DialDrawPanel dial;  // the dial itself
    /**
     * Default constructor
     */
    public DialPanel() {
        dial = new DialDrawPanel();
        setBackground(Color.BLACK);
        add(dial, BorderLayout.CENTER);
      

    }
    /**
     * Set the value for the dial
     * @param value - value for the dial
     */
    
     @Override
    public void setValue(int value) {
        dial.setValue(value);
    }
    /**
     *
     * @param label - label to appear above the dial
     */
    
    @Override
    public void setLabel(String label) {
        lblTitle.setText(label);
        
    }
}
