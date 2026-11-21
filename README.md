# Zoo Java Console Application
---
## Git

Voor het maken van deze opdracht wordt er gebruik gemaakt van het versiebeheersysteem Git.

Gebruikte **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/idea/). (**Niet verplicht**)

Gebruikte **SDK**: [JDK 1.8](https://bitbucket.org/kychu/zoo/downloads/java-1.8.0-openjdk-1.8.0.212-3.b04.redhat.windows.x86_64.zip).

Mocht er problemen zijn met het openen van dit project, creëer dan een nieuw project binnen jouw IDE en kopieer de Java bestanden uit `src/com/ing/zoo`

Stappen:

1. Clone deze repository.
2. Maak een nieuwe repository aan, bijvoorbeeld op [Github](https://www.github.com).
3. Push jouw veranderingen naar jouw repository.
4. Maak jouw repository openbaar (public).
4. Als de applicatie af is, push dan de laatste versie naar jouw `master` branch.

--- 
## Opdracht
- Maak de applicatie af.
- Reorganiseer eventueel de folder structuur.
- Refactor eventueel de code (denk goed na over de class structure).
	- Probeer er voor de zorgen dat je bijvoorbeeld geen EatMeat methode kan aanroepen op een Zebra object.
- Voeg 2 nieuwe dieren toe.
---
## Eisen

Bij elke command laat je het resultaat in de console  zien.

- Als je de [hello] command uitvoert zonder dat er een naam is ingevuld zeggen alle dieren hallo.
	- Als er wel een naam is ingevuld [hello henk] zegt alleen dat dier hallo 
- Als je de [give leaves] command uitvoert krijgen alle herbivores leaves.
- Als je de [give meat] command uitvoert krijgen alle carnivores meat.
- Als je de [perform trick] command uitvoert doen alle dieren die dat kunnen hun trucje.



## Uitwerking

### Projectstructuur
    De code is opgesplitst in overzichtelijke packages:
    - `com.ing.zoo` – `Zoo.java` (startpunt van de applicatie en verwerking van console-commando's)
    - `com.ing.zoo.animals` – abstracte basisklasse `Animal` en alle dierklassen
    - `com.ing.zoo.interfaces` – interfaces voor diergedrag (`Herbivore`, `Carnivore`, `TrickPerformer`)

    ### Class structure & gemaakte keuzes
    - **`Animal` (abstracte klasse):** Alle dieren delen een `name` (via de constructor) en de methode `sayHello()`. Velden zijn `private` gemaakt voor betere encapsulatie.
    - **Interfaces voor gedrag:** Omdat een dier meerdere eigenschappen kan hebben (zoals `Pig`, die zowel vlees als bladeren eet én trucjes kan), is gekozen voor aparte interfaces: `Herbivore`, `Carnivore` en `TrickPerformer`. Hierdoor kan een       
    `Zebra` bijvoorbeeld alleen `eatLeaves()` uitvoeren en is `eatMeat()` niet aanroepbaar op een `Zebra`.
    - **Collectie:** Alle dieren staan in één `List<Animal>`, waardoor commando's eenvoudig over alle dieren heen kunnen loopen.

    ### Toegevoegde dieren
    - **`Elephant` (dumbo):** `Herbivore` en `TrickPerformer`
    - **`Seal` (sammy):** `Carnivore` en `TrickPerformer`

    ### Beschikbare commando's
    | Commando | Beschrijving |
    |---|---|
    | `hello` | Alle dieren zeggen hallo |
    | `hello <naam>` | Alleen het gekozen dier zegt hallo (bijv. `hello henk`) |
    | `give leaves` | Alle herbivores eten bladeren |
    | `give meat` | Alle carnivores eten vlees |
    | `perform trick` | Alle dieren die trucjes kunnen voeren er één uit |
    | `exit` | Sluit de applicatie af |
