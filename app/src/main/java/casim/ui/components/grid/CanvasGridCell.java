package casim.ui.components.grid;

import casim.utils.coordinate.Coordinates;
import javafx.scene.paint.Color;

/**
 * Defines the {@link CanvasGrid} cell elements.
 */
public interface CanvasGridCell {

    /**
     * Return the {@link CanvasGridCell}'s color.
     * 
     * @return the {@link CanvasGridCell}'s' color.
     */
    Color getColor();

    /**
     * Sets the {@link CanvasGridCell} color.
     * 
     * @param color the new color.
     */
    void setColor(Color color);

    /**
     * Return the {@link CanvasGridCell}'s top left point as {@link Coordinates}.
     * 
     * @return a {@link Coordinates} representing the top left point of the {@link CanvasGridCell}.
     */
    Coordinates<Integer> getTopLeft();

    /**
     * Return the {@link CanvasGridCell}'s size.
     * 
     * @return a double representing the size of the {@link CanvasGridCell}.
     */
    double getSize();
}
