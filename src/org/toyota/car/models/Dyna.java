package org.toyota.car.models;

import org.toyota.car.cartype.CarVagan;
import org.toyota.car.details.*;

public class Dyna extends CarVagan {
    private Socket socket; //атрибут - РОЗЕТКА ДЛЯ ТЕЛЕФОНА, потом создаем ее класс через alt+enter

    public Dyna(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
                GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
                CarWheelRadius carWheelRadius, int maxWeightTaken, Socket socket) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electrics, headLights,
                carWheelRadius, maxWeightTaken);
        this.socket = socket;
    }

    public void chargePhone() {
        this.socket.chargePhone();
    } //вызываем метод ЗАРЯДИТЬ ТЕЛЕФОН в обьекте DYNA. Вызываем chargePhone, а он вызывает chargePhone у socket
}
