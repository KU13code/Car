package ru.car.mvc.dao;

import ru.car.mvc.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getAll();

    Car getById(int id);

    void create(Car car);

    void delete(int id);
}
