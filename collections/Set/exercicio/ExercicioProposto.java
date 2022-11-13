package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto {
    public static void main(String[] args) {

        // Crie um conjunto contendo as cores do arco-íris
        Set<Cores> arcoiris = new HashSet<>() {
            {
                add(new Cores("Vermelho"));
                add(new Cores("Verde"));
                add(new Cores("Amarelo"));
                add(new Cores("Azul"));
                add(new Cores("Violeta"));
                add(new Cores("Laranja"));
                add(new Cores("Anil"));

            }
        };

        System.out.println("Exiba as cores uma embaixo da outra: ");
        System.out.println(arcoiris);
        System.out.println();

        System.out.println("A quantidade de cores do arco-íris: " + arcoiris.size());
        System.out.println();

        System.out.println("Exibir as cores em ordem alfabética: ");
        Set<Cores> arcoiris2 = new TreeSet<>(arcoiris);

        for (Cores serie : arcoiris2) {
            System.out.printf("\n%s ", serie.getCor());
        }
        System.out.println();

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<Cores> arcoiris4 = new LinkedHashSet<>() {
            {
                add(new Cores("Vermelho"));
                add(new Cores("Verde"));
                add(new Cores("Amarelo"));
                add(new Cores("Azul"));
                add(new Cores("Violeta"));
                add(new Cores("Laranja"));
                add(new Cores("Anil"));

            }
        };
        List<Cores> arcoiris3 = new ArrayList<>(arcoiris4);
        Collections.reverse(arcoiris3);
        System.out.println(arcoiris3);

        System.out.println("Exiba todas as cores que começam com a letra V:");

        for (Cores cores : arcoiris3) {
            if(cores.startsWith("v")) System.out.println(cores);
        }
        
        System.out.println("Remova todas as cores que não começam com a letra V");

        Set<Cores> arcoiris6 = new TreeSet<>(arcoiris4);
        Iterator<Cores> iterator = arcoiris6.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("v")) iterator.remove();
        }
       
        

        System.out.println("Limpe o conjunto:" );

        arcoiris.clear();

        System.out.println("Confira se o conjunto esta vazio:");
        arcoiris.isEmpty();

    }
}
