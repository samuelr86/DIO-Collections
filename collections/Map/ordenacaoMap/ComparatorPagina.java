package Map.ordenacaoMap;

import java.util.*;
import java.util.Map.Entry;
public class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{


    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return Integer.compare(livro1.getValue().getPaginas(),livro2.getValue().getPaginas());
    }
    
}