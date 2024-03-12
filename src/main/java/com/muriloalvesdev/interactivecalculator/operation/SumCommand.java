package com.muriloalvesdev.interactivecalculator.operation;

import com.muriloalvesdev.interactivecalculator.utils.OperationUtils;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * Classe que implementa a funcionalidade de somar números em uma expressão matemática.
 * Esta classe permite a soma de números em uma expressão fornecida pelo usuário, que pode conter números e operadores de soma.
 * Exemplos aceitáveis de expressões:
 * - "1 + 2+ 3"
 * - "1 + 2 + 3"
 * - "1      +   2         +       3"
 */
@ShellComponent
public class SumCommand {

    /**
     * Método do Spring Shell para somar números em uma expressão matemática.
     *
     * @param expression A expressão matemática a ser processada. Esta expressão pode conter números e operadores de soma.
     * @return
     */
    @ShellMethod(value = "Sum numbers", key = "sum")
    public String sum(@ShellOption(help = "sum mathematical expression") String expression) {
        String cleanExpression = OperationUtils.removeAllWhitespace(expression);

        String[] numbers = OperationUtils.splitExpressionByOperator(cleanExpression, "+");

        int result = Integer.parseInt(OperationUtils.removeCommasAndDots(numbers[0]));

        for (int i = 1; i < numbers.length; i++) {
            result += Integer.parseInt(OperationUtils.removeCommasAndDots(numbers[i]));
        }

        return "result: " + result;
    }
}
