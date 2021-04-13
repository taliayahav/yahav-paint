package yahav.paint;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import org.junit.BeforeClass;
import org.junit.Test;
import yahav.paint.PaintController;

import static org.mockito.Mockito.*;

public class PaintControllerTest {
    private Canvas canvas;
    private ColorPicker colorPicker;
    private PaintController controller;

    private void givenPaintController(){
        //given
        controller = new PaintController();
        canvas = mock(Canvas.class);
        controller.canvas = canvas;
        colorPicker = mock(ColorPicker.class);
        controller.colorPicker = colorPicker;
    }

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void erase(){
        //given
        givenPaintController();
        MouseEvent mouseEvent =mock(MouseEvent.class);
       // doNothing().when(

        //when
        controller.erase(mouseEvent);

        //then
    }
    @Test
    public void color(){
        //given
        givenPaintController();
        MouseEvent mouseEvent =mock(MouseEvent.class);

        //when
        controller.color(mouseEvent);

        //then

    }

}