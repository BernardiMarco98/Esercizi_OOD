## Esercizio sul Command Pattern

L'obbiettivo di questo esercizio è applicare il Command Pattern

L'interfaccia **Command** definisce il metodo execute() e viene implementato da **Accendi** e **Spegni** che sono i ConcreteCommands.

Le classi **Interruttore** ed **Luce** sono l'Invoker e il Receiver del pattern.

Quando il client inserisce da tastiera "A/a" la luce verrà accesa, quando inserisce "B/b" la luce verrà spenta.

Fonte:
[Command Pattern](https://www.oodesign.com/command-pattern.html)
