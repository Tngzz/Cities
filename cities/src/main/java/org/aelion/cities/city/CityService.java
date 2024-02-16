package org.aelion.cities.city;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CityService {
    List<City> findAll();
    City findByCode(String code);

    ResponseEntity<?> createCity(City city);
}
