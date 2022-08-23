package org.toyota.car.details;

public class Engine extends DetailWithBrokenState {

    public Engine() {  //конструктор для двигателя через alt+enter и удаляем лишнее в скобках
        super(false);
    } //super - вызываем конструктор из класса DetailWithBrokenState и передаем туда значение false, так как двигатель по-умолчанию не сломан
}
