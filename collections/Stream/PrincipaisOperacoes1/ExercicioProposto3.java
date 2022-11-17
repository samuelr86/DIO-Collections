package Stream.PrincipaisOperacoes1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
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
        /*
        [1] Refatorando com CLASSE ANÓNIMA
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer,Contato>>() {

            @Override
            public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
            
        });
        [2] Refatorando com COMPARATOR.COMPARING
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {

            @Override
            public Integer apply(Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));
        */
        //[3] Refatorando com Lambda
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
            cont -> cont.getValue().getNumero()));
            
        set.addAll(agenda.entrySet());     

        for (Map.Entry<Integer,Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }


        System.out.println("Ordem nome contato");
        // Precisamos organizar os valores. Logo:
        //[1] CLASSE ANÔNIMA
        /*
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>(){

            @Override
            public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
                
                return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
            }

        });
        
        //[2] CLASSE COMPARATOR.COMPARING
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>,String>() {

            @Override
            public String apply(Entry<Integer, Contato> cont) {
                return cont.getValue().getNome();
            }
            
        }));
        //[3] LAMBDA
        */
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        
        set1.addAll(agenda.entrySet());

        for (Map.Entry<Integer,Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }


    }
}
