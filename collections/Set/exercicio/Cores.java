package exercicio;

import java.util.Objects;

public class Cores implements Comparable<Cores>{

    private String cor;

    public String getCor() {
        return cor;
    }

    public Cores(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nCor = " + cor + "";
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    @Override
    public boolean equals(Object obj) {
        if(this ==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Cores cor = (Cores)obj;
        return obj.equals(cor.cor);
    }

    @Override
    public int compareTo(Cores o) {
        
        return this.getCor().compareToIgnoreCase(o.getCor());
    }

    public boolean startsWith(String string) {
        return false;
    }


   

    
    
}
