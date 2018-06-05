import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
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
    @DisplayName("Can instruct plane to land")
    void InstructLanding(){

    }

    @Test
    @DisplayName("Can instruct plane to take off")
    void InstructTakeOff(){

    }

}
