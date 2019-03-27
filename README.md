## Esercizio sul Visitor Pattern

In questo esercizio l'obiettivo è implementare il visitor pattern.

Visitor è un design pattern comportamentale che consente di separare gli algoritmi dagli oggetti su cui operano.

Visitor rappresenta un'operazione da eseguire sugli elementi di una struttura di oggetti.

Visitor consente di definire una nuova operazione senza modificare le classi degli elementi su cui opera.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio
1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

La classe **Executor** crea un oggetto Fattoria ed esegue il metodo accept().

L'esercizio simula il comportamento di un "visitatore" di una fattoria.

Viene stampato in console il numero di animali presenti in ogni "recinto" e il totale di animali presenti nella fattoria

### Struttura dell'esercizio
La classe **ConcreteVisitor** implementa l'interfaccia **Visitor** e definisce il comportamento del metodo visit per ogni tipo di oggetto
al quale viene applicato.

Le classi **Gallina** , **Mucca** e **Pecora** implementano l'interfaccia **AnimaliFattoria** per definire i diversi tipi di oggetti che
compongono **Fattoria**.

### Documentazione
Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!
- [Visitor Pattern - OOD](https://www.oodesign.com/visitor-pattern.html)
- [Visitor Pattern - refactoring guru](https://refactoring.guru/design-patterns/visitor)

