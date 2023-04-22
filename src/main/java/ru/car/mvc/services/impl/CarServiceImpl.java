package ru.car.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.car.mvc.dao.CarDAO;
import ru.car.mvc.dao.impl.CarDAOImpl;
import ru.car.mvc.models.Car;
import ru.car.mvc.services.CarService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getAll() {
        return carDAO.getAll();
    }

    @Override
    @Transactional
    public Car getById(int id) {
        return carDAO.getById(id);
    }

    @Override
    @Transactional
    public void create(Car car) {
        carDAO.create(car);
    }

    @Override
    @Transactional
    public void delete(int id) {
        carDAO.delete(id);
    }
}
