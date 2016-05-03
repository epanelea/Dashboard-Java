package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public abstract class PanelSetUp extends JPanel {

    protected JLabel lblTitle;
    protected String lblText = "";

    /**
     * gives basic structure for all panels that use this abstract class
     */
    public PanelSetUp() {
        setLayout(new BorderLayout());

        // set the style of the border
        setBorder(new BevelBorder(BevelBorder.LOWERED));

        // position the label above the dial
        lblTitle = new JLabel();
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add(lblTitle, BorderLayout.NORTH);
        lblTitle.setForeground(Color.yellow);

    }
}
