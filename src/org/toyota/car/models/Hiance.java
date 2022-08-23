package org.toyota.car.models;

import org.toyota.car.cartype.CarVagan;
import org.toyota.car.details.*;

public class Hiance extends CarVagan {
    private Wheel safeWheel; //атрибут запасное колесо.
//создаем конструктор через Alt+enter
    public Hiance(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
                  GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
                  CarWheelRadius carWheelRadius, int maxWeightTaken, Wheel safeWheel) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electrics, headLights,
                carWheelRadius, maxWeightTaken);
        this.safeWheel = safeWheel;
    }
//создаем геттер и сеттер через alt+enter
    public Wheel getSafeWheel() {
        return safeWheel;
    }

    public void setSafeWheel(Wheel safeWheel) {
        this.safeWheel = safeWheel;
    }
}
