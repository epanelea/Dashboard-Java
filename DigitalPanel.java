/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author Murad
 */
public class DigitalPanel extends PanelSetUp implements SetPanelValues {

    private DigitalDrawPanel digital; // the bar itself

    public DigitalPanel() {
setBackground(Color.BLACK);
        digital = new DigitalDrawPanel();
        add(digital, BorderLayout.CENTER);
    }

    @Override
    public void setLabel(String label) {
        lblTitle.setText(label);
    }

    @Override
    public void setValue(int value) {
        digital.setValue(value);
    }
}
