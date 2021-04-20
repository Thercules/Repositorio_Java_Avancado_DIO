package aula1;

import java.util.function.UnaryOperator;

public class imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println(retornarDobro.apply(valor)); // retorna o dobro do valor
        System.out.println(valor); // valor nao sera alterado
    }
}
