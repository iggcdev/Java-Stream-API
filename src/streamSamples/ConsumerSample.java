package streamSamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerSample {

    //Utilizar Consumer


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        //Utilizando Consumer1
        Consumer<Integer> pares = n -> {
            if (n % 2 == 0) {
                System.out.print(n+" ");
            }
        };
        numeros.stream().forEach(pares);

        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0){
                    System.out.print(integer+" ");
                }
            }
        });
        numeros.stream().forEach(n -> {if (n % 2 ==0) System.out.print(n+" ");});
    }
}
