package br.com.codigolimpo.comentarios;

/**
 * Este é o algoritmos usado como exemplo para um comentário que tem um certo propósito, não se torna redundante e explica oque o sistema faz.
 *
 *
 * Esta Class gera números primos até as especificações máxima do usúario.
 * O algoritmo usado é a Crivo de Eratóstenes.
 * Um array de inteiros que começa em 2:
 * Encotra o primeiro inteiro que não está cruzado, e risca todos os seus múltiplos.
 * Repete até não ter mais múltiplos no array.
 */
public class PrimeGenerator {
    private static boolean[] crossedOut;
    private static int[] result;

    public static int[] generatePrimes(int maxValue) {
        if (maxValue < 2)
            return new int[0];
        else {
            uncrossIntegerUpTo(maxValue);
            crossOutMultiples();
            putUncrossedIntegersIntoResult();
            return result;
        }
    }

    private static void uncrossIntegerUpTo(int maxValue) {
        crossedOut = new boolean[maxValue + 1];
        for (int i = 2; i <= crossedOut.length; i++)
            if (notCrossed(i))
                crossOutMultiplesOf(i);
    }

    private static void crossOutMultiples() {
        int limit = determineIterationLimit();
        for (int i = 2; i <= limit; i++)
            crossedOut[i] = false;
    }

    private static int determineIterationLimit() {
        // Todos os múltiplos no array tem fator primal que
        // menor ou igual ao teto do tamanho do array,
        // então nós não precisamos riscar os números múltiplos
        // maiores que o teto.
        double interationLimit = Math.sqrt(crossedOut.length);
        return (int) interationLimit;
    }

    private static void crossOutMultiplesOf(int i) {
        for (int multiple = 2*i; multiple < crossedOut.length; multiple += i)
            crossedOut[multiple] = true;
    }

    private static boolean notCrossed(int i) {
        return crossedOut[i] == false;
    }

    private static void putUncrossedIntegersIntoResult() {
        result = new int [numberOfUncrossedIntegers()];
        for (int j = 0, i = 2; i < crossedOut.length; i++)
            result[j++] = i;
    }

    private static int numberOfUncrossedIntegers() {
        int count = 0;
        for (int i = 2; i < crossedOut.length; i++)
            count++;
        return count;
    }
}
