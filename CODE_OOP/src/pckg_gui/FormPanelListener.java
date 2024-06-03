package pckg_gui;

import java.util.EventListener;

public interface FormPanelListener extends EventListener {

    void leftPanelEventOcurred(LeftPanelEvent leftPanelEvent);
    void rightPanelEventOcurred(RightPanelEvent rightPanelEvent);
}
