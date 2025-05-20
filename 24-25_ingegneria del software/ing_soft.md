# Elementi di ingegneria del software
## Capitolo 1 - introduzione (scritta da Alessio)
I costi del software sono la parte dominante di un sistema informatico.
il software è scritto per essere in evoluzione.
Se non dovesse evolvere e dovrà fare solo quello, lo faccio in HW non SW; ma quasi sempre non so se dovrò inserire ulteriori funzioni o sapere la scala di produzione.

Ingegneria del software si preoccupa che sia Cost Effective.
Qual'è il principio fondamentare di tutta l'ingegneria? (divide and conquer)
se spezzo il problema in sottoproblemi allora è gestibile.
La complessita si affronta spezzando tutto il problemi più piccoli.

Se non si usano dei metodi di ingegneria del software verrà fuori un programma non ottimale.


--------
$DOMANDE:$

Cosa è un software?
Un programma con la sua documentazione associata

Quali sono gli attributi di un buon software?
- deve fare quello che è richiesto che faccia
- avere delle prestazioni
- deve essere manutenibile(possibilità di update)
- fa più cose di quelle richieste

Cos'è l'ingegneria del software?
disciplina che è concentrata nella produzione del software

Quali sono le attività fondamentali dell'Ingegneria del software?
- Specializzazione SW
- Developing SW
- Validazione SW
- Evoluzione SW

Differenza tra CS e SE:
- Computer Science: tutto sui computer
- Software Engineering: teorie, tecniche per creare SW

Ridurre il tempo di produzione?
Esporre una versione BETA

Quali sono i costi?
60% Costi di Developing
40% Costi di Testing
Per gli update di solito si superano i costi di developing.

Quali sono i metodi e le tecniche del software engineering?
Software Engineering significa ampliare la strumentazione per domare le complessità.
Non c'è un metodo universale per risolvere tutti i problemi.

---

Prodotto Generico:
commercializzato e venduto a chiunque.
non c'è un committente
es: Windows

Prodotto Custom:
c'è un committente, i requisiti te li da lui.
99% delle volte il committente non sa quello che vuole.
Il Software engineer deve andare a elicitare i requisiti dal committente per capire che vuole.

---

code obfuscation: per nascondere codice quando vendi un SW (evita la decompilazione del prodotto)

Attributi essenziali di un buon SW:
- Maintainability: codice che si capisca cosa fa e che sia commentato (spiega tutto)
- Dependability and security: la maggior parte dei dispositivi hanno del software, il SW deve essere dependable. se riutilizzi il SW la prob. che tu sappia tutto quello che fa è pari a 0, ergo, puoi avere molte vulnerabilità sconosciute.
- Efficiency: il programma deve fare quello che deve fare nulla di più nulla di meno e deve essere performante.
- Acceptability: 99/100 chi richiede il SW non lo usa, se non è accettabile dall'utente finale non verrà accettata.

Ciclo di vita di un SW:
l'Ing. del SW inizia da elicitazione, raffinamento e richiesta requisiti.
I compomenti SW devono essere documentati.
Devi raggiungere un risultato con un determinato budget
fa parte anche la progettazione del progetto.
Non puoi sviluppare un SW e pensare che giri ovunque, come minimo bisogna documentare tutti gli aspetti dove noi abbiamo sviluppato (versioni ecc).

Creare un SW velocemente ed economicamente -> difficile da ottenere insieme
ottenere un equilibrio tra queste spinte divergente.
quickly ed economic vanno a braccetto a volte se la qualità è inferiore cioè per un mockup che deve essere fast.


---


Software Engineer definiscono che andiamo a fare, i vincoli, ecc

Ingegneria dei Requisiti:
Serve per lo sviluppo di qualsiasi sistema(anche per architettura)
Se sbagli le fondamenta, sbagli tutto.
Dobbiamo adattarci alle esigenze dei clienti e imparare il loro linguaggio perché son loro che cacciano la grana.
Essere empatico con il cliente.

Quando ti parla dei requisiti, devi raffinarli e parlare col cliente, scriverli, e poi pensi alle possibile architetture.
Non devi farti sopraffare dalle prime idee che capitano perché altrimenti non segui quello che veramente bisogna fare.

Software Validation:
controllare che non solo faccia qurllo che ti aspetti che faccia ma che lo faccia anche nel modo che vuole il committente e con i vari vincoli che vuole e che ti ha commissionato.

Software Evolution:
Quando uno produce un sistema poi se va bene e il sistema è funzionale, va sul campo, e sul campo comincia ad entrare alle pressioni del campo e quindi ad essere evoluto.
Market Requirements, ecc...
Il software deve essere manutenibile quando è già sul campo.

Safety: protezione dagli incidenti
Security: protezione dai malintenzionati

Security and Trust:
idea: voglio avere un sistema automatico per fare una serie di controlli che portato ad azioni.
I rallentamenti della burocrazia devono essere sostituiti da N stadi di controllo(se automatizzati)

---

prima di fare progettazione devi avere chiari i requisiti
necessari skillset e toolset per ogni progettazione

se hai competenze non adatte al 100% provi ad adattarti e a dare la soluzione più vicina a quello che sai fare

tipi di applicazioni:
- stand alone application: sempre meno disponibili(pure la lavatrice si vuole connettere al wi-fi)
- applicazioni transazionali: basate su DB o blockchain
- applicazioni con parte Client remota e parte Server(client-server)
- embedded control system: lavatrice
- SW control systems that control and manage HW devices
- batch processing systems
- sistemi per uso personale(intrattenimento,ecc)
- sistemi di modellazione/simulazione
- Data collection

Security by Design: usi un modulo che fa quello che ti serve, ma non solo quello, quindi all'interno del tuo sistema ci siano altre possibilità di input, ci sarà qualcuno che riuscirà ad entrarci in modo malevolo.

Internet Software Engineering: se ho un sistema isolato, ho meccanismi per pararmi dalle injection, se è su internet bisogna stare il doppio attenti.

Lambda expression: funzione che non ha uno stato, se la devo eseguire due volte è irrilevante dove venga eseguita, non si porta dietro nulla. Se massimizziamo questo, quasiasi funzione può diventare lambda expression, solo che può accumularsi peso e sparare un GB di roba se il code è fatto male(lambda accumuator, un counter che invece di fare count++, passa come argomento lo stato precedente dell'accumulator).

Bisogna essere coscienti che: (esempio con le lambda)
- non è l'architettura che funziona bene sempre
- funziona bene solo in certe condizioni
- non è che se un architettura va di moda allora devo usare solo quella
$\rightarrow$ studiarsi tutte le nuove metodologie e farsi lo schema su come funzionino in modo efficace


web software engineering: 
- Software reuse
- parliamo di un modello di business, servizio tramite web, io parto col minimo indispensabile per prendere la fetta di mercato e piano piano aggiungo funzionalità

---

Etica (robot di Asimov)
- non fare direttamente del male
- non permettere che la tua inazione provochi danno ad altri
- in assenza di queste due azioni abbi cura di te stesso

Case Studies:
tipologie diverse di app che poi useremo come nelle fasi di sviluppo SW le metodologie di sviluppo cambiano in base all'app:
- Personal insulin pump
- Mental care
- Wilderness weather station
- iLearn

$Personal\; insulin\; pump:$
Safety critical, si muore se non lo gestisci

requisiti ad alto livello necessari:
- availability del servizio (altrimenti il paziente muore)
- reliable and correct (deve avere la caratteristica di eseguire delle analisi e calcoli in modo accurato e funzionare sempre)

$Mental\; care:$
- patient information system
- non c'è un trattamento dedicato in ospedale(di pastiglie), solo supporto psicologico che deve essere garantito
- medicina territoriale e non in ospedale

----- 10/03/2025 ------

$Wilderness \; weather \; station:$ \
Acquisisce e salva dati meteorologici della natura selvaggia

1. sistema di gestione della stazione:
   - interfaccia sensori e hardware
   - lettura, primo controllo e passaggio dei dati al sistema di managment e archiviazione
2. sistema di data managment e archiviazione
   - processa i dati e li archivia
3. sistema di manutenzione:
   - comunicazione satellitare
   - configurazione del sistema da remoto
   - controllo dello stato del sistema
- altre funzionalità che è necessario implementare:
  1. controllo strumentazione, sistema di comunicazione, energia consumata
  2. possibilità di aggiornamento software da remoto

$iLearn \; services$: \
piattaforma per l'apprendimento

- non è importante la funzionalità 24/24, ma ci sono problemi di data privacy
- service-oriented system: servizio da inserire in un altro sistema più ampio (es. browser-based user interface)
- servono tante parti indipendenti (**loosely coupled**) per le varie funzionalità (es. quiz, forum, valutazioni) che comunicano con una parte comune (**strongly couple**)
  - utility services:
    - parte comune che non viene modificata nel tempo, indipendente dalle applicazioni
    - es. autenticazione, user storage, application storage, interfaccia, ricerca
  - application services:
    - implementano le varie funzionalità richieste, dipende dalle utility
    - email, messagging, spreadsheet, presentations, ...
  - configuration services:
    - configurare ambiente e servizi, dipende dalle applicazioni
    - gestione gruppi, applicazioni e utenti
- ci sono due tipi di servizi:
  - integrated services: componenti 
  - independent services: non avviene data sharing tra i servizi (es. mail e presentazioni)

### Riassunto cap 1
- il software è l'ingegneria meno standardizzata in assoluto
- caratteristiche: mantenibilità, dipendenza, sicurezza, efficienza, acettabilità (correttezza)
- fasi di scrittura software: specifica, sviluppo, validazione, evoluzione
- rispettare i requisiti
- lo sviluppatore ha responsabilità sullo sviluppo e ideazione, oltre che eventuali conseguenze sociali e legali

---

## Capitolo 2 - Software Process
### Cos'è un software process
insieme di attività richieste per sviluppare un software, composto da:
- specifiche: cosa deve fare il software
- progettazione e implementatione: organizzazione del sistema e implementazione
- validazione: controllo funzionalità e correttezza
- evoluzione: mantenimento del software

richiede di definire
- prodotti
- ruoli e responsabilità di ognuno
- precondizioni: condizioni da verificare all'inizio dello sviluppo
- postcondizioni: condizioni da verificare alla fine dello sviluppo

Tipi di software process:
- *Plan driven:* tutti i processi e le attività di sviluppo sono pianificate a priori
- *Agile processes:* la pianificazione viene fatta un po' alla volta

### Software process models
#### Waterfall model
plan driven model che separa temporalmente le fasi di specifica, sviluppo, ... che vengono eseguite a cascata
1. *Requirements definition:* si definiscono i requisiti e le specifiche
2. *System and software design:* si esegue il design delle varie parti del software
3. *Implementation and unit testing:* si implementa il software e si testano singolarmente le componenti
4. *Integration and system testing:* si integrano le varie parti e si testa il software
5. *Operation and mantainance:* si distribuisce il software, si osservano eventuali problemi e per correggerli si ritorna alla fase opportuna e si ripetono tutte le altre fasi in cascata

È vantaggioso se tutti i requisiti rimangono costanti per tutto lo sviluppo del programma.
È usato in:
- progetti mission-critical: applicazioni militari in cui non si deve sbagliare assolutamente
- progettio molto standardizzati: controllo traffico aereo, ferroviario
- progetti in cui lavorano molte persone (difficile controllarne il lavoro)

Il problema del Waterfall model è la difficoltà di modificare la pianificazione (requisiti, specifiche) in corso d'opera.

#### Incremental development
si procede in parallelo con specifiche, sviluppo e testing (plan-driven o agile)

1. Prima descrizione generale del progetto
2. Specifiche, sviluppo e testing in parallelo (una specie di mini-waterfall più flessibile)
3. si ottiene una versione iniziale, tante versioni intermedie e una versione finale

Il vantaggio di produrre versioni intermedie, permette al committente di capire la strada intrappresa nello sviluppo e in caso è possibile correggere il progetto in corso d'opera in base alle richieste o modifiche del committente.

Lo svantaggio è che non si ha una visione completa del progetto e non si sa a che punto dello sviluppo ci si trova. Inoltre non si ha una visione immediata e completa del progeto finale e risulterà difficile inserirla in un contratto. Inoltre se la struttura base si porta avanti per molto tempo, si potrebbe arrivare ad un punto in cui si procede solo di patch appensantendo il programma e non avendo più una conoscenza completa del sistema (tante patch che funzionano per miracolo perché ce ne sono troppe).

#### Integration and configuration
si riciclano componenti già disponibili (plan-driven o agile)

1. specifica dei requisiti
2. software discovery and evaluation: cerco software che ha già implementato le funzionalità cercate
3. eventuale correzione di requisiti, man mano che la ricerca di software riutilizzabile procede
4. sviluppo dei componenti necessari e inserimento dei nuovi componenti sul sistema

Esempi di software riutilizzabili:
- standalone application systems (COTS), es. Windows
- Frameworks come .NET o J2EE
- Web services, sfruttano il protoccolo web per trasmettere informazioni

Vantaggi:
- generalmente minor costo e rischi per la riduzione di software completamente nuovo, anche se di solito l'inserimento delle nuove funzionalità potrebbe costare parecchio
- maggior velocità di sviluppo e test, anche se non si esclude la necessità di dover scrivere codice ex-novo
- si va incontro a modifica dei requisiti per cui il risultato finale potrebbe non combaciare con le reali richieste e potrebbero esserci funzionalità non implementate
- perdita di controllo sull'evoluzione di componenti riutilizzati (i componenti sono proprietari e gestiti da qualcun altro)

### Attività dei processi
4 attività base, organizzate in maniera diversa in base ai modelli utilizzati
1. specifica
2. sviluppo
3. validazione
4. mantenimento

#### Requirments - Software specification 
1. Requirements elicitation and analysis -> si chiede al committente cosa vuole, quale è la sua idea e quale è la sua necessità (più importante quello che gli serve che quello che vuole perché potrebbe non avere ben chiaro cosa vuole, ma ha una necessità da risolvere)
2. Requirements specification -> descrizione univoca, completa e non ambigua di quello che il programmatore ha capito
3. Requirements validation -> confronto con il committente per capire se i requisiti stilati non contengono errori ed è ciò che il committente ha bisogno

In parallelo alle attività sopra
1. descrizione generica del sistema
2. descrizione dei requisiti dell'utente e del sistema
3. descrizione completa dei requisiti

#### Software design and implementation
Conversione delle specifiche in un programma eseguibile
- Software design -> ideazione di un sistema che rispetta i requisiti
- Implementazione -> tradurre la struttura del sistema in programma eseguibile

#### Software design process
1. Design inputs
   - platform information: tipo di architettura
   - requirements specification: specifica dei reqo
   - data description ()
2. Design activities
   - architectural design: struttura principale del sistema
   - interface design: 
   - component design: tipi di componenti con cui interagire
   - database design: struttura del database
3. Design outputs
   - system architecture
   - database specification
   - interface specification
   - component specification

#### System implementation
Comprende lo sviluppo di un programma o la configurazione di un application system.
- Vengono eseguite in parallelo l'implementazione e la scritutta della documentazione
- Spesso ci sono degli standard di programmazione (direttive su come scrivere codice elegantemente).
- Alla fine c'è il debugging dove si individuano e correggono eventuali errori 

#### Software validation
Verifica che il software rispetti i requisiti iniziali

1. component testing: test di oggetti, funzioni, sottoprogrammi
2. system testing: test del sistema e 
3. acceptance testing: test del rispeto dei requisiti con 

#### V-Model
Ad ogni fase di specifica si produce un piano di test di accettazione:
1. requirements specification -> acceptance test
2. system specification -> system integration and acceptance test
3. system design -> sub-system integration test
4. detailed design -> module and unit code test

#### Software evolution - coping with change
Il software è intrinsecamente flessibile e variabile. Deve poter essere aggiornato per mantenersi al passo con le richieste.

1. define system requirements: definizione dei requisiti del sistema
2. assess existing systems: valutazione sistemi esistenti
3. propose system changes: proposte di modifica/evoluzione dei sistemi esistenti
4. modify systems: esecuzione delle modifiche

Coping with change: oggi il codice è molto riutilizzato e deve poter evolversi con il tempo, serve far fronte (to cope) al cambiamento.

Per ridurre i costi di aggiornamenti:
- change anticipation: prevedere dove saranno necessari cambiamenti
- change tolerance: progettare il software per ridurre i costi di mantenimento

Per affrontare il cambiamento dei requisiti
- system prototyping: sviluppare una parte del progetto velocemente (prototipo) per capire se il committente è sempre delle stesse idee o se ci sono ulteriori scelte di design da fare
- incremental delivery: mostrare all'utente versioni intermedie per far capire all'utente le direzioni da prendere e ricevere eventuali feedback

#### Software prototyping
- versione iniziale del sistema usata per dimostrare concetti o testare nuove scelte di design
- utilizzato per
  - stabilire i requisiti
  - provare interfacce GUI nel processo di design
  - per eseguire test ed eventualmente utilizzarlo come backup

1. stabilire obiettivi prototipo
2. definire funzionalità
3. sviluppo del prototipo
4. valutazione del prototipo

- si potrebbero utilizzare linguaggi o strumenti per migliorare la velocità di sviluppo, rispetto all'affidabilità o efficienza
- si potrebbe dover tagliare funzionalità, comunque marginali
- non vengono utilizzati per lo sviluppo in quanto non sono buone basi di sviluppo
- di solito non possiedono la documentazione finale per l'utente, ma devono sempre avere documentazione per gli sviluppatori
- non deve rispettare gli standard di qualità dell'azienda

#### Incremental delivery
Al posto di eseguire un'unica consegna alla fine dello sviluppo, si creano tante piccole consegne in cui vengono aggiunte sempre di più nuove funzionalità.
- durante lo sviluppo tra una delivery e un'altra, i requisisti non vengono memorizzati, ma eventuali modifiche verranno gestite sulla successiva delivery
- incremental delivery è legata all'incremental development

1. define outline requirements
2. assigne requirements to increments
3. design system architecture

4. develop system increment
5. validate increment
6. integrate increment
7. validate system
8. deploy increment
9. if the system is incompleted -> back to 4, else -> final system

Vantaggi:
- nuove funzionalità sono disponibli prima e testate più a fondo
- permettono di esegire controllo sui requisiti
- minor rischio di fallimento
Svantaggi:
- la prima delivery dovrà comunque essere abbastanza completa da includere tutte le funzionalità di base
- potrebbe essere difficile individuare le funzionalità di base
- le delivery potrebbero non essere incluse nel contratto

--- 
## Capitolo 3: Java e Reflection API
### Generics in Java
``CodaObject.java``:
- memorizzo i dati nella coda attraverso oggetti generali object, per cui non c'è nessun controllo su che tipo di dati inserisco
- se la uso per memorizzare (ad esempio) interi, eseguo il cast al momento dell'estrazione; in questo modo non c'è nessun controllo nell'inserimento e si potrebbe incorrere in errori in runtime (fastidiosi da trovare) se vengono inseriti dati non interi che verranno tentati di convertire in interi al momento dell'estrazione

``CodaGen.java``:
- memorizzo i dati nella coda attraverso i Generics, per cui nella coda potrò inserire solo oggetti di tipo specificato al momento dell'istanziamento della coda
- in questo modo se creo una coda per salvare interi e provo ad inserire una stringa, avrò un errore in compile-time (più palese e chiaro di uno in runtime) e non ho problemi di cast in fase di estrazione ed errori inattesi in runtime

### Lazy binding
In fase di runtime, vengono caricati solo i moduli che vengono utilizzati, esempio:
- programma ``class A`` che richiede ``class B`` solo in una determinata condizione
- se serve ``class B`` e non c'è il file precompilato ``B.class``, ``class A`` non si esegue perché manca il codice precompilato
- se non serve ``class B`` e non c'è il file precompilato ``B.class``, ``class A`` si esegue lo stesso senza problemi perché siccome non serve ``class B``, non ne va nemmeno in cerca

NB: in fase di compilazione di ``class A``, verranno comunque compilate tutte le dipendenze necessarie.

Siccome i vari programmi vengono collegati solo in fase di runtime quando strettamente necessario, è possibile che delle dipendenze vengono modificate e ricompilate con errori di codice, e questi errori possono riimanere silenti per molto tempo finché il programma esegue un determinato ramo che le richiede.

È possibile anche aggiungere elementi/classi ad un programma che è già in esecuzione, aggiungendo i file precompilati bytecode nella stessa cartella del programma in esecuzione. Questa cosa è utile per aggiungere strumenti per elaborare determinati formati di dati che vengono richiesti in runtime (es. aggiungere un nuovo strumento per elaborare immagini in un determinato formato).

### Class loader in runtime
Una volta che una classe viene caricata nella JVM, le modifiche che avvengono a tale classe dopo il suo caricamento non vengono considerati. La JVM carica una determinata classe solo 1 volta e, una volta caricata non può essere sostituita. Il motivo del mancato aggiornamento è che si potrebbero avere problemi se si carica una classe, si istanziano oggetti e poi si cambia la classe.

Il caricamento delle classi avviene attraverso un oggetto chiamato ``Class Loader``. Per ricaricare una classe durante un programma bisogna cambiare class loader, ma questo provoca la "formattazione" di tutto il contenuto della JVM ed equivale a riavviarla (terminare programma e farlo ripartire).

### Gestione classi
``static Class<?> forName(String name)`` -> restituisce un oggetto istanziato della classe specificata come parametro
```java
// istanzia una classe del tipo specificato da riga di comando
public static void main(String[] args) throws ... {
	Class clazz = Class.forName(args[1]);
}
```

``Class<?> newIstance()`` -> restituisce una nuova istanza di una classe, usa il costruttore di default senza parametri
```java
// crea una nuova istanza dello stesso tipo di clazz
public static void main(String[] args) throws ... {
	Class clazz = Class.forName(args[1]);
	Class clazz2 = clazz.newIstance();
}
```

``public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)`` -> restituisce un oggetto di tipo costruttore che rappresenta il costruttore di una determinata classe e che accetta tutti i parametri indicati tra le tonde al posto di ``Class<?>... parameterTypes``

``public Constructor<T>[] getDeclaredConstructors()`` -> restituisce un array di oggetti di tipo costruttore che rappresentano tutti i costruttore di una determinata classe

``public T newInstance(Object... initargs)`` -> metodo per creare una nuova istanza di una classe utilizzando i parametri specificati tra le tonde, viene invocato su un oggetto di tipo Costruttore, siccome è un metodo con varargs può lanciare eccezioni se il numero di parametri non è corretto

```java
// crea una nuova istanza dello stesso tipo di clazz
public static void main(String[] args) throws ... {
	Class clazz = Class.forName(args[1]);
	Class clazz2 = clazz.getDeclaredConstructor().newIstance(/*ctors parameters*/);
}
```

Esistono metodi per ottenere le interfacce che una determinata classe implementa e i campi che possiede una determinata classe. È possibile agire sui campi di una determinata classe attraverso opportuni metodi della classe ``Field``

``public Field getDeclaredField(String fieldname)`` -> restituisce un oggetto di tipo ``fiedl`` che rappresenta il campo di una determinata classe con il nome specificato come parametro

``public Field[] getDeclaredFields()`` -> restituisce un array di oggetti di tipo ``field`` che rappresentano tutti i campi di una determinata classe

``void set(Object, Object)`` -> metodo per creare una nuova istanza di una classe utilizzando i parametri specificati tra le tonde, viene invocato su un oggetto di tipo Costruttore, siccome è un metodo con varargs può lanciare eccezioni se il numero di parametri non è corretto

```java
// manipola i campi di una classe
public static void main(String[] args) throws ... {
	Class clazz = Class.forName(args[1]);
	Filed f1 = clazz.getDeclaredField("fiedlName");
	f1.set(clazz, newvalue);
```

``public Method getDeclaredMethod(String name, Class<?>... parameterTypes)`` -> restituisce un oggetto di tipo ``method`` che rappresenta un metodo di una determinata classe con il nome e i parametri indicati tra le tonde.

``public Methods[] getDeclaredMethods()`` -> restituisce un array di oggetti di tipo ``method`` che rappresentano tutti i metodi di una determinata classe

``public Object invoke(Object obj, Object... args)`` -> metodo per invocare un metodo di una classe indicando nome del metodo e parametri da utilizzare, siccome è un metodo con varargs può lanciare eccezioni se il numero di parametri non è corretto

```java
// invoca il metodo di una classe
public static void main(String[] args) throws ... {
	Class clazz = Class.forName(args[1]);
	Filed f1 = clazz.getDeclaredMethod("toString");
	f1.invoke(clazz, parameters);
```

### Boxing and Autoboxing
...

### Varagrs
Strumento per dichiarare un metodo in grado di ricevere un numero indefinito di parametri. I varargs vengono indicati con ``...`` come tipo dei parametri: ``(Class<?>... parameters)``

### Consigli di buona programmazione
- preferire errori del compilatore (vengono fuori subito e sicuramente, con spiegazione allegata), rispetto a errori in runtime (non è detto che si verifichino, non hanno spiegazione)
- evitare di creare un numero sproporzionato di classi, siccome si potrà andare in contro a problemi di incompatibilità che vengono fuori solo in runtime in determinati contesti
- le modifiche alle classi in fase di runtime non sono permesse (non influenzano)
- scrivere poco codice e provare a compilare spesso

---

## Capitolo 4 - Requirements engineering
### Introduzione
- **requirements engineering:** processo che descrive lo stabilire dei requisiti richiesti dall'utente per un certo sistema e per l'ambiente di esecuzione e applicazione del determinato sistema
- **system requiremets:** descrizione dei requisiti per un software contenuti nel documento dei requisiti e sviluppati durante il processo di requirement engineering

### Requirements
#### Definizione:
  - richiesta che il software deve soddisfare
  - può essere sia di alto livello, sia di basso livello (es. formula matematica)

#### Ambiguità
- deve essere abbastanza libero ad interpretazioni per lasciare spazio all'ingegnosità del programmatore
- deve essere abbastanza preciso per evitare interpretazioni ambigue e confuse quando è la base di un contratto

In genere si effettua una stesura di requisiti più permissivi per lasciare la possibilità a diverse aziende di offrire preventivi diversi in base alle soluzioni trovate al problema. Poi l'azienda effettua una stesura 

#### User requirements
Requisiti espressi in linguaggio naturale (con l'aggiunta di eventuali grafici), scritti dal committente. Indicano le funzionalità richieste dal sistema ed eventuali relazioni/dipendenze tra i diversi componenti.

#### System requirements
Descrivono in maniera estremamente dettagliata le richieste che il sistema e i suoi componenti devono soddisfare in maniera non ambigua. Sono contenute in un documento redatto dall'azienda sviluppatrice e spesso è la base del contratto tra committente e sviluppatore.

### System Stakeholders
Indicano tutte le persone e le organizzazioni che sono interessate e influenzate in qualche modo dal sistema in via di sviluppo. Esempi di stakeholders sono:
- utenti finali
- manager del sistema
- proprietari del sistema
- stakleholder esterni che interagiscono col sistema

### Requirements e metodi agile
Per i metodi agile non ha senso scrivere in maniera dettagliata tutti i requisiti di un sistema in quanto cambiano in continuazione. Alla fine dello sviluppo alcuni requisiti possono essre cambiati o non essre più validi. Di solito i metodi agile utilizzano una incremental requirements engineering.

Il metodo agile con la incremental requirements engineering funziona bene per sistemi business, ma diventa problematico in sistemi critici che richiedono test continui durante lo sviluppo.

### Functional requirements
Insieme dei requisiti che descrivono le funzionalità che un sistema deve avere e cosa deve fare o non fare di fronte a determinate situazioni.
- dipende dal tipo di software, dal luogo di applicazione finale e da chi lo utilizzerà
- descritti da un punto di vista ad alto livello di cosa il sistema deve fare
- devono specificare i servizi che il sistema deve avere

Imprecisioni nei functional requirements danno origine a problemi (es. interpretazioni diverse tra utente e sviluppatore). I functional requirements devono essere:
- completi: devono descrivere tutte le funzionalità richieste
- consistenti: non devono avere contraddizioni o conflitti

### Non functional requirements
Insieme dei requisiti e restrizioni che il sistema deve soddisfare a prescindere dalle funzionalità.
- sono più critici in quanto se non soddisfatti il sistema potrebbe non essere funzionale
- in genere sono applicati all'intero sistema e non alle singole funzionalità
- sono più complessi da definire e sono più difficili da verificare alla fine dello sviluppo

#### Suddivisione di non functional requirements
- **Product requirements** (come il sistema dovrà comportarsi)
  - usability requirements (usabilità del sistema, ore di formazione, ...)
  - efficiency requirements (performance in tempo di esecuzione e spazio richiesto)
  - dependability requirements
  - security requirements
- **Organisational requirements** (come il sistema è organizzato internamente)
  - environmental requirements (energia, dissipazione, ...)
  - operational requirements
  - development requirements (standards, ISO, ...)
- **External requirements** (richieste esterne per interoperabilità, leggi, norme, ...)
  - regulatory requirements (regolamenti dell'azienda, tra cliente e azienda)
  - ethical requirements
  - legislative requirements (leggi)

#### Esepmi di metriche per specificare i non functional requirements
Speed: Processed transactions/second, User/event response time, Screen refresh time

|  proprietà  |  grandezza |
| ----------- | ---------- |
| Speed       | Processed transactions/second <br> User/event response time <br> Screen refresh time |
| Size        | Mbytes <br> Number of ROM chips |
| Ease of use | Training time <br> Number of help frames |
| Reliability | Mean time to failure <br> Probability of unavailability <br> Rate of failure occurrence <br> Availability |
| Robustness  | Time to restart after failure <br> Percentage of events causing failure <br> Probability of data corruption on failure <br> Portability Percentage of target dependent statements <br> Number of target systems |

### Fasi della Requirements engineering
#### 1. Requirements elicitation and analysis:
Consiste nel capire le richieste del committente, le richieste degli utilizzatori finali, l'ambiente di destinazione.
- Requirements discovery: ricerca dei requisiti, interviste
- Requirements classification and organization: definire ordine e classificazione nei requisiti
- Requirements prioritization and negotiation: definire priorità e negoziare requisiti
- Requirements specification: prima stesura del documento dei requisiti

Le **interviste** sono usate per la requirements discovery:
- closed interviews: basate su domande prefissate
- open interviews: dove l'analisi viene fatta in tempo reale tra committente e sviluppatore
- be open minded: non partire da preconcetti
- si possono usare domande trampolino, proposte di requisiti o prototipo sviluppato assieme

L'**etnografia** applicata alla requirements enegineering analizza come le persone organizzano il lavoro in base a fattori etnici e sociali. In questo modo non serve che le persone spieghino come lavorano perché ci sono studiosi che lo fanno al posto loro. Questo torna utile perché i requisiti saranno basati sull'effettivo modo con cui le persone lavorano e non come "ritengono" di lavorare.

Le **storie** e gli **scenari** sono esperienze della vita reale usati come strumenti per affrontare determinate situazioni riconducibili a tali esperienze. Devono includere:
- decrizione della situazione iniziale
- descrizione del normale corso degli eventi
- descrizione di cosa più andare storto
- descrizione di attività concorrenti
- descrizione dello stato finale
#### 2. Requirements secification: stesura dei requisiti
Processo che prevede la stesura in maniera ordinata, chiara e concisa dei requisiti. Si divide in:
- user requirements: comprensibili anche a chi non ha nessun background informatico
- system requirements: molto dettagliati e con termini e linguaggio tecnico specifico

Esempi di linguaggio:
- natual language: requisiti descritti in frasi numerate in lingua inglese, ogni frase contiene un requisito
- structured natural language: requisiti descritti sottoforma di form o template
- design description language: descrizione attraverso uno pseudocodice o linguaggio di programmazione ad alto livello (usato poco e soltato per le interfacce)
- graphical notations: requisiti espressi attraverso modelli grafici come UML
- mathematical specifications: requisiti espressi attraverso linguaggio matematico (comprensibile a pochi)

Requirements and design
- requirements: spiegano cosa deve fare il sistema
- design: spiega come deve fare ciò per cui è stato pensato

**Natual language**:
- universale e comprensibile a chiunque (sviluppatori e committente)
- Consigli:
  - scegliere un formato standard e uniforme per tutti i requisiti
  - usare linguaggi non ambigui e termini condivisi tra tutti gli addetti ai lavori
  - evidenziare parti più importanti
  - includere spiegazione del perché il requisito è stato inserito
- Problemi con linguaggio naturale
  - ambiguo e poco chiaro
  - per essere specifici si deve aumentare la complessità

**Structured speciications**
- i requisiti sono scritti in maniera rigida, strutturata e uniforme
- utili per embedded control system, ma a volte potrebbe sembrare troppo rigido
- esempio di struttura base (form):
  - descrione funzione ed entità
  - descrizione input
  - descrizione output
  - eventuali dipendenze
  - eventuali pre e postcondizioni (es. validità di input -> precondizione, dove viene salvato il risultato -> postcondizione)
  - eventuali side effects

**Tabular speciications**
- affiancano il linguaggio naturale per indicare un elenco di possibli azioni

**Use cases**
- descrivono gli scenari che si possono verificare con eventuali dipendenze, iterazioni tra i diversi componenti e accessibilità degli utilizzatori (azioni concesse e non concesse)

**Software requirements document**
- raccoglie tutti i requisiti (funzionali e non funzinonali), ma non comprendono il design del progetto
- può diventare parte del contratto
- ci sono più utenti diversi che lo leggono per azioni diverse:
  - system customers: controllano se il progetto soddisfa le richieste
  - managers: pianificano lo sviluppo e le risorse
  - system engineers: sviluppano in base ai requisiti
  - system test engineers: testano il sistema in base ai requisiti
  - system maintenance engineers: manutenzione e aggiornamento
- la dimensione del documento dipende dall'approccio usato (waterfall o incremental), dal numero di persone che ci lavorano e dalla dimensione del progetto
- struttura:
  - prefazione: destinatari del documento, numero della revisione e storia delle revisioni
  - introduzione: scopo del progetto, funzioni 
  - glossario: termini usati che potrebbero essere ambigui (es. acronimi)
  - user requirements definition: functional and non functional requirements, generalmente in linguaggio naturale con possibile aggiunta di grafici, tabelle e uml
  - system architecture: architettura e distribuzione delle funzionalità nei vari componenti del modello
  - system requirements specifications: functional and non functional system specifications, interfacce, relazioni con altri sistemi esterni
  - system models: modelli di sviluppo
  - system evolution: direzione verso cui si prevede di farlo evolvere
  - appendici: codice, dettagli secondari, ...
  - indice

#### 2. Requirements validation: validazione dei requisiti
Controllo che i requisiti soddisfano le richieste dell'utiente. Correggere i requisiti dopo la consegna del progetto costa 100 volte di più di un errore di implementazione.

**Controlli sui requisiti**:
- validità: soddisfa le richieste dell'utente
- consistenza: conflitti tra requisiti
- completezza: tutte le richieste dell'utente sono soddisfatte
- concretezza: implementabilità con budget dato e tecnologia a disposizione
- verificabilità: possibilità di verificare se i requisiti sono soddisfatti

**Tecniche di validazione**
- reviews dei requisiti: analisi manuale dei requisiti per i parametri sopra
- creazione di prototipi: verifico attraverso la costruzione di prototipi
- sviluppo tester per testare la verificabilità (testabilità) dei requisiti

**Requirements reviews**
- controllo regolare sui requisiti (es. problemi con fornitori), può essere formale o informale
- parametri da valutare:
  - verificabilità: si può effettivamente testare?
  - comprensibilità: è comprensibile a chi non fa parte del progetto?
  - tracciabilità: l'origine del requisiti è chiara?
  - adattabilità: quanto è flessibile al cambiamento?

#### 3. Requirements change and requirements management:
Hardware su cui viene installato il sistema, settore di applicazione e dipendenze del sistema cambiano con il tempo, serve mantenere il sistema aggiornato e aggiustare i requisiti.

Il Requirements management indica il processo di gestione dei cambiamenti dei requisiti durante il processo di requirements engineering e lo sviluppo del sistema.

La pianificazione del requirements management serve per stabilire il livello di dettaglio della gestione dei requisiti:
- identificazione dei requisiti: associare un codice univoco ad ogni requisito
- change managment process: processo di analisi sull'impatto dei requisiti
- politica di tracciabilità: correlazione tra i requisiti e il design del sistema
- strumenti di supporto: strumenti per semplificare il lavoro (spreadsheets,...)

Proceso di requirements change managment
- analisi del problema e cambiamento delle specifiche
- analisi dei cambiamenti e del costo
- implementazione dei cambiamenti

### Riassunto
- i **software requirements** definiscono cosa dovrebbe fare il sistema e impongono vincoli sul suo design o funzionamento
- i **functional requirements** descrivono i servizi che il sistema deve fornire o specifiche elaborazioni da eseguire
- i **non functional requirements** impongono vincoli al sistema o al processo di sviluppo e riguardano spesso le qualità complessive del sistema
- la **requirements engineering** è un processo iterativo che comprende l’elicitazione, la specifica e la validazione dei requisiti.
- la **requirements elicitation** include attività come scoperta, classificazione, negoziazione e documentazione, spesso realizzate attraverso tecniche come interviste e user story.
- la **requirements specification** consiste nel documentare formalmente tutti i requisiti in modo comprensibile sia per i clienti che per gli sviluppatori.
- la **requirements validation** verifica che i requisiti siano corretti, completi, realistici e verificabili.
- la **requirements management** si occupa dei cambiamenti dovuti all’evoluzione di fattori aziendali, organizzativi o tecnici.

## Capitolo 5 - Design Patterns
### Introduzione al design pattern
Un pattern è una descrizione di un problema standardizzato in un determinato contensto e della sua soluzione ricorrente, identificato con un nome omogeneo e univoco. Prevede il riuso dei principi di successo della soluzione ad un problema per velocizzare lo sviluppo.

### GRASP - General Responsibility Assignment Software Patterns
Si basa sull'identificazione delle responsabilità reciproche dei vari componenti del sistema.

#### Creator
- **Problema**: chi crea le istanze di A
- **Soluzione**: la responsabilità della creazione di A è assegnata a B se almento una delle seguenti confizione è verificata:
  - B contiene A
  - B tiene traccia di A
  - B usa intensamente e intimamente A
  - B ha i dati per inizializzare A
- **Vantaggi**: in ogni programma c'è sempre una responsabilità sulla creazione di oggetti (es. collezione di oggetti, registratore, ...)
- **Svantaggi**: la creazione di oggetti potrebbe essere più complessa
  - potrebbe essere utile riciclare le istanze per risparmiare risorse
  - il tipo dell'istanza potrebbe non essere unico, ma scelto all'interno di una famiglia di classi

#### Information Expert
- **Problema**: come assegnare le responsabilità tra i vari oggetti
- **Soluzione**: si assegnano le responsabilità dell'istanziamento alla classe che contiene le informazioni necessarie per istanziare l'oggetto
- **Vantaggi**: facilita l'incapsulamento e favorisce una coesiva e leggera definizione delle classi (le informazioni per istanziare le classi rimangono all'interno della classe delegata all'istanziamento e non vanno sparse per il sistema)
- **Svantaggi**: potrebbe contraddire il pattern di Low Coupling e High Cohesion, potrebbe indurre alla creazione di una classe megalitica responsabile di creare tutti gli oggetti che risulta complessa da gestire e modificare

#### Low Coupling
- **Problema**: come ridurre l'impatto di un cambiamento e facilitare il riuso
- **Soluzione**: assegnare responsabilità in modo da avere pochi collegamenti tra le classi
- **Vantaggi**: le classi "isolate" sono più facili da comprendere, mantenere e riutilizzare
- **Svantaggi**: non serve utilizzare low coupling nel caso di componenti stabili che non subiranno cambiamenti nel tempo

#### Controller
- **Problema**: chi deve essere responsabile della gestione dell'interfaccia utente
- **Soluzione**: facade pattern (l'utente agisce sul sistema attraverso una serie di funzioni che costituiscono la facciata) o controllore di sessione (l'utente interagisce attraverso scenari che evolgono nel tempo)

#### High Cohesion
- **Problema**: come creare classi focalizzate e gestibili
- **Soluzione**: assegnare responsabilità in modo da avere alta coesione tra le classi (delegare le azioni a più oggetti in modo da avere più oggetti gestibili e focalizzati)
- **Vantaggi**: facilita comprensione, mantenibilità del sistema, in parallelo a Low Coupling
- **Svantaggi**: delegare compiti su più classi consuma risorse e degrada le prestazioni, alcune volte conviene unire funzionalità "distanti logicamente" sotto un'unica classe se ciò migliora le prestazioni del sistema


### GoF - Gang of Four Design Patterns
Definiti nel libro *Desgin Patterns* e creati da Erich Gamma, Richard Helm Ralph Johnson e John Vlissides (gang of four). Si dividono in:
- **creational patterns** (5): creazione e inizializzazione di oggetti (come creare un oggetto e non come GRASP che definisce chi deve creare)
- **structural patterns** (7): disaccoppiare interfaccia e implementazione, composizione statica e dinamica di oggetti (incapsulamento o ereditarietà)
- **behavioral patterns** (11): definiscono come gli oggetti interagiscono e come distribuiscono le responsabiiltà

### Creational patterns
#### Abstact

#### Builder
- **Problema**:
- **Soluzione**:
- **Vantaggi**:
- **Svantaggi**:

#### Factory Method
- **Descrizione**: data una classe base e le sue classi derivate, la "factory" (classe delegata alla creazione di nuovi oggetti) sceglierà, in base ai parametri passati, quale classe derivata usare per implementare oggetti della classe base (es. quale implementazione usare per istanziare un'interfaccia).
- **Vantaggi**: il sistema si aspetta che l'oggetto rispetti una determinata interfaccia e delega alla factory la scelta di quale classe derivata utilizzare, in questo modo è possibile modificare le classi derivate e aggiornare solo la factory senza alterare il resto del sistema
- **Utilizzi**:
  - quando una classe non conosce a priori che tipi di oggetti creare (es. si lavora con una classe astratta o con un'interfaccia e si delega alla factory quale implementazione utilizzare)
  - quando una classe usa sottoclassi per svolgere diverse versioni della stessa funzione in base alla situazione
  - quando si vuole incapsulare la conoscenza del tipo della classe da creare

#### Prototype
- **Problema**:
- **Soluzione**:
- **Vantaggi**:
- **Svantaggi**:

#### Singleton
- **Problema**:
- **Soluzione**:
- **Vantaggi**:
- **Svantaggi**:

## Capitolo 8 - Software Testing
### Introduzione
La fase di test consiste nel verificare che il sistema soddisfi i requisiti e che non contenga errori o bug, prima che venga eseguita la consegna finale. Il test permette di mostrare eventuali errori, ma non garantisce l'assenza assoluta di errori, in quanto bisognerebbe eseguire il sistema con ogni possibile input.

#### Obiettivi
- **validation testing**: dimostrare che il sistema soddisfa i requisiti
- **defect testing**: individuare le situazioni in cui il sistema manifesta comportamenti inattesi (crash, errori di output, ...)

#### Suggerimenti
- effettuare almeno un test per requisito
- progettare test semplici in modo da facilitare eventuali debug

#### Veridica e validazione
- **verifica**: testare che il sistema soddisfa i requisiti e le specifiche
- **validazione**: testare che il sistema soddisfa le richieste dell'utente

### Software inspection
- consiste nell'esaminare staticamente il codice sorgente senza eseguirlo
- essendo un'esame statico, non c'è interazione tra errori, per cui è più facile individuari
- permette di effettuare una valutazione della qualità del codice (portabilità, leggibilità, completezza)
- non permette di testare usabilità e performance del sistema

### Software testing - Development testing
Il development testing si riferisce alle attività di test condotte dal team che sviluppa il sistema. Si divide in unit testing, component testing e system testing.

#### Unit testing
- consiste nel testare le singole unità di programma (metodi, classi), concentrandosi sulle loro funzionalità
- in genere gli unit test vengono automatizzati attraverso frameworks come JUnit, specificando 
- verifica che le unità funzionano se sono usate come previsto e quando sono poste in situazioni inattese
- 2 tipi di testing:
  - **partition testing**: suddividere l'input in gruppi che vengono processati allo stesso modo in modo da dover testare solo alcuni casi per ogni gruppo (es. identificare sequenze di numeri e valutare solo all'inizio, nel mezzo e alla fine di ogni sequenza)
  - **guideline-based testing**: testare le unità per rilevare errori comuni effettuati dal programmatore (es. overflow, underflow, invalid input, ...)

#### Component testing
- consiste nel testare i vari componenti del sistema, con un focus sulle interfacce dei componenti
- 4 tipi di interfacce:
  - parameter interfaces: per passare dati da un metodo ad un altro
  - shared memory interfaces: per memoria condivisa tra metodi
  - procedural interfaces: insieme di procedure chiamate da altri metodi
  - message passing interfaces: per richiedere servizi ad altri sottosistemi
- 3 tipi di errore:
  - interface misuse: errore nell'utilizzo di un componente
  - interface misunderstanding: assunzioni errate sul comportamento di determinati componenti
  - timing errors: errore nel parallelismo tra componenti
- suggerimenti:
  - testare i metodi con parametri limite (massimi e minimi rappresentabili, nullptr, ...)
  - testare i casi limite che possono provocare errori

#### System testing
- consiste nel testare il sistema e le interazioni tra i componenti
- richiede l'assemblaggio dei vari componenti per comporre il sistema, spesso richiede la partecipazione di altri team che non hanno partecipato allo sviluppo del sistema
- use-case testing: verifico che il sistema funzioni per i casi d'uso documentati
- test policies: siccome è impossibile testare totalmente un sistema, è bene definire delle priorità su che funzionalità vengono testate

#### Test-driven development - TDD
- approccio di sviluppo in cui la scrittura del codice e la fase di testing vengono fatte in parallelo, spesso usato in metodi incremental development
- la scrittura dei test viene fatta prima dello sviluppo della relativa parte del sistema e il superamento del test è elemento essenziale per proseguire lo sviluppo della parte succesiva
- benefici
  - code coverage: ogni parte di codice avrà almeno un test associato
  - regression testing: si verifica che le nuove modifiche non alterino le funzionalità già presenti
  - simplified debug: se c'è un problema, è facile capire dove si trova il problema
  - system documentation: i test possono essere visti come una documentazione che mostra come il sistema e i componenti vengono usati

### Software testing - Release testing
- consiste nel testare una particolare versione del sistema che si intende utilizzare al di fuori del team di sviluppo, lo scopo principale è convincere gli utilizzatori e il committente
- consiste in un black-box test effettuato da un altro team per
  - verificare che i requisiti siano soddisfatti
  - controllare il funzionamento del sistema nell' uso comune
  - a differenza del system testing, non è orientato a individuare bug

### Software testing - User testing
Il committente e gli utenti testano il sistema nella sua collocazione d'uso finale. Per effettuare lo user testing, è necessario completare tutti i passaggi precedenti (development e testing).

#### Tipi di testing:
- alpha testing: utenti collaborano con gli sviluppatori durante lo sviluppo
- beta testing: viene condivisa una release del sistema in modo che gli utenti possano testarla e riportare eventuali problemi
- acceptance testing: committenti finali verificano l'accettabilità del sistema in base alle loro aspettative nell'ambiente d'uso finale

#### Agile e accepatance testing
- il committente fa parte del team di testing ed è responsabile delle decisioni di accettabilità
- i test di accettabilità sono definiti dal committente (integrati con altri dei programmatori)

### Riassunto
- il testing può solo rilevare la presenza di errori in un programma, ma non può dimostrare che non ci siano difetti residui
- il development testing è responsabilità del team di sviluppo software, mentre il release testing è delegato ad un team separato
- il development testing include
  - lo unit testing, in cui si testano singoli oggetti e metodi
  - il component testing, in cui si testano gruppi correlati di oggetti
  - il system testing, in cui si testano sistemi parziali o completi
- è importante cercare di "rompere" il software scegliendo i casi particolari che spesso danno problemi
- quando possibile, è preferibile scrivere test automatizzati, in modo da integrarli in un programma che può essere eseguito ogni volta che viene effettuata una modifica al sistema
- il test driven development è un approccio in cui i test vengono scritti prima del codice da testare
- lo scenario testing consiste nell'inventare uno scenario di utilizzo tipico e utilizzarlo per derivare i casi di test
- l'acceptance test è un processo di testing in cui l'utente e altri programmatori decidono se il software è abbastanza buono da essere distribuito e utilizzato nell’ambiente operativo

## JUnit
### Introduzione
JUnit è un framework in Java che permette di automatizzare i test in un progetto in Java.
- test case: classi in java che contengono i metodi di test
- test method: metodo senza argomenti preceduto da ``@Test``
- fixture: stato iniziale di un test case
- assertions: controlli per verificare che i risultati ottenuti siano quelli attesi
- test suite: collezione di test cases

### Fixture
Metodi che permettono di impostare il sistema per eseguire i test successivi
- ``@Before public void setUp() { ... }`` metodo che inizializza la classe per i test
- ``@After public void tearDown() { ... }`` metodo per liberare le risorse utilizzate nel test

### Asserzioni
Le asserzioni sono controlli che, se risultano falsi, lanciano un'eccezione. JUnit sviluppa una classe di asserzioni ``org.junit.Assert`` con alcuni metodi tipo ``assertEquals()``, ``assertNull()``, ``assertSame()``, ``assertTrue()`` per controlli e un metodo ``fail()`` per bloccare l'eccezione ogni volta che viene raggiunta tale istruzione.

### Testing exceptions
Sfrutta un'annotazione per dichiarare che il codice dovrebbe lanciare una determinata eccezione. Il test fallisce se l'eccezione non viene lanciata.
```Java
@Test (expected=ArithmeticException.class)
	public void divideByZero() {
	int n = 2 / 0;
}
```

### Ignored tests
Si possono escludere determinati test aggiungendo ``@Ignore`` nello header del metodo:
```Java
@Ignore @Test public void myTest() { ... }
```

### Timed tests
È possibile impostare un timer che fa fallire il test se l'esecuzione supera il tempo specificato:
```Java
@Test(timeout=500)
public void retrieveAllElementsInDocument() {
	doc.query("//*");
}
```

### Test Suite
Insieme di Test Case
```Java
@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
	CalculatorIntegerTest.class,
	CalculatorFloatingPointTest.class,
	CalculatorLogarithmsTest.class })
public class CalculatorTestSuite {
	// Can leave empty
}
```

### Ordine dei test
L'ordine di esecuzione dei test di JUnit è indeterminato e non è prestabilito, per cui non è possibile progettare un test la cui condizione iniziale viene impostata in un altro test. È necessario che i test siano indipendenti tra di loro. Se si vuole specificare un ordine particolare di due test, è necessario usare ``@OrderWith()`` o ``@FixMethodOrder()``.

### Altri dettagli e documentazione: [wiki junit4 on github](https://github.com/junit-team/junit4/wiki)

## Agile development - Alberto Silitti
### Development process:
**Waterfall process**: suddivido il processo di svilupppo in fasi, per passare alla fase susccessiva devo aver prima terminato completamente la fase precedente che non può più essere ripresa in futuro
1. Requirements + defining acceptance testing
2. Analysis + defining ... testing
3. Design + defining ... testing
4. Coding + defining ... testing
5. Testing 

**Agile process**: suddivido il processo di sviluppo in funzionalità e per ogni funzionalità ciclo su tutte le fasi dello sviluppo:
1. requirements of the functionality
2. analysis of the functionality
3. design of the functionality
4. coding of the functionality
5. testing of the functionality
6. riparto dal punto 1 con la funzionalità successiva

**Verification and validation**: ...
**...**: ...
**Complexity**: ...

### Constant flow of values
Ogni funzionalità viene pesata in base a quanto è importante per il cliente, quanto sarà usata dal cliente e quanto costa svilupparla. Per assegnare la priorità delle funzionalità è necessario capire come l'utente utilizzerà tale funzionalità.

### Agile manifesto
1. Our highest priority is to satisfy the customer through early and continuous delivery of valuable software. --> focalizzarsi sulle funzionalità che l'utente ritiene più importanti e non su quelle complesse da sviluppare
2. Welcome changing requirements, even late in development. Agile processes harness change for the customer's competitive advantage. --> l'utente cambia spesso idea, per cui è necessario sempre predisporre il cambiamento dei requisiti, non prevedere le possibili nuove funzioalità siccome le previsioni saranno quasi sicuramente sbagliate
3. Deliver working software frequently, from a couple of weeks to a couple of months, with a preference to the shorter timescale. --> serve un costante feedback dal cliente per raccogliere il prima possibile eventuali richieste di modifica dei requisiti
4. Business people and developers must work together daily throughout the project. --> collaborare con il cliente è importante
5. Build projects around motivated individuals. Give them the environment and support they need, and trust them to get the job done. --> servono persone motivate per lo sviluppo agile e un ambiente stimolante
6. The most efficient and effective method of conveying information to and within a development team is face-to-face conversation. --> importanza nell'attenzione sui mezzi di comunicazione
7. Working software is the primary measure of progress. --> non servono progress reports, ... il progresso nello sviluppo si basa sul codice funzionante (sulla delivery)
8. Agile processes promote sustainable development. The sponsors, developers, and users should be able to maintain a constant pace indefinitely. --> serve un progresso a velocità costante sostenibile sia dal punto di vista dello sviluppatore, sia dal punto di vista dei feedback del consumatore
9. Continuous attention to technical excellence and good design enhances agility. --> qualità e attenzione ai  facilita una migliore 
10. Simplicity--the art of maximizing the amount of work not done--is essential. --> massimizzare il lavoro non fatto, sviluppando sempre tutte le funzionalità richieste
11. The best architectures, requirements, and designs emerge from self-organizing teams. --> lasciare che il team si organizzi autonomamente, senza avere un manager che assegna task
12. At regular intervals, the team reflects on how to become more effective, then tunes and adjusts its behavior accordingly. --> valorizzare eventuali confronti e verifica su come sta andando il processo e quali sono le eventuali migliorie

### Agile Method
- Extreme Programming - XP: ...
- DSDM: ...
- SCRUM: ...
- FDD: ...
- Crystal: ...
- Agile modeling: ...
- Lean Software Development: ...
- ...
Ad oggi si usa una fusione tra SCRUM e XP.

### Extreme programming
Extreme programming è un tipo di sviluppo agile che consiste nel buttasi subito a 
1. si definiscono 4 valori fondamentali:
   1. semplicità
   2. comunicazione
   3. feedback
   4. coraggio (fare cambiamenti senza aver paura di farli, avere una rete di salvataggio)
2. si sviluppano 3 drivers:
   1. focus on value (si basa su comunicazione, semplicità, coraggio)
   2. costant flow of activities (si basa su feedback e coraggio: non aver paura del feedback)
   3. no defect (consiste nel fare la delivery in ogni momento, si basa su tutti i 4 valori)
3. si definiscono delle pratiche
   1. planning game
   2. short releases
   3. metaphor
   4. simple design
   5. test-driven development
   6. refactoring
   7. pair programming
   8. collective code ownership
   9. cotinuous integration
   10. ...
   11. ...
   12. ...

#### User stories
Una  user story è una descrizione di un singolo esempio di iterazione dell'utente con il sistema, contenuto in un A5, composto da titolo, acceptance test, priority, story points (effort nello sviluppo) e descrizione della user story.

Il planning game consiste nell'assegnare lo story point di ogni user story da parte dell'intero team di sviluppo. Lo story point può essere definito in ore di lavoro o in t-shirt size (XS, S, M, L). Se gli story points sono troppo elevati, sarà necessario spezzare tale user story in altre sotto-user stories più piccole.

#### Struttura dello Extreme Programming
1. si definiscono le user story
2. si effettua un piano delle release (ogni quanto rilasciare le release) e vengono svolti eventuali spikes
3. si procede ogni iterazione per aggiungere le nuove funzionalità
4. si effettuano gli acceptance test definiti dagli user stories alla fine di ogni iterazione
5. ogni tot iterazioni viene fatta una small release per far testare il sistema all'utente (es. ogni 2 iterazioni di 2 settimane ciascuna)

Gli **spikes** sono attività che vengono svolte durante il planning per testare le architetture, strutture e sistemi nuovi che si prevede vengano utilizzati

#### Ruoli nello Extreme Programming
- **utente**: definisce le funzionalità, i requisiti, la priorità delle funzionalità, gli acceptance test (materiale per le user stories)
- **sviluppatori**: analisi, design, test, sviluppo e integrazione del sistema, definisce gli storypoints, lavoro in coppia con una tastiera, condividere il codice tra i vari sviluppatori
- **manager**: facilitatore che crea l'ambiente favorevole allo sviluppo extreme

#### Metafore
Per facilitare le collaborazioni e comprensioni tra sviluppatori e utenti, si utilizzano metafore, ovvero concetti paralleli più facili da comprendere per l'utente

#### Cowboy Coding vs Extreme prorgamming
| | cowboy coding | extreme programming |
| --- | --- | --- |
| definizione requisiti | nessuna | prevista con le user story |
| documentazione | assente | solo lo stretto necessario |
| proprietà del codice | del singolo,  | del team, tutti possono modificarlo purchè soddisfi gli acceptance test definiti |
| integrazione | molto difficile, fatta solo alla fine | più leggera, fatta giornalmente |
| contatti con il cliente | solo alla fine a progetto terminato | cliente partecipa allo sviluppo |
| refactoring | se funziona, non si tocca | refactoring costante, se si rompe qualcosa si vede subito dai test e il codice viene sempre migliorato |
| cambiamenti | si cercano di evitare cambiamenti | serve assecondare i cambiamenti |

#### Controllo nel processo (endogeno) e controllo del processo (esogeno)
Il controllo esogeno prevede di mettere delle regole di utilizzo del sistema, il controllo endogeno effettua la verifica all'interno del sistema. Si cerca di privilegiare il controllo endogeno, ovvero il controllo dello sviluppo processo viene fatto dall'interno attraverso misure (risultati di acceptance tests, feedback sull'evoluzione, copertura dei test, ...)

### SCRUM
#### Introduzione e ruoli
Basati su valori e fasi di sviluppo paralleli a XP. Ci sono tre figure:
- Scrum team: sviluppatori
- Scrum master: responsabile del progetto
- Product owner: cliente o intermediario con il cliente

#### Scrum vs XP
Scrum, a differenza di XP, non pone regole sullo sviluppo software (codifica), per cui oggi si utilizza una fusione tra Scrum e XP

#### Componenti/principi di Scrum:
- **scrum board**: lavagna/tabella in cui si catalogano le attività in *not started*, *in progeress*, *ready for test*, *done*
- **review**: riunioni intermedie di veriica sull'andamento dello sviluppo
- **planning poker**: simile al planning game per assegnare punteggio alle user stories
- **metrics**: strumenti per valutare la produttività, ad esempio burndown chart
- **daily scrum**: riunione breve (15 min) di inizio giornata su cosa viene fatto nella giornata

#### Burndown chart
- si definiscono le ore necessarie per un tot di user stories
- si prevede, lavorando tot ore al giorno, di terminare entro il giorno x
- ad ogni giornata si effettua un controllo e si traccia il burndown chart (grafico giornate-ore di lavoro mancanti)
- se si osserva che la pendendza è minore di quella prevista (si finirà più avanti) si arriverà alla deadline in cui alcune user stories non verranno completate entro la deadline, ma dovranno essere ri-schedulate la volta successiva
