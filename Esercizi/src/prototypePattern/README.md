## Esercizio sul Prototype Patter

In questo esercizio, l'obbiettivo è applicare il Prototype Pattern.

Il Prototype design pattern consente a un oggetto di creare oggetti personalizzati senza conoscere la loro classe o i dettagli su come crearli.

Specifica il tipo di oggetti da creare utilizzando un'istanza prototipo e crea nuovi oggetti copiando questo prototipo.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio

1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Client**

**Client** crea un oggetto ConcretePrototype e setta il nome uguale a "Pippo".
Crea un altro oggetto clonando il primo creato e stampa i nomi dei due oggetti nella console. 
Il risultato sarà 2 personaggi uguali con lo stesso nome.

### Struttura dell'esercizio

L'interfaccia **Prototype** estende Cloneable e definisce un metodo per clonare l'oggetto.

La classe **ConcretePrototype** implementa **Prototype**. 

Nella classe **Client** viene creato un oggetto ConcretePrototype e poi viene clonato.

### Documentazione

Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!
- [Builder Pattern - refactoring guru](https://www.oodesign.com/prototype-pattern.html)
- [Builder Pattern - OOD](https://www.oodesign.com/prototype-pattern.html)
