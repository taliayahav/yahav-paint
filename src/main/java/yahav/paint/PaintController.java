package yahav.paint;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PaintController{
    @FXML
    private Canvas  canvas;
    @FXML
    private ColorPicker colorPicker;
//    private final GraphicsContext graphic = canvas.getGraphicsContext2D();

    public void initialize(){
    }
    public void ColorPicker(){
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setOnAction(e -> {
            Color c = colorPicker.getValue();
            System.out.println("New Color's RGB = "+c.getRed()+" "+c.getGreen()+" "+c.getBlue());
        });
    }

    public void Erase(MouseEvent mouseEvent) {
        GraphicsContext graphic = canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged(event -> {
            graphic.clearRect(event.getX(), event.getY(), 15,15);
        });
    }

    public void Color(MouseEvent mouseEvent) {
        GraphicsContext graphic = canvas.getGraphicsContext2D();
            canvas.setOnMouseDragged(event -> {
            double wdt = graphic.getLineWidth();
            double x = event.getX() - wdt / 2;
            double y = event.getY() - wdt / 2;
            graphic.setFill(colorPicker.getValue());
            graphic.fillRect(x, y, 15, 15);
        });
    }
}