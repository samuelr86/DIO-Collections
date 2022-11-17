package Map.ExercicioProposto3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * dadas as seguintes informações de id e contato, crie um dicionário e ordene este dicionário exibindo:
 * (Nome id - Nome contato)
 * 
 * id = 1 - Contato = nome: Samy, numero: 2222;
 * id = 2 - Contato = nome: Jon, numero: 6666;
 * id = 3 - Contato = nome: Pecks, numero: 1111;
 * 
 */
public class ExercicioProposto3 {
    public static void main(String[] args) {
        System.out.println("Ordem Aleatória");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Samy", 2222));
            put(2, new Contato("Jon", 6666));
            put(3, new Contato("Pecks", 1111));
        }};

        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem Inserção");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Samy", 2222));
            put(2, new Contato("Jon", 6666));
            put(3, new Contato("Pecks", 1111));
        }};

        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem Id");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda){{
            put(1, new Contato("Samy", 2222));
            put(2, new Contato("Jon", 6666));
            put(3, new Contato("Pecks", 1111));
        }};

        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem número telefone");
        // Precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());

        for (Map.Entry<Integer,Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }


        System.out.println("Ordem nome contato");
        // Precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());

        for (Map.Entry<Integer,Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }


    }
}
