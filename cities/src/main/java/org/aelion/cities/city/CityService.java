package org.aelion.cities.city;

import java.util.List;

public interface CityService {
    List<City> findAll();
    City findByCode(String code);
}
