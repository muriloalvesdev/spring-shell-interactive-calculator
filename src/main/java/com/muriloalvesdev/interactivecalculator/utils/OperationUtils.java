package com.muriloalvesdev.interactivecalculator.utils;

import java.util.regex.Pattern;

/**
 * Esta classe fornece métodos para manipulação de strings, como remoção de espaços em branco,
 * divisão de strings por operadores e remoção de vírgulas e pontos.
 */
public final class OperationUtils {
  private OperationUtils() {}

  /**
   * Remove todos os espaços em branco de uma string.
   *
   * @param str A string da qual os espaços em branco serão removidos.
   * @return A string resultante após a remoção dos espaços em branco.
   */
  public static String removeAllWhitespace(String str) {
    return str.replaceAll(" ", "");
  }

  /**
   * Divide uma string em substrings usando um operador específico como delimitador.
   *
   * @param str A string a ser dividida.
   * @param operator O operador usado como delimitador para dividir a string (-, +, /, *).
   * @return Um array de strings contendo as substrings resultantes da divisão.
   */
  public static String[] splitExpressionByOperator(String str, String operator) {
    return str.split(Pattern.quote(operator));
  }

  /**
   * Remove todas as vírgulas de uma string e substitui pontos por nada.
   *
   * @param str A string a ser processada.
   * @return A string resultante após a limpeza das vírgulas e pontos.
   */
  public static String removeCommasAndDots(String str) {
    return str.replaceAll(",", "").replaceAll("\\.", "");
  }
}
