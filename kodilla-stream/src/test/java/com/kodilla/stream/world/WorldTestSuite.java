package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent EU = new Continent("EU");
        EU.addCountryToCountryList(new Country("Deutschland",new BigDecimal("58472305")));
        EU.addCountryToCountryList(new Country("Germany",new BigDecimal("12358213")));
        EU.addCountryToCountryList(new Country("Niemcy",new BigDecimal("823523")));

        Continent NA = new Continent("NA");
        NA.addCountryToCountryList(new Country("USA",new BigDecimal("129481235")));
        NA.addCountryToCountryList(new Country("Canada",new BigDecimal("324624")));
        NA.addCountryToCountryList(new Country("Proland",new BigDecimal("1324623")));

        World world = new World();
        world.addContinentToContinentList(EU);
        world.addContinentToContinentList(NA);

        //When
        BigDecimal peopleGiven = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("202784523"),peopleGiven);
    }
}
