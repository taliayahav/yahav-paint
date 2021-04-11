package yahav.paint;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class PaintController {
    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker colorPicker;

    public void initialize(){
        GraphicsContext graphic = canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged(event -> {
            double wdt = graphic.getLineWidth();
            double x = event.getX() - wdt / 2;
            double y = event.getY() -wdt / 2;
            graphic.setFill(colorPicker.getValue());
            graphic.fillRect(x, y, wdt, wdt);
        });
    }
}