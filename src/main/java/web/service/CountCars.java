package web.service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CountCars {


    public CountCars() {
    }

    public List<Cars> countCarsint(int count){
        Cars car1 = new web.model.Cars("one", "ferrari", 1);
        Cars car2 = new web.model.Cars("two", "ford", 2);
        Cars car3 = new web.model.Cars("three", "fiat", 3);
        Cars car4 = new web.model.Cars("four", "foton", 4);
        Cars car5 = new web.model.Cars("five", "faw", 5);
        List<Cars> carsmes = new ArrayList<>();
        if (count >= 2){
            carsmes.add(car1);
            carsmes.add(car2);
        }
        if (count >= 3) {
            carsmes.add(car3);
        }
        if (count >= 4) {
            carsmes.add(car4);
        }
        if (count >= 5) {
            carsmes.add(car5);
        }
        return carsmes;
    }
}
