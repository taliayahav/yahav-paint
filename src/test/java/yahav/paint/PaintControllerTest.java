package yahav.paint;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import org.junit.BeforeClass;
import org.junit.Test;
import yahav.paint.PaintController;

import static org.mockito.Mockito.mock;

public class PaintControllerTest {
    private Canvas canvas;
    private ColorPicker colorPicker;
    private PaintController controller;

    private void givenPaintController(){
        //given
        controller = new PaintController();
        canvas = mock(Canvas.class);
        colorPicker = mock(ColorPicker.class);
    }

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void Erase(){
        //given
        givenPaintController();
        MouseEvent mouseEvent =mock(MouseEvent.class);

        //when
        controller.erase(mouseEvent);

        //then
    }
    @Test
    public void Color(){
        //given
        givenPaintController();
        MouseEvent mouseEvent =mock(MouseEvent.class);

        //when
        controller.color(mouseEvent);

        //then

    }

}