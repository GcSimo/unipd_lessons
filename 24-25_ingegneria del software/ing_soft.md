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
