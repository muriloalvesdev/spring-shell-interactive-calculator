package com.muriloalvesdev.interactivecalculator.operation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumCommandUnitTest {

    private final SumCommand command = new SumCommand();

    @Test
    void shouldSumTwoNumbers() {
        //GIVEN
        var expression = "1 + 2";

        //WHEN
        var result = this.command.sum(expression);

        //THEN
        assertThat(result).isEqualTo("result: 3");
    }

    @Test
    void shouldSumThreeNumbers() {
        //GIVEN
        var expression = "1 + 2+10";

        //WHEN
        var result = this.command.sum(expression);

        //THEN
        assertThat(result).isEqualTo("result: 13");
    }

    @Test
    void shouldSumMultipleNumbers() {
        //GIVEN
        var expression = "1 + 2+10+10+20+100";

        //WHEN
        var result = this.command.sum(expression);

        //THEN
        assertThat(result).isEqualTo("result: 143");
    }

}
