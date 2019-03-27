## Esercizio su Chain of Responsability Pattern

In questo esercizio, l'obbiettivo è applicare il Chain of Responsability pattern.

Chain of Responsibility è un design pattern comportamentale che consente di passare richieste lungo una catena di handlers. Dopo aver ricevuto una richiesta, ciascun handlers decide di elaborare la richiesta o di passarla al successivo handler della catena.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio

1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

**Executor** crea i due handler "Direttore" e "Responsabile".
Con il metodo setSuccessor() viene definito il nodo successivo della catena.
Nel codice è presente un while con condizione sempre vera.
Nel while vieni richiesto di inserire tramite tastiera lo stipendio attuale che del client.
Se lo stipendio attuale è minore a l'aumento massimo che il responsabile può fare, la richiesta verrà gestita dal responsabile, altrimenti verrè gestita dal nodo successivo (Direttore). Se lo stipendio attuale è troppo alto anche per il Direttore, verrà stampato a console che lo stipendio è troppo alto e non è possibile un aumento.

Nella console verrà stampato: lo stipendio attuale, chi ha gestito la richiesta e lo stipendio dopo l'aumento.

### Struttura dell'esercizio
La classe astratta **AumentoStipendio** definisce il metodo per passare alla classe successiva nella "catena".

Le due classi **Responsabile** e **Direttore** estandano AumentoStipendio e definiscono la condizione per passare al nodo successivo 
della catena.

La classe **RichiestaAumento** definisce la richiesta.

### Documentazione

Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!
- [Chain of Responsability - refactoring guru](https://refactoring.guru/design-patterns/chain-of-responsibility)
- [Chain of Responsability - OOD](https://www.oodesign.com/chain-of-responsibility-pattern.html)
