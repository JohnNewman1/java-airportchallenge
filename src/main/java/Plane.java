class Plane {
    private boolean flying = true;

    boolean getFlying() {
        return flying;
    }

    void land() {
        if (!getFlying()) throw new Error("Plane already landed");
        this.flying = false;
    }

    void takeOff() {
        if (getFlying()) throw new Error("Plane already taken off");
        this.flying = true;
    }
}
