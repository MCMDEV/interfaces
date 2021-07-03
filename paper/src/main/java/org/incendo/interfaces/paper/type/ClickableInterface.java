package org.incendo.interfaces.paper.type;

import org.incendo.interfaces.paper.element.ClickHandler;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Represents a clickable interface.
 * <p>
 * {@code clickHandler} will be called whenever the viewer clicks on the interface.
 */
public interface ClickableInterface {

    /**
     * Returns the top click handler.
     *
     * @return the top click handler
     */
    @NonNull ClickHandler clickHandler();

}