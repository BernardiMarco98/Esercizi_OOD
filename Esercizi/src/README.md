## Esercizio sul Singleton Pattern

In questo semplice esercizio, l'obbiettivo è applicare il Singleton Pattern.

The singleton pattern è uno dei più semplici dei design patterns: esso coinvolge solo una classe che è responsabile di istanziare se stessa, per essere sicura di non creare più di un' istanza; contemporaneamente fornisce un punto di accesso globale a quell'istanza. In questo caso la stessa istanza può essere usata ovunque, essendo impossibile invocarla direttamente il costruttore ogni volta.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio

1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

Executor eseguirà 5 volte i metodi "getInstance()" e "doSomething()" della classe **SingletonPattern** ma a console verrà stampata una sola volta l'istanza e 5 volte il messaggio di "doSomething()". Questo evidenzia il funzionamento del pattern.

### Struttura dell'esercizio

La classe **SingletonPattern** si istanzia da sola per essere sicura che venga creata una sola istanza di se stessa e dando un metodo di 
accesso globale per quell'istanza. 

La classe **Executor** esegue 5 volte i metodi di **SingletonPattern**. Come previsto dall' implementazione del metodo, l'istanza 
verrà creata una volta sola.

### Documentazione

Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!

- [SingletonPattern - OOD](https://www.oodesign.com/singleton-pattern.html)
- [SingletonPattern - refactoring.guru](https://refactoring.guru/design-patterns/singleton)
