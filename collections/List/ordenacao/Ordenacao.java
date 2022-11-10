package List.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Jon", 18, "preto"));
        gatos.add(new Gato("Simba", 6, "tigrado"));
        gatos.add(new Gato("Jon", 12, "amarelo"));

        System.out.println("--\t Ordem de Inserção\t---");
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\t Ordem aleatória\t---");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\t Ordem Natural (Nome)\t---");
        // para ordenar por ordem natura precisamos implementar um Comparable e sobrescrever o método compareTo na classe Gato
        // a lista tem um método sort mas recebe um Comparator, neste caso não serve
        // então usamos o Collections que também usa o método sort e recebe como parametro uma List
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\t Ordem Idade\t---");
        // para ordenar por idade precisamos criar uma classe que implemente o Comparator e sobrescrever o método compare
        // através do método sort, há uma sobrecarga que recebe uma lista e um comparator, e este fará a ordenação por idade
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\t Ordem cor\t---");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);
        System.out.println();

        System.out.println("--\t Ordem Nome/Cor/Idade\t---");
        // se os nomes forem iguais, ordene pela cor
        // se os nomes e as cores forem iguais, ordene pela idade

        Collections.sort(gatos, new ComparatorNomeIdadeCor());
        System.out.println(gatos);


    }
}
