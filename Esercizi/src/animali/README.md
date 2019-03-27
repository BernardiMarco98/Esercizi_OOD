## Esercizio sul Factory Pattern

In questo esercizio, l'obbiettivo è applicare il Factory Pattern.

Il Factory Design Pattern è probabilmente il modello di progettazione più utilizzato nei linguaggi di programmazione moderni come Java e C #. È disponibile in diverse varianti e implementazioni.
In questo esercizio verrà utilizzata un versione semplificata e molto popolare oggigiorno

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio

1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

**Executor** crea una "Factory".
La factory produce 3 oggetti diversi (un Cane, un Gatto e una Pecora).
Per ogni oggetto viene eseguito il metodo emettiVerso() che stampa 3 stringhe diverse poichè sono stati creati 3 oggetti diversi dalla
stessa factory.

### Struttura dell'esercizio

La classe **Factory** ritorna un nuovo oggetto in base alle necessità del client.
La classe **Factory** puo' produrre una serie di oggetti creati da classi che implementano tutte la classe **Animale** 

Ogni "ConcreteProduct", ovvero le diverse specie di animali, hanno caratteristiche diverse ma sono create dalla stessa "Factory".
Il metodo *emettiVerso* serve solamente per testare la corretta implementazione del patter.

### Documentazione

Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!

- [FactoryPattern](https://www.oodesign.com/factory-pattern.htmll)
- [Diagramma del FactoryPattern](https://vivekcek.wordpress.com/2013/03/17/simple-factory-vs-factory-method-vs-abstract-factory-by-example/)
