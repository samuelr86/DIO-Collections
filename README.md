# Collection
- Introdução

É um objeto que agrupa múltiplos elementos(variáveis primitivas ou objetos) dentro de uma única unidade.

Serve para armazenar e processar conjuntos de dados de forma eficiente.

É composta por interfaces, implementações ou classes e algoritmos.

A interface Collections implementa Set e List, que serão estudas nessa aula. 

A interface Map não extende de Collections porém está inclusa no universo do Collections Framework

Em Set estudaremos sobre HashSet e LinkedHashSet.

Em List estudaresmo sobre ArrayList e LinkedList.

Em Map estudaremso sobre HashMap e LinkedHashMap.

## List

A interface List pertence ao pacote java.util.
Permite elementos duplicados e garante ordem de inserção.

- Vector: implementa a interface List
pensa em Vector quando for trabalhar com Threads

- ArrayList: implementa a interface List
Deve ser usado quando mais operaçoes de pesquisas são necessárias
Usa internamente um Array

- Linkedlist: implementa a interface List e a interface Queue
Deve ser usado quando mais operações de inserção e exclusão são necessárias
Usa internamente uma Lista duplamente Ligada

