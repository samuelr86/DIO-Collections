# Collection

## Introdução
É um objeto que agrupa múltiplos elementos(variáveis primitivas ou objetos) dentro de uma única unidade.<br>
Serve para armazenar e processar conjuntos de dados de forma eficiente.<br>
É composta por interfaces, implementações ou classes e algoritmos.<br>
A interface Collections implementa Set e List, que serão estudas nessa aula.<br>
A interface Map não extende de Collections porém está inclusa no universo do Collections Framework.<br>

Em Set estudaremos sobre HashSet e LinkedHashSet.<br>

Em List estudaremos sobre ArrayList e LinkedList.<br>

Em Map estudaremos sobre HashMap e LinkedHashMap.<br>

Noção sobre TreeMap e TreeSet, que são baseadas em árvores binárias.

## List

A interface List pertence ao pacote java.util.<br>
Permite elementos duplicados e garante ordem de inserção.<br>

### Vector
 - Implementa a interface List
 - Pensar em Vector quando for trabalhar com Threads

### ArrayList
 - Implementa a interface List
 - Deve ser usado quando mais operaçoes de pesquisas são necessárias
 - Usa internamente um Array

### Linkedlist
 - Implementa a interface List e a interface Queue
 - Deve ser usado quando mais operações de inserção e exclusão são necessárias
 - Usa internamente uma Lista duplamente Ligada

## Set

A interface Set pertence ao pacote java.util.<br>
Não permite elementos duplicados.<br>
Não possui índice.<br>

### TreeSet
A treeSet implementa NavigableSet que por sua vez extende de SortSet que extende de Set.<br>
Usa bastante o TreeSet quando fazemos ordenação.<br>
Internamente usa o TreeMap para o armazenamento de elementos.<br>
Mantém por padrão ordenação natural.<br>
Tem menor performance do que o HashSet e o LinkedHashSet.<br>
Não permite nenhum elemento nulo.

### HashSet
Implementa diretamente de Set, e usa internamente o HashMap para armazenar seus elementos.<br>
Não mantém qualquer ordem dos elementos.<br>
Têm melhor performance que o LinkedHashSet e o TreeSet.<br>
Permite no máximo um elemento nulo.

### LinkedHashSet
Extende de HashSet.<br>
Internamente usa o LinkedHashMap para armazenamento.<br>
Mantém os elementos por ordem de inserção<br>
Também permite no maximo um elemento nulo.

## Map

A interface pertence ao pacote java.util.<br>
Não extende da interface Collections.<br>
É um objeto que podemos colocar multiplos elementos.<br>
Cada objeto dentro de Map tem uma chave e um valor unicos, porém os valores podem se repetir em outros objetos.<br>
Nenhuma das três são sincronizaveis porém é possível utilizar desse recurso:
```
    Collections.synchronizedMap();
```
### HashMap
A ordem de iteração é aleatória.<br>
Permite chaves nulas.<br>
### LinkedHashMap
A ordem de iteração é de acordo com a ordem de inserção.<br>
Permite chaves nulas.<br>
### TreeMap
Tem um performance menor em relação aos hashTable e hashMap.<br>
A ordem de iteração é de acordo com a ordem natural.<br>
Não permite chaves nulas.<br>

Todas elas necessitam rescrever os métodos equals e hashCode.