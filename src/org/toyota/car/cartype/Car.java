package org.toyota.car.cartype;

import org.toyota.car.StartCarException;
import org.toyota.car.details.*;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private TransmissionType transmissionType;  // енам TransmissionType. Можно написать эту строчку, потом нажать alt+enter и выбрать осздать ЕНАМ
    private boolean isMove; //состояние движения авто ДА/НЕТ
    private double price;
    private GasTank gasTank; //это атрибут для Car, но изначально являетсяобьектом, так как у него есть свой атрибут - кол-во бензина. Поэтому пишем эту строку, потом alt+enter - "создать класс"
    private Wheel[] wheels; //атрибут - массив из колес из класса Wheel
    private Engine engine;
    private Electrics electrics;
    private HeadLights headLights;
    private CarWheelRadius carWheelRadius;
//ниже через alt+insert генерируем конструктор, выбираем при создании в окошке все наши атрибуты и получаем результат ниже
    public Car(String color, int maxSpeed, TransmissionType transmissionType, boolean isMove, double price,
               GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electrics, HeadLights headLights,
               CarWheelRadius carWheelRadius) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.isMove = isMove;
        this.price = price;
        this.gasTank = gasTank;
        this.wheels = wheels;
        this.engine = engine;
        this.electrics = electrics;
        this.headLights = headLights;
        this.carWheelRadius = carWheelRadius; //передаем в объект РАДИУС колес, а ниже делаем проверку радиуса
        for (Wheel wheel : wheels) { //пишем wheel, потом через alt+etner выбираем itterate, (то есть for each, делаем проверку для каждого колеса)
            if (wheel.getWheelRadius() != carWheelRadius) { //сравниваем радиус созданных колес с тем радиусом, который передали при создании машины - carWheelRadius
                throw new RuntimeException("Радиус передаваемых колес должен быть " + wheel.getWheelRadius()); //выкидываем НЕ ПРОВЕРЯЕМУЮ ОШИБКУ и выводим текст
            }
        }
    }

    //Начать движение - меняет состояние движения. Начать движение возможно только при: наличии всех колес
    //и они не проколоты, непустом бензобаке, работоспособным электрике и двигателю.
    //Если что то из этого невыполняется, то выкидывается ошибка StartCarException,
    //в сообщении которой содержится причина невозможности движения.
    public void start() throws StartCarException { //прописываем тут throws StartCarException, чтобы в случае ошибки пользователь узнал о ней (метод выкинет/выдаст ошибку), поэтому мы не обрабатываем ошибку ниже через TRY/CATCH. А если бы обработали, то пользователь не узнал бы что есть ошибка
        if (checkWheels() && gasTank.getVolume() > 0 && !electrics.isBroken() && !engine.isBroken()) { //проверяем, чтобы все значения были TRUE
            this.isMove = true; //если все условия выше - TRUE, то состояние движения делаем тоже TRUE
            System.out.println("Машина начала движение"); // и выводим на экран "Машина начала движение"
        }
        if (!checkWheels()) {  //берется значение true либо false, в зависимости от результата цикла проверки колес checkWheels
            throw new StartCarException("У машины проблема с колесами");
        }
        if (gasTank.getVolume() <= 0) {  //если бензина нет или меньше 0, то выводим ошибку
            throw new StartCarException("У машины нет бензина");
        }
        if (electrics.isBroken()) {  //если элктрика сломана, то выводим ошибку
            throw new StartCarException("У машины сломана электрика");
        }
        if (engine.isBroken()) { //если двигатель сломан, то выводим ошибку
            throw new StartCarException("У машины сломан двигатель");
        }
    }

    public boolean checkWheels() { //создаем метод для проверки колес
        if (wheels.length == 4) {  //проверяем, что колес у нас 4шт, или длина массива =4
            boolean wheelsIsOk = true; //по умолчаню пишем, чт колеса не сломаны
            for (Wheel wheel : wheels) { //начинаем перебираем массив всех колес (через alt+enter цикл for each)
                if (wheel.isBroken()) { //если хотя бы одно колесо сломано (сюда передается статус колеса через геттер)
                    wheelsIsOk = false; //то здаем значение wheelsIsOk false
                    break; //и выходим из цикла
                }
            }
            return wheelsIsOk; //если колес 4 и они все не сломаны(проверили выше), то wheelsIsOk = true
        } else {
            return false; //если колес не 4
        }
    }

    //Остановить движение - меняет состояние движения. Для остановки не нужно условий.
    public void stop() {
        this.isMove = false;
        System.out.println("Машина остановилась");
    }

    //Включить фары - сообщает о работе фар.
    public void headlightsOn() {
        if (!headLights.isBroken()) { //если фары НЕ сломаны, то есть TRUE, то включаем фары
            System.out.println("Включаем фары");
        }
    }
//метод, который меняет колесо на НОВОЕ
    public void switchWheel(int index, Wheel wheel) {
        if (wheel.getWheelRadius() == carWheelRadius) { //проверяем, что радиус НОВОГО КОЛЕСА такой же как радиус колес у машины - carWheelRadius
            wheels[index] = wheel; //меняем колесо с индексом INDEX на НОВОЕ
        }
    }

    public Wheel[] getWheels() {
        return wheels;
    } //гетер для вывода списка колес
}
