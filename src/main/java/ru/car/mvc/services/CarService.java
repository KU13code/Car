package ru.car.mvc.services;

import ru.car.mvc.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();

    Car getById(int id);

    void create(Car car);

    void delete(int id);
}
