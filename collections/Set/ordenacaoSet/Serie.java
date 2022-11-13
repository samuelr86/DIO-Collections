package ordenacaoSet;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpsodio;

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpsodio() {
        return tempoEpsodio;
    }
    public Serie(String nome, String genero, Integer tempoEpsodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpsodio = tempoEpsodio;
    }
    @Override
    public String toString() {
        return "\nSerie [nome=" + nome + ", genero=" + genero + ", tempoEpsodio=" + tempoEpsodio + "]";
    }


    @Override
    public int hashCode() {
        
        return Objects.hash(nome, genero, tempoEpsodio);
    }



    @Override
    public boolean equals(Object obj) {
        if(this ==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie)obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpsodio.equals(serie.tempoEpsodio);
    }




    @Override
    public int compareTo(Serie serie) {
        
        int epsodio = Integer.compare(this.getTempoEpsodio(), serie.getTempoEpsodio());
        if(epsodio != 0) return epsodio;

        return this.getGenero().compareTo(serie.getGenero());


    }

    
}
