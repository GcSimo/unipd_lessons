# Laboratorio di programmazione

## Lezioni
#### Lezione 1 | Introduzione al corso e Hello world - 2/10/2024
- [ ] Presentazione generale del corso
- [ ] Modalità di insegnamento e active learning
- [ ] Prerequisiti
- [ ] Il libro di testo e il suo autore
- [ ] Contenuti del corso
- [ ] Modalità d'esame e date degli appelli
- [ ] Tool utilizzati durante il corso
- [ ] Motivazione alla scrittura del software e all'utilizzo del linguaggio C++
- [ ] Hello world
- [ ] Operatore <<
- [ ] Direttiva #include
- [ ] Panoramica del processo di compilazione

#### Lezione 2 | Variabili ed espressioni - 3/10/2024
- [ ] Tipo, oggetto, valore, variabile
- [ ] Assegnamento e inizializzazione
- [ ] Type safety e conversioni type safe e non
- [ ] Espressioni
- [ ] LValue e RValue
- [ ] Espressioni e variabili costanti
- [ ] Operatori con side effect
- [ ] Ordine di valutazione delle espressioni e interazione con operatori con side effect
- [ ] Tipi che influenzano gli operatori

#### Lezione 3 | Dichiarazioni, scope, librerie - 7/10/2024
- [ ] Dichiarazioni e definizioni di variabili e funzioni
- [ ] Inizializzazioni nelle definizioni
- [ ] Problemi legati alle variabili non inizializzate
- [ ] Scope: concetto
- [ ] Vari tipi di scope in C++
- [ ] Strumenti di scoping e namespace
- [ ] Dichiarazioni e direttive using
- [ ] Struttura di una libreria in file multipli: file header, file di libreria
- [ ] Include guards
- [ ] Esempio di compilazione di un progetto con librerie interne ed esterne
- [ ] Librerie statiche e dinamiche

#### Lezione 4 | Funzioni e reference - 10/10/2024
- [ ] Passaggio di argomenti a funzione: per copia/valore e per riferimento
- [ ] Potenziali problemi di efficienza nel passaggio di argomenti a funzione
- [ ] Reference oltre il passaggio di argomenti
- [ ] Reference costanti
- [ ] Conversione degli argomenti
- [ ] Record di attivazione
- [ ] Layout della memoria: text, stack, free store, initialized data segment, uninitialized data segment
- [ ] Durata / classe di memorizzazione delle variabili
- [ ] Variabili statiche vs automatiche e locali vs globali

#### Lezione 5 | Classi, membri, costruttori - 14/10/2024
- [ ] Tipi definiti dall'utente (UDT): motivazione
- [ ] Stato
- [ ] Strumenti per definire i tipi
- [ ] Classi, membri e accesso, struct
- [ ] La classe Date
- [ ] Helper function e funzioni membro
- [ ] Controllo di accesso: membri pubblici e privati
- [ ] Invarianti
- [ ] Costruttori
- [ ] Initialization list
- [ ] Definizione di funzioni membro dentro la classe (in-class) e fuori dalla classe
- [ ] Verifica di dati non validi
- [ ] Gestione dei dati non validi mediante eccezioni
- [ ] Enumerazioni: enum e enum class

#### Lezione 6 | Overloading e puntatori - 21/10/2024
- [ ] Overloading degli operatori come helper function e funzioni membro
- [ ] Pattern di argomenti per le funzioni che implementano l'overloading
- [ ] Overloading di pre- e post-incremento e di << e >>
- [ ] Return type per funzioni di overloading
- [ ] Operatore ternario
- [ ] Puntatore: concetto, definizione, inizializzazione
- [ ] Indirizzamento della memoria
- [ ] Operatore indirizzo-di
- [ ] Dereference
- [ ] Puntatori e tipi puntati
- [ ] sizeof
- [ ] Puntatori a void
- [ ] Cast tra puntatori
- [ ] Confronto tra puntatori e reference

#### Lezione 7 | Allocazione dinamica della memoria - 28/10/2024
- [ ] Funzionamento in dettaglio di std::vector e necessità di gestire buffer a run-time
- [ ] Memoria allocata dinamicamente: new e puntatori
- [ ] Caratteristiche della memoria allocata dinamicamente
- [ ] Accesso agli elementi
- [ ] Spostamento di un puntatore e garbage
- [ ] Liberare la memoria allocata dinamicamente: delete
- [ ] Memory leak
- [ ] Gestione della memoria per funzioni che ritornano memoria allocata dinamicamente
- [ ] Doppia deallocazione e dangling pointer
- [ ] Distruttore e sua chiamata implicita
- [ ] Distruttore creato automaticamente dal compilatore e distruttore esplicito
- [ ] Pro e contro dell'allocazione dinamica della memoria

#### Lezione 8 | Completare l'interfaccia di una classe - 4/11/2024
- [ ] Funzioni membro const
- [ ] Interfaccia: scegliere tra funzioni membro e helper function
- [ ] Costruttore di default
- [ ] In-class initializer
- [ ] Costruttore con inizializzazione
- [ ] Concetti di shallow e deep copy
- [ ] Costruttore di copia definito esplicitamente vs definito dal compilatore
- [ ] Assegnamento di copia
- [ ] Gestire l'auto assegnamento
- [ ] Move semantis e rvalue reference
- [ ] Costruttore e assegnamento di spostamento
- [ ] Accesso ai membri di una classe

#### Lezione 9 | Template - 11/12/2024
- [ ] Concetto di template
- [ ] Classi template
- [ ] Specializzazione di un template
- [ ] Comportamento del compilatore quando si specializza un template
- [ ] Funzioni template
- [ ] Interi come parametri template e motivazione
- [ ] Deduzione dei parametri template
- [ ] Introduzione a polimorfismo statico e dinamico
- [ ] Gestione degli header con i template: file .h e .hpp

#### Lezione 10 | Buon design di una classe e progetti complessi - 18/11/2024
- [ ] Ritornare una reference o un puntatore a membro privato
- [ ] Overloading su const
- [ ] Puntatore this e caratteristiche
- [ ] Recap per una buona interfaccia
- [ ] Operazioni essenziali per il buon design di una classe
- [ ] Rapporto tra costruttori e costruttore di default
- [ ] Costruttori espliciti
- [ ] Organizzazione di progetti complessi
- [ ] Recap file .h e .cpp
- [ ] Header multipli e include guards
- [ ] Errori di linking
- [ ] Coding style
- [ ] Introduzione a CMake e motivazione al suo uso

#### Lezione 11 | Cmake e Git - 25/11/2024
- [ ] Descrizione di un progetto software
- [ ] Sistemi di building dipendenti dalla piattaforma
- [ ] Traduzione da CMake ai sistemi di building dedicati
- [ ] Gestione di un progetto software lato utente mediante CMake
- [ ] Gestione di un progetto software lato sviluppatore mediante CMake
- [ ] Creare un semplice CMakeLists.txt
- [ ] Gestire l'evoluzione di un software: controllo di versione
- [ ] Attività fondamentali del controllo di versione
- [ ] Modello centralizzato e distribuito
- [ ] Git

#### Lezione 12 | Ereditarietà e funzioni virtuali - 2/12/2024
- [ ] Raggruppare funzionalità comuni a più classi in una classe base
- [ ] Interfaccia comune
- [ ] Paradigmi is a e has a
- [ ] Slicing
- [ ] Funzioni virtuali
- [ ] Override di funzioni
- [ ] Override con i puntatori
- [ ] Override esplicito
- [ ] Funzioni virtuali pure e classi astratte

#### Lezione 13 | Polimorfismo e contenitori STL - 9/12/2024
- [ ] Layout di memoria di classi base e derivate
- [ ] Virtual table e virtual pointer
- [ ] Polimorfismo: definizione completa
- [ ] Polimorfismo dinamico, bounded
- [ ] Polimorfismo statico, unbounded
- [ ] Upcasting, downcasting e dynamic_cast
- [ ] Operazioni sui dati
- [ ] Accesso unificato ai dati: gli iteratori
- [ ] Iteratori begin e end
- [ ] Operazioni supportate dagli iteratori
- [ ] Disaccoppiamento tra dati e algoritmi in STL
- [ ] Richiamo alle linked list

#### Lezione 14 | Iteratori e algoritmi STL - 12/12/2024
- [ ] Esempio di implementazione di un iteratore: iterator di list
- [ ] Liste vuote
- [ ] auto
- [ ] Confronto tra vector, string e list
- [ ] Insert e erase con std::vector e std::list
- [ ] Introduzione agli algoritmi STL
- [ ] Algoritmo find(), flessibilità sul contenitore utilizzato
- [ ] Algoritmi con predicati: find_if()
- [ ] Definizione di predicato
- [ ] Puntatori a funzione come predicati
- [ ] Function object e call operator
- [ ] Predicati con function object

#### Lezione 15 | Algoritmi, RAII e smart pointer - 16/12/2024
- [ ] Algoritmi di ordinamento e copia - sort() e copy()
- [ ] Lambda expression
- [ ] Cattura delle variabili
- [ ] Contenitori associativi
- [ ] Map e set
- [ ] Standard exception e relativa gerarchia delle classi
- [ ] Gestione delle risorse in presenza di eccezioni
- [ ] RAII
- [ ] Basic, strong e no-throw guarantee
- [ ] Concetto di smart pointer
- [ ] unique_ptr e shared_ptr

## Laboratorio
#### Laboratorio 1 | Variabili e funzioni - 17/10/2024
- Compilazione
- Gestione di variabili locali e globali, statiche e automatiche
- Passaggio di argomento a funzioni
- Utilizzo intuitivo di std::vector e std::string

#### Laboratorio 2 | Classi e overloading degli operatori - 24/10/2024
- Implementazione della classe Rational con costruttori e overloading degli operatori
- Array stile C
- Array come named variable
- Puntatori a elementi di un array
- Aritmetica dei puntatori
- Array e puntatori
- Decadimento di un array nel passaggio a funzione
- Stringhe stile C e null-terminatore

#### Laboratorio 3 | Puntatori e allocazione dinamica della memoria - 31/10/2024
- Gestione dei buffer di memoria allocata dinamicamente
- Implementazione della classe MyVector, semplificazione di std::vector

#### Laboratorio 4 | MyVector 2.0 - 7/11/2024
- Gestione dei buffer di memoria interni e delle politiche di allocazione della classe MyVector

#### Laboratorio 5 | MyVector 2.0 con template - 14/11/2024 - Prof. Tonin
- Evoluzione della classe MyVector con i template per rendere generico il tipo di dato contenuto

#### Laboratorio 6 | Prova intermedia - 21/11/2024
- Implementazione di un driver semplificato per la lettura di dati Lidar

#### Laboratorio 7 | Peer review prova intermedia - 28/11/2024
- Analisi e test di un progetto di prova intermedia

#### Laboratorio 8 | Navigazione di un robot - 5/12/2024 - Prof. Menegatti
- Creazione di una gerarchia di classi per la descrizione di diversi algoritmi di navigazione di un robot e interazione con una classe per la gestione di un labirinto

#### Laboratorio 9 | Smart pointer - 19/12/2024
- Uso di smart pointer
- Implementazione di una versione semplificata di unique_ptr
