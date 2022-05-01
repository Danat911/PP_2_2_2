package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.List;


public interface CarService {
    List<Car> getNumberCar(String count);
    List<Car> getCars();

}
