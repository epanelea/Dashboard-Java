package uk.ac.gre.comp1549.dashboard.controls;

/**
 *
 * @author 13018095
 */
public class FactoryPanel {
    
    public DialPanel getSpeedDial(){
        DialPanel speedDial;
        speedDial = new DialPanel();
        speedDial.setLabel("SPEED");
        return speedDial;
        
    }
    
    public HalfDialPanel getPetrolDial(){
        HalfDialPanel halfDial;
        halfDial = new HalfDialPanel();
        halfDial.setLabel("PETROL");
        halfDial.setValue(100);
        return halfDial;
    }
    public BarPanel getPetrolBar(){
        BarPanel petrolBar;
        petrolBar = new BarPanel();
        petrolBar.setLabel("PETROL");
        petrolBar.setValue(100);
        return petrolBar;
    }
    public DigitalPanel getDigitalDisplay(){
        DigitalPanel digitalDisplay;
        digitalDisplay = new DigitalPanel();
        digitalDisplay.setLabel("DIGITAL DISPLAY(temp)");
        return digitalDisplay;
    
    }
    


//    public DigitalPanel digitalDisplay;

}
