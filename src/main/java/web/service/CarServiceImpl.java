package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    CarServiceImpl() {
        cars.add(new Car("BMW", "Black", 525));
        cars.add(new Car("Audi","Blue", 100));
        cars.add(new Car("Mazda","Red", 323));
        cars.add(new Car("Toyota","Red", 70));
        cars.add(new Car("Subaru","White", 1000));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getNumberCar(String count) {
        if (Integer.parseInt(count) >= 5) {
            return cars;
        }

        List<Car> car = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(count); i++) {
            car.add(cars.get(i));
        }
        return car;
    }
}
