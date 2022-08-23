package org.toyota.car.details;

public class Wheel extends DetailWithBrokenState {
    private CarWheelRadius wheelRadius; // арибут колеса - диаметр. Значения берутся из енама, которй можносоздать через alt+enter.

    public Wheel(CarWheelRadius wheelRadius) {  // создаем конструктор через alt+Enter. Поле будет "public Wheel(boolean isBroken, CarWheelRadius wheelRadius)"/ Но так как колесо по-умолчанию у нас не проколото, то удаляем "boolean isBroken" и пишем, что он false
        super(false); //пишем super так как Wheel наследуется от DetailWithBrokenState и значит берет его конструктор и передаем туда состояние false
        this.wheelRadius = wheelRadius;
    }

    public CarWheelRadius getWheelRadius() {
        return wheelRadius;
    } //геттер, чтобы получить значение радиуса. Сеттер не делаем, так как логично, что радиус у колеса меняться не может
}
