package pckg_gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LeftPanel extends JPanel {

    private JTextField nameField;
    private JTextField cityField;
    private JTextField mailField;
    private JButton sendDataBtn;

    public LeftPanel(){

        Dimension dim = getPreferredSize();
        dim.width = 250;
        dim.height = 300;
        setPreferredSize(dim);

        decoratePanel();
        initComps();
        layoutComps();
        activatePanel();
    }

    private void activatePanel() {
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.weighty = 0.1;

        add(new JLabel("Name: "), gbc);

        gbc.gridy++;
        add(nameField, gbc);

        gbc.gridy++;
        add(new JLabel("City: "), gbc);

        gbc.gridy++;
        add(cityField, gbc);

        gbc.gridy++;
        add(new JLabel("Mail: "), gbc);

        gbc.gridy++;
        add(mailField, gbc);

        gbc.weighty = 0.25;
        gbc.gridy++;
        add(sendDataBtn, gbc);

    }

    private void initComps() {

        nameField = new JTextField(10);
        cityField = new JTextField(10);
        mailField = new JTextField(10);
        sendDataBtn = new JButton("Send data");

    }

    private void decoratePanel() {

        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Customer data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

    }
}
