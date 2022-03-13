package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class BigmacTestSuite {

    @Test
    void testDefaultBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder().build();
        //When
        String defaultBun = bigmac.getBun();
        int defaultBurgers = bigmac.getBurgers();
        String defaultSauce = bigmac.getSauce();
        //Then
        Assertions.assertEquals("Standard", defaultSauce);
        Assertions.assertEquals(1, defaultBurgers);
        Assertions.assertEquals("Standard", defaultSauce);
        Assertions.assertTrue(bigmac.getIngredients().isEmpty());
    }
    @Test
    void testBunSetter(){
        //Given
        Bigmac bigmac_standard = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BigmacBuilder.BUN_STANDARD)
                .build();
        Bigmac bigmac_sesame = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BigmacBuilder.BUN_SESAME)
                .build();
        Bigmac.BigmacBuilder bigmac_exception = new Bigmac.BigmacBuilder();

        //When
        String bun_standard = bigmac_standard.getBun();
        String bun_sesame = bigmac_sesame.getBun();

        //Then
        Assertions.assertEquals(Bigmac.BigmacBuilder.BUN_SESAME, bun_sesame);
        Assertions.assertEquals(Bigmac.BigmacBuilder.BUN_STANDARD, bun_standard);
        Assertions.assertThrows(IllegalStateException.class, () -> bigmac_exception.bun("Kodilla"));
    }
    @Test
    void testBurgersSetter(){
        //Given
        Bigmac doubleBigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .build();
        Bigmac pentaBigmac = new Bigmac.BigmacBuilder()
                .burgers(5)
                .build();
        //When
        int two = doubleBigmac.getBurgers();
        int five = pentaBigmac.getBurgers();
        //Then
        Assertions.assertEquals(2,two);
        Assertions.assertEquals(5,five);
    }
    @Test
    void testSauceSetter(){
        //Given
        Bigmac bigmac_1000 = new Bigmac.BigmacBuilder()
                .sauce(Bigmac.BigmacBuilder.SAUCE_1000)
                .build();
        Bigmac bigmac_bbq = new Bigmac.BigmacBuilder()
                .sauce(Bigmac.BigmacBuilder.SAUCE_BBQ)
                .build();
        Bigmac bigmac_standard = new Bigmac.BigmacBuilder()
                .sauce(Bigmac.BigmacBuilder.SAUCE_STANDARD)
                .build();
        Bigmac.BigmacBuilder bigmac_exception = new Bigmac.BigmacBuilder();
        //When
        String sauce_1000 = bigmac_1000.getSauce();
        String sauce_bbq = bigmac_bbq.getSauce();
        String sauce_standard = bigmac_standard.getSauce();
        //Then
        Assertions.assertEquals(Bigmac.BigmacBuilder.SAUCE_1000, sauce_1000);
        Assertions.assertEquals(Bigmac.BigmacBuilder.SAUCE_BBQ, sauce_bbq);
        Assertions.assertEquals(Bigmac.BigmacBuilder.SAUCE_STANDARD, sauce_standard);
        Assertions.assertThrows(IllegalStateException.class, () -> bigmac_exception.sauce("Kodilla"));
    }
    @Test
    void testIngredientsSetter(){
        //Given
        Bigmac bigmac_1 = new Bigmac.BigmacBuilder()
                .ingredients(Bigmac.BigmacBuilder.INGREDIENTS_BACON)
                .build();
        Bigmac bigmac_5 = new Bigmac.BigmacBuilder()
                .ingredients(Bigmac.BigmacBuilder.INGREDIENTS_BACON)
                .ingredients(Bigmac.BigmacBuilder.INGREDIENTS_CHEESE)
                .ingredients(Bigmac.BigmacBuilder.INGREDIENTS_CHAMPIGNONS)
                .ingredients(Bigmac.BigmacBuilder.INGREDIENTS_CUCUMBER)
                .ingredients(Bigmac.BigmacBuilder.INGREDIENTS_LETTUCE)
                .build();
        Bigmac.BigmacBuilder bigmac_exception = new Bigmac.BigmacBuilder();
        //When
        int ingredients_1 = bigmac_1.getIngredients().size();
        int ingredients_5 = bigmac_5.getIngredients().size();
        //Then
        Assertions.assertEquals(1, ingredients_1);
        Assertions.assertEquals(5, ingredients_5);
        Assertions.assertThrows(IllegalStateException.class, () -> bigmac_exception.ingredients("Kodilla"));

    }
}
