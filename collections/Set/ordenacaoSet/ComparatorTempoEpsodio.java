package ordenacaoSet;

import java.util.Comparator;

public class ComparatorTempoEpsodio implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
    
        int tempo = Integer.compare(o1.getTempoEpsodio(), o2.getTempoEpsodio());
        if (tempo != 0)    return tempo;
            
        return o1.getNome().compareTo(o2.getNome());
    }

}
