package streamSamples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá! Prazer em conhecer voce.";

        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacao.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------");
        List<String> listaSaudacao2 = Stream.generate(() -> "Ola, bom dia!").limit(6).toList();
        listaSaudacao2.forEach(System.out::println);

        System.out.println("-----------------------------");
        List<Integer> lista = Stream.generate(()-> RandomGenerator.getDefault().nextInt()).limit(5).toList();
        lista.forEach(System.out::println);
    }
}
