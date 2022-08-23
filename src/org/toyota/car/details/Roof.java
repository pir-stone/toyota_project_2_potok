package org.toyota.car.details;

public class Roof {
    private boolean isUp; //атрибут - "поднята ли крыша"

    public Roof() {
        this.isUp = false;
    } //по умолчанию не поднята

    public void turn() {
        isUp = !isUp; //ПЕРЕКЛЮЧАТЕЛЬ состояния крыши. Вкл/Выкл.
        if (isUp) {  // если TRUE, то пишем...
            System.out.println("Крыша поднята");
        } else { //если FALSE, то пишем...
            System.out.println("Крыша опущена");
        }
    }

    public boolean isUp() {
        return isUp;
    } //геттер, для получения состояния крышы
}
