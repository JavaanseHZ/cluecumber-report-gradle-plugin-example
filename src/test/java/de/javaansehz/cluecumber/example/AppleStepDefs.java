package de.javaansehz.cluecumber.example;

import io.cucumber.java8.En;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleStepDefs implements En {

    private Integer apples;

    public AppleStepDefs() {

        Given("I have {int} apple/apples", (Integer apples) -> this.apples = apples);

        When("I add {int} apple/apples", (Integer apples) -> this.apples += apples);

        Then("I will have {int} apple/apples", (Integer apples) -> assertEquals(this.apples, apples));
    }
}