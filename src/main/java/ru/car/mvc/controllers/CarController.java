package ru.car.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.car.mvc.models.Car;
import ru.car.mvc.services.CarService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/")
    public String cars(Model model){
        model.addAttribute("cars", carService.getAll());

        return "car";
    }

    @GetMapping("/{id}")
    public String carInfo(@PathVariable("id") int id, Model model){
        model.addAttribute("car", carService.getById(id));
        return "car-info";
    }


    @GetMapping("/create")
    public String carCreate(Model model){
        model.addAttribute("create", true);
        model.addAttribute("car", new Car());
        return "car-create-update";
    }


    @GetMapping("/update/{id}")
    public String carUpdate(@PathVariable("id") int id, Model model){
        model.addAttribute("create", false);
        model.addAttribute("car",carService.getById(id));
        return "car-create-update";

    }

    @PostMapping("/create-update")
    public String carCreate(@Valid @ModelAttribute("car") Car car, BindingResult result){
        if (result.hasErrors()) return "car-create-update";
            carService.create(car);
            return "redirect:/";

    }



//    @PostMapping("/update")
//    public String carUpdate(@Valid @ModelAttribute("car") Car car, BindingResult result){
//        if (result.hasErrors()) return "car-update";
//        carService.create(car);
//        return "redirect:/";
//    }

    @PostMapping("/delete/{id}")
    public String carDelete(@PathVariable("id") int id){
        carService.delete(id);
        return "redirect:/";
    }
}







