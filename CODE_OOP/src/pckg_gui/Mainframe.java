package pckg_gui;

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {

    private ToolBarPanel toolBar;
    private ViewPanel viewPanel;
    private FormPanel formPanel;

    public Mainframe(){

        super("Simple Form App");
        initMainframe();
        initComponents();
        layoutComponents();
        activateMainframe();
        activateComps();

    }

    private void activateMainframe(){

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarEventOcurred(ToolBarEvent toolBarEvent) {
                System.out.println(toolBarEvent.getSomeString());
                String someString = toolBarEvent.getSomeString();
                if(someString.equals("SET TEXT")){
                    viewPanel.setText(someString);
                }

                if(someString.equals("RESET")){
                    viewPanel.resetViewPanel();
                }

            }
        });

    }

    private void layoutComponents(){
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(toolBar, BorderLayout.NORTH);
        add(formPanel, BorderLayout.SOUTH);

    }

    private void initComponents(){

        toolBar = new ToolBarPanel();
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();


    }

    private void activateComps(){

    }

    private void initMainframe(){
        setSize(680,580);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
