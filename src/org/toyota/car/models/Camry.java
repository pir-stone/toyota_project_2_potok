package org.toyota.car.models;

import org.toyota.car.cartype.Sedan;
import org.toyota.car.details.*;

public class Camry extends Sedan {
    private Usb usb; //дополнительный атрибут - наличие USB, потом создаем класс через alt+enter

    public Camry(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
                 GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
                 CarWheelRadius carWheelRadius, CruiseControl cruiseControl, Usb usb) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electrics, headLights,
                carWheelRadius, cruiseControl);
        this.usb = usb;
    }

    public void onMusic() {
        usb.musicOn();
    } //метод ВКЛЮЧЕНИЯ МЫЗЫКИ через сам объект КАМРИ. Вызываем у КАМРИ метод onMusic, а он вызывает у USB метод musicOn
}
