package aula1.FatorialRecursivo;

//Aula sobre fatoriais recursivos.

import java.util.Arrays;

public class Composicaodefuncoes {
        public static void main(String[] args) {
            int[] valores = {1,2,3,4};

            // funcional
            Arrays.stream(valores)
                    .filter(numero -> numero % 2 == 0)
                    .map(numero -> numero * 2)
                    .forEach(numero -> System.out.println(numero));
        }
    }
}
