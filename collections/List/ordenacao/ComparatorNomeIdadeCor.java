package List.ordenacao;

import java.util.Comparator;

public class ComparatorNomeIdadeCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());

        if (nome != 0 ) return nome;    
        if (cor != 0)return cor;
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
    
}
