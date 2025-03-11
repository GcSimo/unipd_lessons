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

Lo svantaggio è che non si ha una visione completa del progetto e non si sa a che punto dello sviluppo ci si trova. Inoltre non si ha una visione immediata e completa del progeto finale e risulterà difficile inserirla in un contratto.

#### Integration and configuration
si riciclano componenti già disponibili (plan-driven o agile)

