## Esercizio sul Builder Pattern 

In questo esercizio, l'obbiettivo è applicare il Builder Pattern.

Questo pattern consente a un client di costruire un oggetto complesso specificando solo il suo tipo e il suo contenuto, essendo protetto dai dettagli relativi alla rappresentazione dell'oggetto. In questo modo il processo di costruzione può essere utilizzato per creare diverse rappresentazioni. La logica di questo processo è isolata dai passi reali usati nella creazione dell'oggetto complesso, quindi il processo può essere riutilizzato per creare un oggetto diverso dalla stessa serie di oggetti semplici come il primo.

Il Builder Pattern definisce un'istanza per la creazione di un oggetto ma lascia che le sottoclassi decidano quale classe istanziare e
si riferisce all'oggetto appena creato tramite un'interfaccia comune.

### Requisiti:
- Qualsiasi IDE che supporti Java
- JDK 1.8 o superiore

### Test esercizio

1. Aprire la cartella del progetto nel proprio IDE
2. Compilare ed eseguire la classe **Executor**

**Executor** crea 3 builder differenti per ogni tipo di oggetto da costruire. 
Definisce 3 direttori per ogni tipo di oggetto.
Costruisce i 3 oggetti e tramite il metodo getVehicle() vengano stampate a video le caratteristiche dei singoli oggetti costruiti.

### Struttura dell'esercizio

La classe **Vehicle** definisce l'oggetto che i distinti "costruttori" devono costruire.

L'interfaccia **VehicleBuilder** viene implementata da **AutoBuilder** , **MotoBuilder** e **BikeBuilder** .

La classe "Director" decide quale veicolo costruire.

### Documentazione

Vuoi approfondire il funzionamento del pattern di questo esercizio? Segui questi collegamenti!

- [Builder Pattern - refactoring guru](https://refactoring.guru/design-patterns/builder)
- [Builder Pattern - OOD](https://www.oodesign.com/builder-pattern.html)
