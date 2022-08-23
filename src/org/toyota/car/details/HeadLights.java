package org.toyota.car.details;

public class HeadLights extends DetailWithBrokenState {  //наследуемся от класса СОСТОЯНИЯ СЛОМАННЫХ ДЕТАЛЕЙ

    public HeadLights() {
        super(false);
    } //передаем, что фары по умолчанию не сломаны, вызывая конструктор из DetailWithBrokenState
}
