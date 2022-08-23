package org.toyota.car.models;

import org.toyota.car.cartype.Cabriolet;
import org.toyota.car.details.*;

public class Solara extends Cabriolet {
    private MiniFridge miniFridge; //пишем этот атрибут, потом через alt+enter создаем класс
//создаем конструктор через alt+enter
    public Solara(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
                  GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
                  CarWheelRadius carWheelRadius, Roof roof, MiniFridge miniFridge) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electrics, headLights,
                carWheelRadius, roof);
        this.miniFridge = miniFridge;
    }

    public void fridge() {
        miniFridge.fridge();
    } //вызываем метод ОХЛАЖДЕНИЕ у холодильника в объекте SOLARA
}
