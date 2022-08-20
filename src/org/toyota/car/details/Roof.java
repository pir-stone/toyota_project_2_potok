package org.toyota.car.details;

public class Roof {
    private boolean isUp;

    public Roof() {
        this.isUp = false;
    }

    public void turn() {
        isUp = !isUp;
        if (isUp) {
            System.out.println("Крыша поднята");
        } else {
            System.out.println("Крыша опущена");
        }
    }

    public boolean isUp() {
        return isUp;
    }
}
