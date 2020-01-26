package com.suatkeskin.creationalpatterns.builder;

import com.suatkeskin.creationalpatterns.builder.builders.CarBuilder;
import com.suatkeskin.creationalpatterns.builder.builders.CarManualBuilder;
import com.suatkeskin.creationalpatterns.builder.cars.Car;
import com.suatkeskin.creationalpatterns.builder.cars.Manual;
import com.suatkeskin.creationalpatterns.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
