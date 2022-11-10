package exercicio;

import java.util.LinkedList;
import java.util.List;

public class ExercicioLinkedList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de uma aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        System.out.println("Resolva os exercícios utilizando os métodos da implementação LinkedList");
        
        System.out.println();
        System.out.println("Crie uma lista chamada notas2:");
        List<Double> notas2 = new LinkedList<>();

        System.out.println();
        System.out.println("Coloque todos os elementos da ArrayList nessa nova lista:");
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println();
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo:");
        System.out.println(notas2.get(0));

        System.out.println();
        System.out.println("Mostre a primeira nota da nova lista removendo-o:");
        notas2.remove(0);
        System.out.println(notas2);
        System.out.println(notas2.get(0));

        
    }
}
