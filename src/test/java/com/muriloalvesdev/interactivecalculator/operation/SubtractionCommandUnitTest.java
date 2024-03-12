package com.muriloalvesdev.interactivecalculator.operation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SubtractionCommandUnitTest {

  private final SubtractionCommand command = new SubtractionCommand();

  @Test
  void shouldSubtractTwoNumbers() {
    // GIVEN
    var expression = "1 - 2";

    // WHEN
    var result = this.command.subtract(expression);

    // THEN
    assertThat(result).isEqualTo("result: -1");
  }

  @Test
  void shouldSubtractThreeNumbers() {
    // GIVEN
    var expression = "1 - 2-10";

    // WHEN
    var result = this.command.subtract(expression);

    // THEN
    assertThat(result).isEqualTo("result: -11");
  }

  @Test
  void shouldSubtractMultipleNumbers() {
    // GIVEN
    var expression = "1 - 2-10-10-20-100";

    // WHEN
    var result = this.command.subtract(expression);

    // THEN
    assertThat(result).isEqualTo("result: -141");
  }
}
