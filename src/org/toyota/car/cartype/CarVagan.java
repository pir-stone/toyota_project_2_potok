package org.toyota.car.cartype;

import org.toyota.car.details.*;

public abstract class CarVagan extends Car {
    private int maxWeightTaken; //атрибут - грузоподьемность
//создаем ниже конструктор через alt+enter
    public CarVagan(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
                    GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
                    CarWheelRadius carWheelRadius, int maxWeightTaken) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electrics, headLights, carWheelRadius);
        this.maxWeightTaken = maxWeightTaken;
    }

    public int getMaxWeightTaken() {
        return maxWeightTaken;
    } //геттер для получения значения грузоподъемности
}
