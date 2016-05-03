package uk.ac.gre.comp1549.dashboard.controls;

import javax.swing.JPanel;

public abstract class AbstractUIElement extends JPanel {

    protected int value; // current value - will be indicated on the bar

    protected int padding; // padding around the bar
    protected float maxValue; // bar runs from 0 to barMaxValue

    public AbstractUIElement() {
        this(8, 0);
    }

    public AbstractUIElement(int padding, int value) {

        this.padding = padding;
        this.value = value;
    }

   // protected abstract void setLabel(String label);
   abstract void setValue(int value);
     /*    this.value = value > maxValue ? (int) maxValue : value;
        repaint(); // causes paintComponent() to be called
         
     }*/

}//end of AbstractUIElement class
