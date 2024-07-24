package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, "Fabric1"));
        cars.add(new Car("model2", 2, "Fabric2"));
        cars.add(new Car("model3", 3, "Fabric3"));
        cars.add(new Car("model4", 4, "Fabric4"));
        cars.add(new Car("model5", 5, "Fabric5"));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
