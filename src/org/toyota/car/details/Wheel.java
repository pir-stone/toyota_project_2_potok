package org.toyota.car.details;

public class Wheel extends DetailWithBrokenState {
    private CarWheelRadius wheelRadius;

    public Wheel(CarWheelRadius wheelRadius) {
        super(false);
        this.wheelRadius = wheelRadius;
    }

    public CarWheelRadius getWheelRadius() {
        return wheelRadius;
    }
}
