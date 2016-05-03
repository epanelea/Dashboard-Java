package uk.ac.gre.comp1549.dashboard;

/**
 * ***TODO***** refractor Panel classes in to some inheritance hierarchy so
 * that the "setPeotrol", "setDigitalDisplay", and "setSpeed" methods can be
 * condensed into one method which makes use of substitution on the "setValue"
 * method, And possibly makes use of a switch statement
 */
/**
 * ***DONE***** improved "setPeotrol", "setDigitalDisplay", and "setSpeed" to
 * accurately display when a user sets the input to 0
 */

import uk.ac.gre.comp1549.dashboard.controls.MVCcontroller;
import uk.ac.gre.comp1549.dashboard.controls.MVCmodel;
import uk.ac.gre.comp1549.dashboard.controls.ViewController;
import uk.ac.gre.comp1549.dashboard.controls.ViewDisplay;

/**
 * DashboardDemoMain.java Contains the main method for the Dashboard demo
 * application. It: a) provides the controller screen which allows user input
 * which is passed to the display indicators, b) allows the user to run the XML
 * script which changes indicator values, c) creates the dashboard JFrame and
 * adds display indicators to it.
 */
public class DashboardDemoMain {


    /**
     * Run the XML script file which generates events for the dashboard
     * indicators
     */
//    private void runXMLScript() {
//        try {
//            DashboardEventGeneratorFromXML dbegXML = new DashboardEventGeneratorFromXML();
//
//            // Register for speed events from the XML script file
//            DashBoardEventListener dbelSpeed = new DashBoardEventListener() {
//                @Override
//                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
//                    speedDial.setValue(Integer.parseInt(dbe.getValue()));
//                }
//            };
//            dbegXML.registerDashBoardEventListener("speed", dbelSpeed);
//
//            // Register for petrol events from the XML script file
//            DashBoardEventListener dbelPetril = new DashBoardEventListener() {
//                @Override
//                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
//                    halfDial.setValue(Integer.parseInt(dbe.getValue()));
//                    petrolBar.setValue(Integer.parseInt(dbe.getValue()));
//                }
//            };
//            dbegXML.registerDashBoardEventListener("petrol", dbelPetril);
//
//            DashBoardEventListener dbelDigitalDispaly = new DashBoardEventListener() {
//                @Override
//                public void processDashBoardEvent(Object originator, DashBoardEvent dbe) {
//                    digitalDisplay.setValue(Integer.parseInt(dbe.getValue()));
//
//                }
//            };
//            dbegXML.registerDashBoardEventListener("digital", dbelDigitalDispaly);
//
//            // Process the script file - it willgenerate events as it runs
//            dbegXML.processScriptFile(XML_SCRIPT);
//
//        } catch (Exception ex) {
//            Logger.getLogger(DashboardDemoMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
    public static void main(String[] args) {
        //git test
        ViewController me = new ViewController();
        ViewDisplay vd = new ViewDisplay();

        MVCmodel model = new MVCmodel(vd);
        MVCcontroller controller = new MVCcontroller(me, model);
        me.addSpeedDialController(controller);
        me.addPetrolHalfDialController(controller);
        me.addPetrolBarController(controller);
        me.addPetrolDigitalController(controller);

        me.setVisible(true);
        //  me.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        vd.setVisible(true);
    }
    //private void initializeValues(){} all values initalized here. method called in constructor

    //http://docs.oracle.com/javase/tutorial/displayCode.html?code=http://docs.oracle.com/javase/tutorial/uiswing/examples/events/MultiListenerProject/src/events/MultiListener.java
}
