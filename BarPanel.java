package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 * BarPanel. Container for BarDrawPanel to hold bar and label. If a label is not
 * needed BarDrawPanel an be used on its own
 */
public class BarPanel extends PanelSetUp implements SetPanelValues {

    private BarDrawPanel bar; // the bar itself

    public BarPanel() {
        bar = new BarDrawPanel();
        add(bar, BorderLayout.CENTER);
        setBackground(Color.BLACK);
    }

    /**
     * Set the value for the bar
     *
     * @param value - value for the bar
     */
    @Override
    public void setValue(int value) {
        bar.setValue(value);
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
