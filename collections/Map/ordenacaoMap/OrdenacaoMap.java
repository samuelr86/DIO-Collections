package Map.ordenacaoMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Dada as seguintes informações sobre livros e seus autores, crie um dicionário e ordene exibindo (Nome - Autor, Nome-Livro):
 *  - Autor = Hawking, Stephan - Livro = Uma breve história do tempo - Páginas = 256
 *  - Autor = Duhigg, Charles - Livro = O poder do hábito - Páginas = 400
 *  - Autor = Harari, Yuval Noah - Livro = 21 lições para o século 21 - Páginas = 432
 * 
 */
public class OrdenacaoMap {
    public static void main(String[] args) {
        
        Map<String, Livro> livros = new HashMap<>(){{
            put("HAWKING, Stephan", new Livro("Uma breve história do Tempo ", 256));
            put("DUHIGG, Charles", new Livro("O poder do hábito", 408));
            put("HARARI, Yuval Noah", new Livro("21 Lições para o século 21", 432));
            

        }};

        System.out.println();
        System.out.println("Ordenação Aleatória.");
        for(Map.Entry<String, Livro> livro : livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        System.out.println();
        System.out.println("Ordenação inserção");

        // por inserção sempre usar linkedhash...
        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("HAWKING, Stephan", new Livro("Uma breve história do Tempo ", 256));
            put("DUHIGG, Charles", new Livro("O poder do hábito", 408));
            put("HARARI, Yuval Noah", new Livro("21 Lições para o século 21", 432));
            

        }};

        for(Map.Entry<String, Livro> livro : livros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println();
        System.out.println("Ordem alfabética dos autores");

        Map<String, Livro> livros2 = new TreeMap<>(livros1);

        for(Map.Entry<String, Livro> livro : livros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println();
        System.out.println("Ordem alfabética do nome dos livros");

        // vamos precisar do set e usar um comparator
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());

        // add todos os livros de uma vez
        livros3.addAll(livros.entrySet());

        // imprimindo os livros
        for(Map.Entry<String, Livro> livro : livros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println();
        System.out.println("Ordem por número de páginas");

        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPagina());
        livros4.addAll(livros.entrySet());

        for (Map.Entry<String,Livro> entry : livros4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getPaginas());
        }

    }
}
