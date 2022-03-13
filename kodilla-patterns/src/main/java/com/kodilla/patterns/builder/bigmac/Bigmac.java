package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        public static String BUN_STANDARD = "Standard";
        public static String BUN_SESAME = "Sesame";

        public static String SAUCE_STANDARD = "Standard";
        public static String SAUCE_BBQ = "Bbq";
        public static String SAUCE_1000 = "1000";

        public static String INGREDIENTS_LETTUCE = "Lettuce";
        public static String INGREDIENTS_ONION = "Onion";
        public static String INGREDIENTS_BACON = "Bacon";
        public static String INGREDIENTS_CUCUMBER = "Cucumber";
        public static String INGREDIENTS_CHILLI = "Chilli";
        public static String INGREDIENTS_CHAMPIGNONS = "Champignons";
        public static String INGREDIENTS_PRAWNS = "Prawns";
        public static String INGREDIENTS_CHEESE = "Cheese";

        private String bun = "Standard";
        private int burgers = 1;
        private String sauce = "Standard";
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if(bun.equals(BUN_STANDARD) || bun.equals(BUN_SESAME)){
                this.bun = bun;
            }else{
                throw new IllegalStateException("Unknown bun");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals(SAUCE_BBQ) || sauce.equals(SAUCE_1000) || sauce.equals(SAUCE_STANDARD)){
                this.sauce = sauce;
            }else{
                throw new IllegalStateException("Unknown sauce");
            }
            return this;
        }

        public BigmacBuilder ingredients(String ingredients) {
            if(ingredients.equals(INGREDIENTS_BACON) ||
                    ingredients.equals(INGREDIENTS_CHEESE) ||
                    ingredients.equals(INGREDIENTS_CHILLI) ||
                    ingredients.equals(INGREDIENTS_CUCUMBER) ||
                    ingredients.equals(INGREDIENTS_LETTUCE) ||
                    ingredients.equals(INGREDIENTS_CHAMPIGNONS) ||
                    ingredients.equals(INGREDIENTS_ONION) ||
                    ingredients.equals(INGREDIENTS_PRAWNS)) {
                this.ingredients.add(ingredients);
            }else{
                throw new IllegalStateException("Unknown ingredients");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
