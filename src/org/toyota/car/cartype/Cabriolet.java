package org.toyota.car.cartype;

import org.toyota.car.details.*;

public abstract class Cabriolet extends Car { //создаем абстрактный класс
    private Roof roof; //атрибут КРЫША, создаем для нее класс через alt+enter

    public Cabriolet(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
                     GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
                     CarWheelRadius carWheelRadius, Roof roof) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electrics, headLights,
                carWheelRadius);
        this.roof = roof;
    }

    public void turnRoof() {
        roof.turn();
    } //вызываем переключение состояния крыши через объект КАБРИОЛЕТ
    //вызываем метод turnRoof, а он вызывает у крыши метод turn
}
