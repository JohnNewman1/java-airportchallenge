import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {
    private Plane plane;
    @BeforeEach
    public void setup(){
        plane = new Plane();
    }
    @Test
    public void planeisflying(){
        assertEquals(true, plane.flying);
    }


    @Test
    public void planelands(){
        plane.land();
        assertEquals(false, plane.flying);
    }

    @Test
    public void planetakesoff(){
        plane.land();
        plane.takeOff();
        assertEquals(true, plane.flying);
    }

}
