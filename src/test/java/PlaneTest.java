import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    private Plane plane;

    @BeforeEach
    void setup(){
        plane = new Plane();
    }

    @Test
    void planeFlying(){
        assertTrue(plane.getFlying());
    }


    @Test
    void planeLands(){
        plane.land();
        assertFalse(plane.getFlying());
    }

    @Test
    void planeTakesOff(){
        plane.land();
        plane.takeOff();
        assertTrue(plane.getFlying());
    }

    @Test
    @DisplayName("Raise Error if plane is instructed to land when already landed")
    void raiseError(){
        plane.land();

    }

}
