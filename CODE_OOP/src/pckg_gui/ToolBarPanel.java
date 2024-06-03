package pckg_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JPanel implements ActionListener {

    private JButton setTextBtn;
    private JButton resetViewPanelBtn;
    private ToolBarListener toolBarListener;

    public ToolBarPanel(){

        initToolBar();
        initComponents();
        layoutComponents();
        activateToolBar();
    }

    private void activateToolBar() {
        setTextBtn.addActionListener(this);
        resetViewPanelBtn.addActionListener(this);
        setTextBtn.setActionCommand("SET TEXT");
        resetViewPanelBtn.setActionCommand("RESET");
    }

    private void layoutComponents() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(setTextBtn);
        add(resetViewPanelBtn);

    }

    private void initComponents() {

        setTextBtn = new JButton("Set Text");
        resetViewPanelBtn = new JButton("Reset view panel");

    }

     private void initToolBar() {}

    public void setToolBarListener(ToolBarListener toolBarListener){
        this.toolBarListener = toolBarListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(setTextBtn) && toolBarListener != null){
            toolBarListener.toolBarEventOcurred(new ToolBarEvent(this, setTextBtn.getActionCommand()));


        }

        if(e.getSource().equals(resetViewPanelBtn) && toolBarListener != null){
            toolBarListener.toolBarEventOcurred(new ToolBarEvent(this, resetViewPanelBtn.getActionCommand()));
        }

    }
}
