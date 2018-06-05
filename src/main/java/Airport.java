import java.util.ArrayList;
import java.util.List;

class Airport {
    private final List<Plane> planes = new ArrayList<>();

    List<Plane> getPlanes() { return planes; }


    void land(Plane plane) {
        plane.land();
        planes.add(plane);
    }

    void takeOff(Plane plane) {
        plane.takeOff();
        planes.remove(plane);
    }
}

