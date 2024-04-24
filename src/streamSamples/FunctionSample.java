package streamSamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionSample {
    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
     * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
     */
    public static void main(String[] args) {
        List<Integer> mumbers = Arrays.asList(1,2,3,4,5,6,7);

        //Function<Integer,Integer> duplicate = number -> number*2;

        List<Integer> duplicaterdNumbers = mumbers.stream().map(n -> n * 2).toList();
        duplicaterdNumbers.forEach(System.out::println);
    }
}
