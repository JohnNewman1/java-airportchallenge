import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class AirportTest {
    private Airport airport;
    private Plane plane;
    @BeforeEach
    public void setup(){
        airport = new Airport();
        plane = mock(Plane.class);
        when(plane.isFlying()).thenReturn(false);
    }


    @Test
    public void ArrayisEmpty(){
        assertEquals(airport.array.length, 0);
    }

    @Test
    public void ArrayisEmptyd(){
        assertFalse(plane.isFlying());
    }

}
