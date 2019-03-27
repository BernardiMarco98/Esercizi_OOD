## Esercizio sul Template Method Pattern

In questo esercizio l'obiettivo è implementare il template method pattern.

Il template method pattern definisce un algoritmo in una classe base usando operazioni astratte che le sottoclassi sovrascrivono per fornire un comportamento concreto.
Il template method definisce lo scheletro di un algoritmo in un'operazione, rinviando alcuni passaggi alle sottoclassi.
Il template method consente alle sottoclassi di ridefinire determinati passaggi di un algoritmo senza consentire loro di modificare la struttura dell'algoritmo.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio
1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

La classe **Executor** chiede al client di inserire da tastiera un parametro ("G" o "B") per scegliere quale Videogame avviare.
Se viene inserito "G" verrà creato un oggetto GranTurismo e verrà eseguito il metodo play() su di esso.
Se viene inserito "B" verrà creato un oggetto Battlefield e verrà eseguito il metodo play() su di esso.
Nel caso di valore non corretto, verrà stmpato un messaggio di errore.


### Struttura dell'esercizio
La classe astratta **Videogame** definisce il "template" che le altre sottoclassi dovranno implementare.

**GranTurismo** e **Battlefield** estendono Videogames.

**Executor** si comporta come un client e fa scegliere all'utente il gioco da inizializzare, eseguire e terminare.

### Documentazione
Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!
- [Template Method Pattern - OOD](https://www.oodesign.com/template-method-pattern.html)
- [Template Method Pattern - refactoring guru](https://refactoring.guru/design-patterns/template-method)
