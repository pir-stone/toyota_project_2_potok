package org.toyota.car.details;

public class Electrics extends DetailWithBrokenState { //наследуемся от класса СОСТОЯНИЯ СЛОМАННЫХ ДЕТАЛЕЙ

    public Electrics() {
        super(false);
    } //передаем, что электрика по умолчанию не сломана, вызывая конструктор из DetailWithBrokenState
}
