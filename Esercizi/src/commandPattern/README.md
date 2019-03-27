## Esercizio sul Command Pattern

L'obbiettivo di questo esercizio è applicare il Command Pattern.

Il Command Pattern incapsula comandi (chiamati metodi) in oggetti che consentono di emettere richieste senza conoscere l'operazione richiesta o l'oggetto richiedente. Il modello di progettazione del comando fornisce le opzioni per accodare comandi, annullare / ripristinare azioni e altre manipolazioni.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio

1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

**Executor** crea un oggetto lampadina, un interruttore e 2 comandi (accendi e spegni).

Al client verrà chiesto di inserire da tastiera un valore ("A" o "S"). Se viene inserito "A" verrà applicato il comando di accendere la lampadina, se viene inserito "S" verrà applicato il comando di spegnere la lampadina. Nel caso di valore errato verrà chiesto nuovamente l'inserimento del parametro.

### Struttura dell'esercizio
L'interfaccia **Command** definisce il metodo execute() e viene implementato da **Accendi** e **Spegni** che sono i ConcreteCommands.

Le classi **Interruttore** ed **Luce** sono l'Invoker e il Receiver del pattern.

Quando il client inserisce da tastiera "A/a" la luce verrà accesa, quando inserisce "B/b" la luce verrà spenta.

### Documentazione

Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!

- [Command Pattern - OOD](https://www.oodesign.com/command-pattern.html)
- [Command Pattern - refactoring guru](https://refactoring.guru/design-patterns/command)
