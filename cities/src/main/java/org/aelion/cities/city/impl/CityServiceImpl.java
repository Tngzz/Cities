package org.aelion.cities.city.impl;

import org.aelion.cities.city.City;
import org.aelion.cities.city.CityRepository;
import org.aelion.cities.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        return repository.findAll();
    }

    @Override
    public City findByCode(String code) {
        return repository.findById(code)
                .orElseThrow();
    }
}
