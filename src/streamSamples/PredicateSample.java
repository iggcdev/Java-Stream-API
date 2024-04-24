package streamSamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateSample {
    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","kotlin", "python","javascript","c#","rust","c","c++");

        Predicate<String> moreThen5Chars = word -> word.length()>5;
        //words.stream().filter(moreThen5Chars).forEach(System.out::println);

        words.stream().filter(s -> s.length()<=3).forEach(System.out::println);
    }
}
