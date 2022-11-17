package Map.ExercicioProposto3;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
        
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }

}
