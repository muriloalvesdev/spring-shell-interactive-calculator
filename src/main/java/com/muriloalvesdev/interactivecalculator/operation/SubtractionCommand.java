package com.muriloalvesdev.interactivecalculator.operation;

import com.muriloalvesdev.interactivecalculator.utils.OperationUtils;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * Componente do Spring Shell para realizar operações de subtração.
 * Esta classe permite a subtração de números em uma expressão matemática fornecida pelo usuário.
 * Nota: Esta classe pode realizar subtração de números em qualquer formato, exceto quando números negativos estão no início.
 * O Spring Shell pode interpretar o hífen no início como uma opção não reconhecida, o que causa problemas de parsing.
 * Exemplos aceitáveis de expressões:
 * - "1 - 2- 3"
 * - "1 - 2 - 3"
 * - "1      -   2         -       3"
 *
 */
@ShellComponent
public class SubtractionCommand {

    /**
     * Método do Spring Shell para subtrair números em uma expressão matemática.
     *
     * @param expression A expressão matemática a ser processada. Esta expressão pode conter números e operadores de subtração.
     * @return
     */
    @ShellMethod(value = "Subtract numbers", key = "subtract")
    public String subtract(@ShellOption(help = "subtraction mathematical expression") String expression) {
        String cleanExpression = OperationUtils.removeAllWhitespace(expression);

        String[] numbers = OperationUtils.splitExpressionByOperator(cleanExpression, "-");

        int result = Integer.parseInt(OperationUtils.removeCommasAndDots(numbers[0]));

        for (int i = 1; i < numbers.length; i++) {
            result -= Integer.parseInt(OperationUtils.removeCommasAndDots(numbers[i]));
        }

        return "result: " + result;
    }
}
