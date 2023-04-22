package ru.car.mvc.dao.impl;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.car.mvc.dao.CarDAO;
import ru.car.mvc.models.Car;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CarDAOImpl implements CarDAO {

    private final SessionFactory sessionFactory;



    @Override
    public List<Car> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Car> cars = session.createQuery("from Car").getResultList();
        return cars;
    }

    @Override
    public Car getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Car car = session.get(Car.class, id);
        return car;
    }

    @Override
    public void create(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getById(id));
    }
}
