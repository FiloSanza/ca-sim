/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package casim;

import casim.ui.grid.CanvasGridBuilder;
import casim.ui.grid.CanvasGridImpl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Main project class.
 */
public class App extends Application {

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final var gridBuilder = new CanvasGridBuilder();
        gridBuilder.setRows(50)
            .setColumns(50)
            .setCellSize(20);
        final var grid = gridBuilder.build().getValue();
        final var root = new StackPane();
        root.getChildren().add((CanvasGridImpl)grid);
        final var scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        grid.draw();
    }

    /**
     * Entry point.
     * 
     * @param args command line args.
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
