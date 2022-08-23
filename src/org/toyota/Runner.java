package org.toyota;

import org.toyota.car.details.*;
import org.toyota.car.models.Camry;
import org.toyota.car.models.Solara;

public class Runner {
    public static void main(String[] args) { //в теле этого метода создаем автомобиль
        //создаем предварительно все детали для машины
        GasTank gasTank = new GasTank();
        Engine engine = new Engine();
        Electrics electrics = new Electrics();
        HeadLights headLights = new HeadLights();
        Wheel[] wheels = generateWheels(CarWheelRadius.R17); //передаем в метод ниже - generateWheels, значение радиуса колес. Для камри это 17
        CruiseControl cruiseControl = new CruiseControl();
        Usb usb = new Usb();

        Camry camry = new Camry("black", 250, TransmissionType.AUTOMATIC, false, 10000,
                gasTank, wheels, engine, electrics, headLights, CarWheelRadius.R17, cruiseControl, usb);
        camry.onMusic();
    }
//ниже метод, который создает массив колес. Сразу 4 шт. Этот метод относится к классу RUNER
    public static Wheel[] generateWheels(CarWheelRadius carWheelRadius) { //в качестве атрибута будем передавать радиус carWheelRadius в колесо
        Wheel[] wheels = new Wheel[4]; //создали пустой массив колес без значений радиусов
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(carWheelRadius); //передаем радиус в каждое колесо или создаем по одному колеса
        }
        return wheels; //возвращаем массив колес
    }
}
