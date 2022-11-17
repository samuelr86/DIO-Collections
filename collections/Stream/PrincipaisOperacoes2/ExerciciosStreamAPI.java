package Stream.PrincipaisOperacoes2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1","0","1","4","2","3","9","9","6","5");

        System.out.println("\t Imprima todos os elementos da lista de String\t");
        // numerosAleatorios.stream().forEach(System.out::println);
        
        numerosAleatorios.stream().forEach(new Consumer<String>() {


            @Override
            public void accept(String t) {
                System.out.println(t);
                
            }
            
        });

        System.out.println("\t Pegue os 5 primeiros números e coloque dentro de um Set\t");
        numerosAleatorios.stream()
                        .limit(5) // quantidade de elementos
                        .collect(Collectors.toSet()) // coletar esses elementos e colocá-los em um Set
                        .forEach(System.out::println); // imprimir os elementos

        /* ou guardar em uma variável
        Set<String> collectSet = numerosAleatorios.stream()
                                                .limit(5)
                                                .collect(Collectors.toSet());
        */

        System.out.println("\t Transforme esta lista de String em uma lista de números inteiros.\t");

        // List<Integer> numerosAleatorio1 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).foreach(System.out::println);

        numerosAleatorios.stream()
                            .map(new Function<String,Integer>() {

                                @Override
                                public Integer apply(String s) {
                                    return Integer.parseInt(s);
                                }
                                
                            })
                            .collect(Collectors.toList())
                            .forEach(System.out::println);

        System.out.println("\t Pegue os números pares e maiores que 2 e coloque em uma lista\t");

        /*
        numerosAleatorios.stream()
                            .map(Integer::parseInt)
                            .filter(i -> i % 2 == 0 && i > 2)
                            .collect(Collectors.toList())
                            .forEach(System.out::println);
        */
        List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
                            .map(Integer::parseInt)
                            .filter(new Predicate<Integer>() {

                                @Override
                                public boolean test(Integer i) {
                                    if(i % 2 == 0 && i > 2){
                                        return true;
                                    }
                                    return false;
                                }
                                
                            })
                            .collect(Collectors.toList());
        System.out.println(listaParesMaioresQue2);

        System.out.println();
        System.out.println("\tMostre a média dos números\t");
        
        /*
        numerosAleatorios.stream()
                        .mapToInt(Integer::parseInt)
                        .average()
                        .ifPresent(System.out::println);
        */
        numerosAleatorios.stream()
                            .mapToInt(new ToIntFunction<String>() {

                                @Override
                                public int applyAsInt(String s) {
                                    return Integer.parseInt(s);
                                }
                                
                            })
                            .average()
                            .ifPresent(new DoubleConsumer() {

                                @Override
                                public void accept(double v) {
                                    System.out.println(v);                                    
                                }
                            });
        
        System.out.println();
        System.out.println("\tRemova os valores ímpares\t");

        List<Integer> numerosAleatorioInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        
        numerosAleatorioInteger.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                if(t % 2 != 0) return true;
                return false;
            }
            
        });

        System.out.println(numerosAleatorioInteger);

        // OUTROS EXERCICIOS

        System.out.println("\tIgnore os 3 primeiros elementos da lista e imprima o restante");
        System.out.println("\tRetire os números repetidos e imprima quantos elementos sobram");
        System.out.println("\tMostre o menor valor da lista");
        System.out.println("\tMostre o maior valor da lista");
        System.out.println("\tPegue apenas os números ímpares e some-os");
        System.out.println("Mostre a lista em ordem númerica");
        System.out.println("\tAgrupe os valores ímpares múltiplos de 3 e de 5");
        //dica: collect(Collectors.groupingBy(new Function()))


    }
}
