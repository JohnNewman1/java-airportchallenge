import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    private Plane plane;

    @BeforeEach
    void setup(){
        plane = new Plane();
    }

    @Test
    @DisplayName("Plane returns a status")
    void planeFlying(){
        assertTrue(plane.getFlying());
    }


    @Test
    @DisplayName("Plane returns status landed when landed")
    void planeLands(){
        plane.land();
        assertFalse(plane.getFlying());
    }

    @Test
    @DisplayName("Plane returns status flying when flying")
    void planeTakesOff(){
        plane.land();
        plane.takeOff();
        assertTrue(plane.getFlying());
    }

    @Test
    @DisplayName("Raise Error if plane is instructed to land when already landed")
    void raiseErrorLand(){
        plane.land();
        assertThrows(Error.class, ()-> plane.land(), "Plane already landed");

    }

    @Test
    @DisplayName("Raise Error if plane is instructed to take off when already in air")
    void raiseErrorTakeOff(){
        plane.land();
        plane.takeOff();
        assertThrows(Error.class, ()-> plane.takeOff(), "Plane already taken off");

    }

}
