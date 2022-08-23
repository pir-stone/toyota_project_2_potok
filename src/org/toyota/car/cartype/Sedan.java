package org.toyota.car.cartype;

import org.toyota.car.details.*;

public abstract class Sedan extends Car { //создаем абстрактный класс
    private CruiseControl cruiseControl; //атрибут КРУИЗ-КОНТРОЛЬ, который является классом

//создаем ниже конструктор через alt+enter
    public Sedan(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
                 GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
                 CarWheelRadius carWheelRadius, CruiseControl cruiseControl) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electrics, headLights,
                carWheelRadius);
        this.cruiseControl = cruiseControl;
    }

    public void turnCruiseControl() {
        this.cruiseControl.turn();
    } //этим методом мы вызываем ПЕРЕКЛЮЧЕНИЕ круиза напрямую через объект СЕДАН. Т.е. вызываем turnCruiseControl, который вызывает turn у круиза
 }
