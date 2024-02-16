package org.aelion.cities.city;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter

public class City {
    @Id
    private String inseeCode;
    private String postalCode;
    private String name;
}
