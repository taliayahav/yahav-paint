package yahav.paint;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;

public class PaintController extends Canvas{
    @FXML
    protected Canvas  canvas;
    @FXML
    protected ColorPicker colorPicker;
//   private final GraphicsContext graphic = getGraphicsContext2D();

    public void erase(MouseEvent mouseEvent) {
        GraphicsContext graphic = canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged(event -> {
            graphic.clearRect(event.getX(), event.getY(),15,15);
        });
    }

    public void color(MouseEvent mouseEvent) {
        GraphicsContext graphic = canvas.getGraphicsContext2D();
        canvas.setOnMousePressed(event -> {
            graphic.setLineWidth(5);
            graphic.setStroke(colorPicker.getValue());
            graphic.beginPath();
        });
            canvas.setOnMouseDragged(event -> {
            double wdt = graphic.getLineWidth();
            double x = event.getX() - wdt / 2;
            double y = event.getY() - wdt / 2;
                graphic.lineTo(x,y);
                graphic.stroke();
        });
    }
}