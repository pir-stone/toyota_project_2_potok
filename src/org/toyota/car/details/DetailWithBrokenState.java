package org.toyota.car.details;

public abstract class DetailWithBrokenState extends Detail { //абстрактный класс- сломана деталь или нет
    private boolean isBroken;

    public DetailWithBrokenState(boolean isBroken) {
        this.isBroken = isBroken;
    }  //создаем конструктор через alt+enter

    public boolean isBroken() {
        return isBroken;
    } //создаем геттер и сеттер  через alt+enter

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
