package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import uk.ac.gre.comp1549.dashboard.DashboardDemoMain;

/**
 *
 * @author Murad
 */
public class ViewController extends JFrame {

    public static final String XML_SCRIPT = "dashboard_script.xml";
    private JTextField txtSpeedValueInput;
    private JTextField txtPetrolValueInput;
    private JTextField txtDigitalDisplayValueInput;
    private JButton btnScript;

    public ViewController() {
        buildGUI();
       
    }

    private void buildGUI() {
        setTitle("Dashboard demonstration controller");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        this.add(panel);
        panel.add(new JLabel("Speed Value:"));
        txtSpeedValueInput = new JTextField("0", 3);
        panel.add(txtSpeedValueInput);
        panel.add(new JLabel("Petrol Value:"));
        txtPetrolValueInput = new JTextField("0", 3);
        panel.add(txtPetrolValueInput);
        txtDigitalDisplayValueInput = new JTextField("0", 3);
        panel.add(txtDigitalDisplayValueInput);
        btnScript = new JButton("Run XML Script");
     
        // When the button is read the XML script will be run
//        btnScript.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new Thread() {
//                    public void run() {
//                      runXMLScript();
//                    }
//                }.start();
//            }
//        });
//        panel.add(btnScript);
//        add(panel);
       pack();

        setLocationRelativeTo(null); // display in centre of screen
         this.setVisible(true);
    }

    /**
     * adds DocumentListeners to corresponding JTextFeild with an anonymous
     * class this decouples the MVCcontroller for and responsibility to swing,
     * increase modularity and adheres to the single responsibility principle
     *
     * @param controller
     */
    public void addSpeedDialController(final MVCcontroller controller) {
        txtSpeedValueInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                controller.changedSpeedDialModelState();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                controller.changedSpeedDialModelState();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    /**
     * adds DocumentListeners to corresponding JTextFeild with an anonymous
     * class this decouples the MVCcontroller for and responsibility to swing,
     * increase modularity and adheres to the single responsibility principle
     *
     * @param controller
     */
    public void addPetrolHalfDialController(final MVCcontroller controller) {
        txtPetrolValueInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                controller.changedPetrolHalfDialModelState();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                controller.changedPetrolHalfDialModelState();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    /**
     * adds DocumentListeners to corresponding JTextFeild with an anonymous
     * class this decouples the MVCcontroller for and responsibility to swing,
     * increase modularity and adheres to the single responsibility principle
     *
     * @param controller
     */
    public void addPetrolBarController(final MVCcontroller controller) {
        txtPetrolValueInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                controller.changedPetrolBarModelState();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                controller.changedPetrolBarModelState();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    /**
     * adds DocumentListeners to corresponding JTextFeild with an anonymous
     * class this decouples the MVCcontroller for and responsibility to swing,
     * increase modularity and adheres to the single responsibility principle
     *
     * @param controller
     */
    public void addPetrolDigitalController(final MVCcontroller controller) {
        txtDigitalDisplayValueInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                controller.changedDigitalDisplayModelState();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                controller.changedDigitalDisplayModelState();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    /**
     * gets updated text from JTextFeild
     *
     * @return
     */
    public String getSpeed() {
        return txtSpeedValueInput.getText();
    }

    /**
     * gets updated text from JTextFeild
     *
     * @return
     */
    public String getPetrol() {
        return txtPetrolValueInput.getText();
    }

    /**
     * gets updated text from JTextFeild
     *
     * @return
     */
    public String getDigitalDisplay() {
        return txtDigitalDisplayValueInput.getText();
    }

}
