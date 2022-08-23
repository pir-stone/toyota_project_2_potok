package org.toyota.car.details;

public class GasTank extends Detail {
    private int volume;  // атрибут бензобака - кол-ва бензина. Пишем эт строку, потом через alt+enter создаем конструктор и геттер/сетер

    public GasTank() {
        this.volume = 0;
    }  //вручную пишем, что изначально обьем бака =

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
