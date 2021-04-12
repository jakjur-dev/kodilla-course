package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void TestGetPeopleQuantity() {

        //Given
        World world = new World();

        Continent africa = new Continent("Africa");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");

        europe.addCountry(new Country(new BigDecimal("66000000"), "France"));
        europe.addCountry(new Country(new BigDecimal("83000000"), "Germany"));

        asia.addCountry(new Country(new BigDecimal("1395000000"),"China" ));
        asia.addCountry(new Country(new BigDecimal("1325000000"),"India" ));

        africa.addCountry(new Country(new BigDecimal("206000000"),"Nigeria" ));
        africa.addCountry(new Country(new BigDecimal("115000000"),"Ethiopia" ));

        world.addContinent(africa);
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal expectedPopulation = new BigDecimal("3190000000");
        BigDecimal calculatedPopulation = world.getPeopleQuantity();

        //Then
        assertEquals(expectedPopulation, calculatedPopulation);
    }
}
