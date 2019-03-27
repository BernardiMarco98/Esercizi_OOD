## Esercizio sull' Abstract Factory Pattern

In questo esercizio, l'obbiettivo è applicare l' Abstract Factory pattern.
Usando questo pattern viene definito un framework, che produce oggetti che seguono un modello generale e in fase di esecuzione questa "fabbrica astratta" è abbinata a qualsiasi "fabbrica concreta" per produrre oggetti. In parole povere, la Fabbrica astratta è una super-fabbrica che crea altre fabbriche (Fabbrica di fabbriche).

Abstract Factory offre l'interfaccia per creare una famiglia di oggetti correlati, senza specificare esplicitamente le loro classi.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio

1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

**Executor** crea 2 AbstractFactory, una normale e una che produce forme smussate.
Le due fabbriche concrete producano entrambe 2 forme (un rettangolo e un quadrato).
Infine le 4 forme "prodotte" vengano disegnate, con il metodo disegna(), e vengono stampate nella console.

### Struttura dell'esercizio

L' **AbstractFactory** è una classe astratta che viene estesa dalle due classi **ConcreteFactory** e **ConcreteSmussatoFactory**
Entrambe producono due tipi di oggetti differenti ma che implementano tutti la stessa interfaccia **Forma**

La classe **FactoryMaker** crea le due ConcreteFactory in base alla richiesta.

### Documentazione

Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!

- [AbstractFactoryPattern](https://www.oodesign.com/abstract-factory-pattern.html)
- [Diagramma del AbstractFactoryPattern](https://vivekcek.wordpress.com/2013/03/17/simple-factory-vs-factory-method-vs-abstract-factory-by-example/)
