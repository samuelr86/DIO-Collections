package Map.exercicio;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Dada a população estimada de alguns estados do NE brasileiro, faça
 * - Estado = PE, População = 9616621
 * - Estado = AL, População = 3351543
 * - Estado = CE, População = 9187103
 * - Estado = RN, População = 3534265
 * 
 */

public class ExercicioProposto {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações:");
        Map<String, Long> estados = new HashMap<>() {
            {
                put("PE", 9616621L);
                put("AL", 3534543L);
                put("CE", 9187103L);
                put("RN", 3534265L);

            }
        };

        for (Map.Entry<String, Long> estado : estados.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();
        System.out.println("Substitua a população do estado do RN por 3.534.165");
        estados.put("RN", 3534165L);
        for (Map.Entry<String, Long> estado : estados.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();
        System.out.println("Confira se o estado da PB está no dicionário:");

        System.out.println(estados.containsKey("PB"));

        System.out.println();
        System.out.println("Exiba o estado de PE:");
        System.out.println("PE - " + estados.get("PE"));

        System.out.println();
        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Long> estados1 = new LinkedHashMap<>() {
            {
                put("PE", 9616621L);
                put("AL", 3534543L);
                put("CE", 9187103L);
                put("RN", 3534265L);

            }
        };

        for (Map.Entry<String, Long> estado : estados1.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();
        System.out.println("Exiba os estados e suas populações em ordem alfabética");

        Map<String, Long> estados3 = new TreeMap<>(estados) {
            {
                put("PE", 9616621L);
                put("AL", 3534543L);
                put("CE", 9187103L);
                put("RN", 3534265L);

            }
        };

        for (Map.Entry<String, Long> estado : estados3.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();
        System.out.println("Exiba o estado como o menor população e sua quantidade:");
        Long menorPopulacao = Collections.min(estados.values());

        Set<Map.Entry<String, Long>> entries = estados.entrySet();
        String estadoMenorPop = "";

        for (Map.Entry<String, Long> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenorPop = entry.getKey();
                System.out.println("Estado menos populoso: " + estadoMenorPop + " - População: " + menorPopulacao);
            }
        }

        System.out.println();
        System.out.println("Exiba o estado com a maior população e sua quantidade:");
        Long maiorPopulacao = Collections.max(estados.values());

        Set<Map.Entry<String, Long>> entries1 = estados.entrySet();
        String estadoMaiorPop = "";

        for (Map.Entry<String, Long> entry : entries1) {
            if (entry.getValue().equals(maiorPopulacao)) {
                estadoMaiorPop = entry.getKey();
                System.out.println("Estado mais populoso: " + estadoMaiorPop + " - População: " + maiorPopulacao);
            }
        }

        System.out.println();
        System.out.println("Exiba a soma da população desses estados:");

        Iterator<Long> iterator = estados.values().iterator();
        Long soma = 0L;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println();
        System.out.println("Exiba a média da população deste dicionário de estados:");
        System.out.println(soma / estados.size());

        System.out.println();
        System.out.println("Remova os estados com a população menor que 4.000.000:");

        Iterator<Long> iterator2 = estados.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals(4000000L)) {
                iterator2.remove();
            }
        }
        System.out.println(estados);

        System.out.println();
        System.out.println("Apague o dicionário de estados:");

        estados.clear();
        estados1.clear();
        estados3.clear();

        System.out.println();
        System.out.println("Confira se o dicionário está vazio:");
        System.out.println(estados.isEmpty());
        System.out.println(estados1.isEmpty());
        System.out.println(estados3.isEmpty());

    }
}
