import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {

    private Weather weather;

    @BeforeEach
    void setup(){ weather = new Weather(); }

    @Test
    @DisplayName("Can return good weather")
    void returnGoodWeather(){
        int num = 1;
        assertTrue(weather.get(num));
    }

    @Test
    @DisplayName("Can return bad weather")
    void returnBadWeather(){
        int num = 10;
        assertFalse(weather.get(num));
    }



}
