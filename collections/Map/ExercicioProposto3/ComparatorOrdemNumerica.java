package Map.ExercicioProposto3;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
        
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }

}
