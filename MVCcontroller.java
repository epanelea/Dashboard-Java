package uk.ac.gre.comp1549.dashboard.controls;

/**
 * * ==============ADD MORE DETAILS TO DESCRIPTION HERE================
 * translates changes made by the user into action that the model should carry
 * out to update the views
 *
 * @author Murad
 */
public class MVCcontroller {

    MVCmodel myModel;
    ViewController myView;

    /**
     * gives knowledge of both the model and the view this allows each to
     * interact with out knowing any thing about each other
     *
     * @param view
     * @param model
     */
    public MVCcontroller(ViewController view, MVCmodel model) {
        myModel = model;
        myView = view;
    }

    /**
     * translates changes made by the user into actions for the model
     */
    public void changedSpeedDialModelState() {
        myModel.moveFullDialIndicator(myView.getSpeed());
    }

    /**
     * translates changes made by the user into actions for the model
     */
    public void changedPetrolHalfDialModelState() {
        myModel.moveHalfDialIndicator(myView.getPetrol());
    }

    /**
     * translates changes made by the user into actions for the model
     */
    public void changedPetrolBarModelState() {
        myModel.moveBarIndicator(myView.getPetrol());
    }

    /**
     * translates changes made by the user into actions for the model
     */
    public void changedDigitalDisplayModelState() {
        myModel.moveDigitalIndicator(myView.getDigitalDisplay());
    }
}
