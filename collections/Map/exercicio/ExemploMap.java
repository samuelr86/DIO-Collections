package Map.exercicio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
 * Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
 *  - modelo = gol - consumo = 14,4km/l
 *  - modelo = uno - consumo = 15,6km/l
 *  - modelo = mobi - consumo = 16,1km/l
 *  - modelo = hb20 - consumo = 14,5km/l
 *  - modelo = kwid - consumo = 15,6km/l
 * 
 */
public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Criar um dicionário que relacione os modelos e seus respectivos consumos.");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println();
        System.out.println("Substitua o valor do Gol por 15.2 km/l");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println();
        System.out.println("Confira se o modelo Tucson esta no dicionário:");
        System.out.println(carrosPopulares.containsKey("Tucson"));

        System.out.println();
        System.out.println("Exiba o terceiro modelo adicionado:");
        
 
        System.out.println();
        System.out.println("Exiba os modelos: ");
        System.out.println(carrosPopulares.keySet());
        
        System.out.println("Exiba os consumos:");
        System.out.println(carrosPopulares.values());

        System.out.println();
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        // System.out.println(consumoMaisEficiente);
        
        Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            // se o valor for igual ao consumo eficiente exibir a chave do modelo eficiente
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente=entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + ", consumo: "+ consumoMaisEficiente);
            }
        }

        System.out.println();
        System.out.println("Exiba o modelo menos econômico e seu consumo:");
        // Aqui preciso trabalhar com o chave e valor separadamente
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente ="";
        for (Entry<String,Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente=entry.getKey();
                System.out.println("Modelo meno eficiente: " + modeloMenosEficiente+", consumo: "+consumoMenosEficiente) ;
            }
        }

        System.out.println();
        
        
        
        
        
        System.out.println("Exiba a soma dos consumos:");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) soma+=iterator.next();
        System.out.println(soma);







        System.out.println();
        System.out.println("Exiba a média dos consumos deste dicionário de carros:");
        System.out.println(soma/(carrosPopulares.size()));

        
        
        
        
        
        System.out.println();
        System.out.println("Remova os modelos com o consumo igual a 15.6km/l");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while(iterator2.hasNext()) if(iterator2.next().equals(15.6)) iterator2.remove();
        System.out.println(carrosPopulares);




        
        System.out.println();
        System.out.println("Exiba todos os carros na ordem em que foram informados:");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares1.toString());

        System.out.println();
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares2.toString());

        System.out.println();
        System.out.println("Apague o conjunto de carros:");
        carrosPopulares.clear();
        carrosPopulares1.clear();
        carrosPopulares2.clear();

        System.out.println();
        System.out.println("Confira se o dicionário está vazio: ");
        System.out.println(carrosPopulares.isEmpty());
        System.out.println(carrosPopulares1.isEmpty());
        System.out.println(carrosPopulares2.isEmpty());
        
    }
}
