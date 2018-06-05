public class Plane {
    boolean flying = true;

    public void land() {
        this.flying = false;
    }

    public boolean isFlying() {
        return flying;
    }

    public void takeOff() {
        this.flying = true;
    }
}
