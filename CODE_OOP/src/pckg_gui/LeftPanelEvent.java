package pckg_gui;

import java.util.EventObject;

public class LeftPanelEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private Customer customer;
    public LeftPanelEvent(Object source) {
        super(source);
    }
}
