package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    //    @GetMapping(value = "/cars")
//    public String printWelcome(@RequestParam(value = "count", required = false) String count, Model model) {
//
//        model.addAttribute("message", count);

        @GetMapping(value = "/cars")
        public String getNumberOfCar(@RequestParam(value = "count", required = false) String count, ModelMap model) {
            if (count == null) {
                model.addAttribute("message", carService.getCars());
            }
            else {
                model.addAttribute("message", carService.getNumberCar(count));
            }
            return "car";
        }
//        System.out.println("Heloo" + count);
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car());
//        cars.add(new Car());
//        cars.add(new Car());
//        cars.add(new Car());
//        cars.add(new Car());
        //model.addAttribute("cars", cars);
//        return "car";
    }

