package org.aelion.cities.city;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository<City, String> {
}
