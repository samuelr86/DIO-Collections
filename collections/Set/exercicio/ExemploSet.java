package exercicio;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet{
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de uma aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:


        System.out.println("Crie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);
        System.out.println();

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println("não é possivel buscar por uma posição específica.");
        System.out.println();

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        System.out.println("não é possivel alterar uma posição específica.");
        System.out.println();
        
        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        System.out.println("não é possivel alterar um elemento específico.");
        System.out.println();
        
        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5d));
        System.out.println();

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println("não é possivel buscar por uma posição específica.");
        System.out.println();

        System.out.println("Exiba a menor nota: ");
        Collections.min(notas);
        System.out.println(Collections.min(notas));
        System.out.println();

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.max(notas));
        System.out.println();

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        System.out.println(soma);
        System.out.println();

        System.out.println("Exiba a média das notas:");
        System.out.println(soma/notas.size());
        System.out.println();

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println();

        System.out.println("Remova as notas na posição 0:");
        System.out.println("Não é possível fazer alterações na lista.");
        System.out.println();

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);
        System.out.println();

        System.out.println("Exiba todas as notas na ordem em que fora informadas: ");
        Set<Double> notas3 = new LinkedHashSet<>();
        notas3.add(7d);
        notas3.add(8.5);
        notas3.add(9.3);
        notas3.add(5d);
        notas3.add(7d);
        notas3.add(0d);
        notas3.add(3.6);
        System.out.println(notas3);

        System.out.println("Exiba todas as notas em ordem crescente: ");
        Set<Double> notas4 = new TreeSet<>(notas3);
        System.out.println(notas4);


        System.out.println("Apague todo o conjunto:");
        notas4.clear();

        System.out.println("Confira se o conjunto está vazio: ");
 
        System.out.println(notas.isEmpty());
        System.out.println(notas3.isEmpty());
        System.out.println(notas4.isEmpty());






        
    }
}