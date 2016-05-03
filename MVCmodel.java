package uk.ac.gre.comp1549.dashboard.controls;

/**
 * ==============ADD MORE DETAILS TO DESCRIPTION HERE================
 * translates users interactions into actions that will be performed by the
 * model
 *
 * gets updates from ViewController.java and passes them to MVCmodel.java to
 * update the views
 *
 * @author Murad
 */

public class MVCmodel {

    private final ViewDisplay displayView;

    private int value;

    /**
     * supplies knowledge of ViewDisplay, along with its members
     * @param v1 
     */
    public MVCmodel(ViewDisplay v1) {
        displayView = v1;

    }

    /**
     * accepts new values entered by the user at the ViewController and hands
     * them to the pertaining view to update its self
     *
     * @param indicatorValueStr
     */
    public void moveFullDialIndicator(String indicatorValueStr) {
        try {
            int indicatorValue = Integer.parseInt(indicatorValueStr);
            value = indicatorValue;
            updateDial();
        } catch (NumberFormatException nfe) {
            System.out.println("set speed number formt exeption" + nfe);
        }
    }

    /**
     * accepts new values entered by the user at the ViewController and hands
     * them to the pertaining view to update its self
     *
     * @param indicatorValueStr
     */
    public void moveHalfDialIndicator(String indicatorValueStr) {
        try {
            int indicatorValue = Integer.parseInt(indicatorValueStr);
            value = indicatorValue;
            updateHalfDial();
        } catch (NumberFormatException nfe) {
            System.out.println("set petrol dial number formt exeption" + nfe);
        }
    }

    /**
     * accepts new values entered by the user at the ViewController and hands
     * them to the pertaining view to update its self
     *
     * @param indicatorValueStr
     */
    public void moveBarIndicator(String indicatorValueStr) {
        try {
            int indicatorValue = Integer.parseInt(indicatorValueStr);
            value = indicatorValue;
            updateBar();
        } catch (NumberFormatException nfe) {
            System.out.println("set petrol bar number formt exeption" + nfe);
        }
    }

    /**
     * accepts new values entered by the user at the ViewController and hands
     * them to the pertaining view to update its self
     *
     * @param indicatorValueStr
     */
    public void moveDigitalIndicator(String indicatorValueStr) {
        try {
            int indicatorValue = Integer.parseInt(indicatorValueStr);
            value = indicatorValue;
            updateDigital();
        } catch (NumberFormatException nfe) {
            System.out.println("set digital display number formt exeption" + nfe);
        }
    }

    /**
     * informs the corresponding views that it need to update
     */
    public void updateDial() {
        displayView.speedDial.setValue(value);
    }

    /**
     * informs the corresponding views that they need to update
     */
    public void updateHalfDial() {
        displayView.halfDial.setValue(value);
    }

    /**
     * informs the corresponding views that they need to update
     */
    public void updateBar() {
        displayView.petrolBar.setValue(value);
    }

    /**
     * informs the corresponding views that they need to update
     */
    public void updateDigital() {
        displayView.digitalDisplay.setValue(value);
    }
}
