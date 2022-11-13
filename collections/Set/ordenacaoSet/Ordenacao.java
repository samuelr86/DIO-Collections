package ordenacaoSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dada as seguintes informações sobre serie favoritas,
 * crie um conjunto e ordene este cojunto exibindo:
 * (nome - genero - tempo de epsódio)
 * 
 * Serie1 = nome: GOT, genero: fantasia, tempoEpsodio:60
 * Serie2 = nome: Dark, genero: drama, tempoEpsodio:60
 * Serie3 = nome: That '70s show', genero: comedia, tempoEpsodio:25
 * 
 */

public class Ordenacao {
    public static void main(String[] args) {
        
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("That '70 show", "comédia", 25));
            
        }};



        System.out.println("--\t Ordem Aleatória\t--");
        for (Serie serie : series) {
            System.out.printf("| %s - %s - %dmin\t", serie.getNome(), serie.getGenero(), serie.getTempoEpsodio());  
        }
       ;
        System.out.println();







        System.out.println("--\t Ordem Inserção\t--");
         
        Set<Serie> series1 = new LinkedHashSet<>(){{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("That '70 show", "comédia", 25));
            
        }};
        for (Serie serie : series1) {
            System.out.printf("| %s - %s - %dmin\t", serie.getNome(), serie.getGenero(), serie.getTempoEpsodio());  
        }
        System.out.println();






        System.out.println("--\t Ordem Natural (Tempo Epsodio)\t--");

        Set<Serie> series2 = new TreeSet<>(series1);

        for (Serie serie : series2) {
            System.out.printf("| %s - %s - %dmin\t", serie.getNome(), serie.getGenero(), serie.getTempoEpsodio());  
        }
        System.out.println();






        System.out.println("--\t Ordem nome/genero/tempoEpsodio\t--");

        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        series3.addAll(series);

        for (Serie serie : series3) {
            System.out.printf("| %s - %s - %dmin\t", serie.getNome(), serie.getGenero(), serie.getTempoEpsodio());  
        }
        System.out.println();





        System.out.println("--\t Ordem Gênero\t--");

        Set<Serie> series4 = new TreeSet<>(new ComparatorGenero());
        series4.addAll(series);
        System.out.println(series4.toString());
        System.out.println();


        

        System.out.println("--\t Ordem Tempo Epsódio\t--");
        Set<Serie> series5 = new TreeSet<>(new ComparatorTempoEpsodio());
        series5.addAll(series);

        System.out.println(series5);
        System.out.println();
    }
}
