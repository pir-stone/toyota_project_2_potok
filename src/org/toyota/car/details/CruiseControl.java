package org.toyota.car.details;

public class CruiseControl extends Detail {
    private boolean isWorked;

    public CruiseControl() {
        this.isWorked = false;
    }

    public void turn() {
        isWorked = !isWorked;
        if (isWorked) {
            System.out.println("Круиз контроль включен");
        } else {
            System.out.println("Круиз контроль выключен");
        }

    }

    public boolean isWorked() {
        return isWorked;
    }
}
