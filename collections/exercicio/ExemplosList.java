package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemplosList{
    public static void main(String[] args) {
// Dada uma lista com 7 notas de uma aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie uma lista adicione sete notas:");
        
        List<Double> notas = new ArrayList<>(); // a partir do jdk7 - Diamond Operator
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        
        System.out.println(notas.toString());
        // Outra forma de criar uma lista, porém é limita e não permite adicionar e remover elementos
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); 

        System.out.println();
        System.out.println("Exiba a posição da nota 5.0:");
        notas.indexOf(5d);

        System.out.println();
        System.out.println("Adicione a nota 8.0 na posição 4:");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Substitura a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Confira se a nota 5.0 está na lista:");
        System.out.println(notas.contains(5d));

        System.out.println();
        System.out.println("Exiba todas as notas na ordem em que foram inseridas:");
        for (Double nota : notas) System.out.println(nota);
        

        System.out.println();
        System.out.println("Exiba a terceira nota a ser adicionada:");
        System.out.println(notas.get(2));
        System.out.println(notas);

        System.out.println();
        System.out.println("Exiba a menor nota:");
        // não ha método nativo em ArrayList para fazer essa busca, porém podemos recorrer a Collections
        System.out.println(Collections.min(notas));

        System.out.println();
        System.out.println("Exiba a maior nota:");
        System.out.println(Collections.max(notas));

        System.out.println();
        System.out.println("Exiba a soma de valores:");
        // não há um método de soma, mas podemos usar um método iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("A soma das notas é: " + soma);

        System.out.println();
        System.out.println("Exiba a média das notas:");
        System.out.println("A média das notas é: " + (soma/notas.size()));

        System.out.println();
        System.out.println("Remove a nota 0.0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println();
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println();
        System.out.println("Remova as notas menores que 7.0:");
        // novamente usamos o iterator
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println();
        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println();
        System.out.println("Confira se a lista esta vazia:");
        System.out.println(notas.isEmpty());




    }
}