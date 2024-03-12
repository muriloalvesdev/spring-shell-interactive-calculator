# Calculadora Interativa usando Spring Shell

Este projeto fornece uma calculadora interativa simples implementada usando o Spring Shell. Ele permite que os usuários realizem operações matemáticas básicas, como adição e subtração, por meio de uma interface de linha de comando.

## Recursos

- **Adição**: Realize operações de adição com o comando `sum`.
- **Subtração**: Realize operações de subtração com o comando `subtract`.

## Utilização

Para usar a calculadora, siga estes passos:

1. Clone o repositório:

    ```bash
    git clone https://github.com/muriloalvesdev/interactive-calculator.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd interactive-calculator 
    ```

3. Compile o projeto:

    ```bash
    mvn clean package
    ```

4. Execute a aplicação:

    ```bash
    java -jar target/interactive-calculator-1.0.0.jar
    ```

5. Use os comandos disponíveis para realizar operações matemáticas:

    - Adição:

        ```bash
        sum 1 + 2 + 3
        ```

    - Subtração:

        ```bash
        subtract 10 - 5 - 3
        ```

6. Veja o resultado exibido no terminal.

## Exemplo

Aqui está um exemplo de uso da calculadora:

```bash
$ sum 1 + 2 + 3
result: 6
