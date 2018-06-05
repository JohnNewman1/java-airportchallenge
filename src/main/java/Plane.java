class Plane {
    private boolean flying = true;

    boolean getFlying() {
        return flying;
    }

    void land() {
        this.flying = false;
    }

    void takeOff() {
        this.flying = true;
    }
}
