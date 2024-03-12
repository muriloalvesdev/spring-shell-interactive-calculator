package com.muriloalvesdev.interactivecalculator.config;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class PromptCustom implements PromptProvider {

  @Override
  public AttributedString getPrompt() {
    return new AttributedString(
        "interactive-calculator: > ", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
  }
}
