package org.toyota.car.details;

public class CruiseControl extends Detail {  //наследуется от класса ДЕТАЛИ
    private boolean isWorked; //атрибут - "РАБОТАЕТ ЛИ"

    public CruiseControl() {
        this.isWorked = false;
    } //создаем конструктор через alt+enter. И ставим по умолчанию, что круиз не включен

    public void turn() { //метод включения круиза
        isWorked = !isWorked; //работает как ПЕРЕКЛЮЧАТЕЛЬ (будто при нажатии на кнопку переключается состояние круиза)
        if (isWorked) { //если TRUE, то круиз включен
            System.out.println("Круиз контроль включен");
        } else {
            System.out.println("Круиз контроль выключен"); //если FALSE, то круиз выключен
        }

    }

    public boolean isWorked() {
        return isWorked;
    } //геттер, для получения состояния круиза, через alt+enter
}
