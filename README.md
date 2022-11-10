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

