package com.first.service;

import com.first.domain.City;

import java.util.List;

public interface CityService {
    Boolean save(City city);
    Boolean update(City city);
    Boolean delete(Integer ID);
    City getById(Integer ID);
    List<City> getAll();
}
