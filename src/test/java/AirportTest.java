import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class AirportTest {
    private Airport airport;
    private Plane plane;

    @BeforeEach
    void setup(){
        airport = new Airport();
        plane = mock(Plane.class);
        when(plane.getFlying()).thenReturn(false);
    }

    @Test
    @DisplayName("Default has empty planes array")
    void checkPlanesArray(){
        assertTrue(airport.getPlanes().isEmpty());
    }


    @Test
    @DisplayName("Stores plane on landing")
    void StorePlane(){
        airport.land(plane);
        assertTrue(airport.getPlanes().contains(plane));
    }

    @Test
    @DisplayName("Plane land method is called")
    void InstructLanding(){
        airport.land(plane);
        verify(plane, times(1)).land();

    }

    @Test
    @DisplayName("Removes plane on takeoff")
    void RemovePlane(){
        airport.land(plane);
        airport.takeOff(plane);
        assertFalse(airport.getPlanes().contains(plane));

    }

    @Test
    @DisplayName("Plane takeOff method is called")
    void InstructTakeOff(){
        airport.land(plane);
        airport.takeOff(plane);
        verify(plane, times(1)).takeOff();

    }

    @Test
    @DisplayName("Plane cannot take off from airport it is not in")
    void checkAirport(){
        Airport airport2 = new Airport();
        airport.land(plane);
        assertThrows(Error.class, () -> airport2.takeOff(plane), "Plane is not in this airport!");
    }

}
