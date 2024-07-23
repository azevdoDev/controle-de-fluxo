
/*
 * Este código Java simula o gasto de uma mesada em doces.
 * 
 * 1. Declaração da classe e método principal
 * public class ExemploWhile {
 *     public static void main(String[] args) {
 * - `public class ExemploWhile`: Declara uma classe pública chamada `ExemploWhile`.
 * - `public static void main(String[] args)`: Declara o método principal (`main`), que é o ponto de entrada do programa. Este método é chamado quando você executa a aplicação.
 * 
 * 2. Inicialização da mesada
 * Double mesada = 50.0;
 * - `Double mesada = 50.0;`: Inicializa uma variável `mesada` do tipo `Double` com o valor de 50.0. Esta variável representa a quantidade de dinheiro que Joãozinho tem para gastar.
 * 
 * 3. Laço `while` para gastar a mesada
 * while (mesada > 0) {
 *     Double valorDoce = valorAleatorio();
 * - `while (mesada > 0)`: Inicia um laço `while` que continua enquanto a variável `mesada` for maior que 0.
 * - `Double valorDoce = valorAleatorio();`: Chama o método `valorAleatorio` para obter um valor aleatório entre 2 e 8 (representando o preço de um doce) e armazena esse valor na variável `valorDoce`.
 * 
 * 4. Verificação do valor do doce e atualização da mesada
 * if (valorDoce > mesada)
 *     valorDoce = mesada;
 * 
 * System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
 * mesada = mesada - valorDoce;
 * - `if (valorDoce > mesada)`: Verifica se o valor do doce é maior que a mesada restante.
 *   - `valorDoce = mesada;`: Se o valor do doce for maior que a mesada restante, ajusta o valor do doce para ser igual ao valor da mesada restante (para garantir que Joãozinho não gaste mais do que tem).
 * - `System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");`: Imprime o valor do doce e uma mensagem indicando que o doce foi adicionado ao carrinho.
 * - `mesada = mesada - valorDoce;`: Subtrai o valor do doce da mesada, atualizando o valor da mesada restante.
 * 
 * 5. Mensagem final
 * System.out.println("Mesada:" + mesada);
 * System.out.println("Joãozinho gastou toda sua mesada em doces");
 * - `System.out.println("Mesada:" + mesada);`: Imprime o valor restante da mesada (que será 0 após o laço `while` terminar).
 * - `System.out.println("Joãozinho gastou toda sua mesada em doces");`: Imprime uma mensagem final indicando que Joãozinho gastou toda a sua mesada em doces.
 * 
 * 6. Método para gerar valores aleatórios
 * private static double valorAleatorio() {
 *     return ThreadLocalRandom.current().nextDouble(2, 8);
 * }
 * - `private static double valorAleatorio()`: Declara um método privado e estático que retorna um valor do tipo `double`.
 * - `return ThreadLocalRandom.current().nextDouble(2, 8);`: Gera e retorna um valor aleatório entre 2 (inclusive) e 8 (exclusive), representando o preço de um doce.
 * 
 * Em resumo, o código simula Joãozinho gastando sua mesada de 50.0 em doces, onde cada doce tem um preço aleatório entre 2 e 8. O laço continua até que a mesada de Joãozinho seja completamente gasta.
 */
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        Double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);

    }

}
