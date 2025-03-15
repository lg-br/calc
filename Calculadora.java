package meu.pacote; // Substitua pelo nome correto do seu pacote

/**
 * Classe Calculadora para realizar operações matemáticas básicas.
 */
public class Calculadora {

    /** Constante representando o primeiro número de teste. */
    private static final double NUMERO1 = 10.0;

    /** Constante representando o segundo número de teste. */
    private static final double NUMERO2 = 5.0;

    /**
     * Método para somar dois números.
     * @param valor1 O primeiro número (não pode ser alterado dentro do método).
     * @param valor2 O segundo número (não pode ser alterado dentro do método).
     * @return O resultado da soma de valor1 e valor2.
     */
    public double somar(final double valor1, final double valor2) {
        return valor1 + valor2;
    }

    /**
     * Método para subtrair dois números.
     * @param valor1 O minuendo (não pode ser alterado dentro do método).
     * @param valor2 O subtraendo (não pode ser alterado dentro do método).
     * @return O resultado da subtração de valor1 e valor2.
     */
    public double subtrair(final double valor1, final double valor2) {
        return valor1 - valor2;
    }

    /**
     * Método para multiplicar dois números.
     * @param valor1 O primeiro número (não pode ser alterado dentro do método).
     * @param valor2 O segundo número (não pode ser alterado dentro do método).
     * @return O resultado da multiplicação de valor1 e valor2.
     */
    public double multiplicar(final double valor1, final double valor2) {
        return valor1 * valor2;
    }

    /**
     * Método para dividir dois números.
     * @param valor1 O dividendo (não pode ser alterado dentro do método).
     * @param valor2 O divisor (não pode ser alterado dentro do método).
     * @return O resultado da divisão de valor1 por valor2.
     * @throws IllegalArgumentException Se valor2 for zero.
     */
    public double dividir(final double valor1, final double valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("não permitida.");
        }
        return valor1 / valor2;
    }

    /**
     * Método principal que testa as operações da Calculadora.
     * @param args Argumentos da linha de comando.
     */
    public static void main(final String[] args) {
        Calculadora calc = new Calculadora();

        // Testes das operações da calculadora usando constantes
        double resultadoSomar = calc.somar(NUMERO1, NUMERO2);
        double resultadoSubtrair = calc.subtrair(NUMERO1, NUMERO2);
        double resultadoMultiplicar = calc.multiplicar(NUMERO1, NUMERO2);
        double resultadoDividir = calc.dividir(NUMERO1, NUMERO2);

        // Exibição dos resultados
        System.out.println("Soma: " + resultadoSomar);
        System.out.println("Subtração: " + resultadoSubtrair);
        System.out.println("Multiplicação: " + resultadoMultiplicar);
        System.out.println("Divisão: " + resultadoDividir);
    }
}
