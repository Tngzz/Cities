package org.aelion.cities.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/cities")

public class Cities {
    @Autowired
    private CityService service;
    @GetMapping
    public List<City> findAll() {
        return service.findAll();
    }
    @GetMapping("/{code}")
    public ResponseEntity<?> findById(@PathVariable String code) {
        try {
            City city = service.findByCode(code);
            return ResponseEntity.ok(city);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
