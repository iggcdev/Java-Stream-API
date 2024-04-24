package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenges {
    public  List<Integer> challengeBaseList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Challenges() {
        this.challengeBaseList = new ArrayList<>(challengeBaseList);
    }

    public List<Integer> getChallengeBaseList() {
        return challengeBaseList;
    }

    public void challenge1(){
        //Desafio 1 - Mostre a lista na ordem numérica:
        //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        List<Integer> listaOrdenada = getChallengeBaseList().stream().sorted().toList();
        //listaOrdenada.forEach(System.out::println);
        System.out.println(listaOrdenada);
    }
    public void challenge2(){
        //Desafio 2 - Imprima a soma dos números pares da lista:
        //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

        Integer result = getChallengeBaseList().stream()
                .filter(integer ->  integer % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(result);
    }
    public void challenge3(){
        //Desafio 3 - Verifique se todos os números da lista são positivos:
        //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
       if(getChallengeBaseList().stream().allMatch(n -> n>0)) System.out.println("Todos sao positivos");
    }
    private void challenge4() {
        //Desafio 4 - Remova todos os valores ímpares:
        //Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
        System.out.println(getChallengeBaseList().stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList()));
    }

    private void challenge5() {
        //Desafio 5 - Calcule a média dos números maiores que 5:
        //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        Double mediaDeMaioresQue5 = Double.valueOf(getChallengeBaseList().stream()
                .filter(n -> n > 5).toList()
                .stream().reduce(0,Integer::sum))
                / //Dividido por:
                (double) getChallengeBaseList().stream()
                .filter(n -> n > 5).count();
        var media = getChallengeBaseList().stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average().orElse(0);
        System.out.println(media);
        System.out.println(mediaDeMaioresQue5);
    }
    public static void main(String[] args) {
        Challenges challenges = new Challenges();

        challenges.challenge1();//[1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10]
        challenges.challenge2();//34
        challenges.challenge3();//"Todos sao positivos"
        challenges.challenge4();//[2, 4, 6, 8, 10, 4]
        challenges.challenge5();//8.0


    }


}
