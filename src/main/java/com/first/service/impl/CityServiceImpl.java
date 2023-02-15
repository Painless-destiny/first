package com.first.service.impl;

import com.first.dao.CityDao;
import com.first.domain.City;
import com.first.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public Boolean save(City city) {
        return cityDao.insert(city) > 0;
    }

    @Override
    public Boolean update(City city) {
        return cityDao.updateById(city) > 0;
    }

    @Override
    public Boolean delete(Integer ID) {
        return cityDao.deleteById(ID) > 0;
    }

    @Override
    public City getById(Integer ID) {
        return cityDao.selectById(ID);
    }

    @Override
    public List<City> getAll() {
        return cityDao.selectList(null);
    }
}
