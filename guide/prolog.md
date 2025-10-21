# Prolog (Programmation en Logique)

## Storia
- sviluppato da Alain Colmerauer e Philippe Roussel all'Università di Aix-Marseille in collaborazione con Robert Kowalski dell'Università di Edimburgo tra la fine degli anni '60 e l'inizio degli anni '70
- 1972: nascita ufficialmente riconosciuta di Prolog con la pubblicazione di "Programming in Prolog" di Colmerauer e Roussel
- 1977: svilupato il primo compilatore Prolog (DEC-10 Prolog) da parte di David Warren dell'Università di Edimburgo
- 1995: standardizzato ISO Prolog
- applicazioni
  - in IBM Watson (per gioco di Jeopardy!)
  - in alcuni progetti della NASA per speech guided navigations nella ISS
  - nel Natural Language Processing (NLP)
  - in sistemi esperti per diagnosi medica e consulenza legale

## Caratteristiche
- approssima la First Order Logic (FOL), manipola simboli (non numeri)
- linguaggio dichiarativo: si indicano le conoscenze attraverso fatti e regole e si effettuano delle richieste o query per ottenere risposte
- linguaggio operazionale: sfrutta i teoremi della FOL (inferenza per unificazione e risoluzione) per soddisfare le richieste
- linguaggio non procedurale: non si specifica come risolvere un problema, ma solo cosa si vuole ottenere
- semplice ed efficiente, è usato in alternativa agli LLM dove si richiede alta efficienza per scarse risorse computazionali)

## Programmazione in Prolog
### Struttura base di un programma Prolog
Un programma in Prolog è composto da una serie di termini o **clausole di Horn** (disgiunzione di letterali con al massimo un letterale positivo). Ogni clausola termina con il punto ``.``.

Il programma si divide in due sezioni principali:
  - **Knowledge Base** o KB: insieme della conoscenza del programma, è composto da:
    - **fatti**: verità assolute nel dominio del problema, definite dallo knowledge engineer ed espresse con predicati e argomenti (costanti o variabili), ad esempio ``parent(john, mary).``
    - **regole**: implicazioni logiche tra i fatti, sono composte da ``head``, ``neck`` (``:-``) e ``body``, ad esempio ``grandparent(X, Y) :- parent(X, Z), parent(Z, Y).``
  - **query**: dette goal o headless rule (``?- body``), servono per interrogare il programma e verificare se un certo fatto è vero o falso, ovvero se ``KB |= Query``

```prolog
% --- KNOWLEDGE BASE ---
% fatti
fact1(term1, term2, ...).
fact2(term1, term2, ...).

% regole
rule1(Term, ...) :- condition1(Term), condition2(term2), condition3(term2).
rule2(Term, ...) :- condition1(Term), condition2(term1); condition3(term2).

% --- QUERY ---
?- goal(Term1, Term2, ...).
```

Le regole o i fatti composti da più disgiunzioni (or) possono essere distribuiti su più righe differenti.

```prolog
% regola con disgiunzione in un'unica riga
likes(Mary,X) :- icecream(X); pizza(X).

% stessa regola distribuita su più righe
likes(Mary,X) :- icecream(X).
likes(Mary,X) :- pizza(X).
```

L'insieme di tutte le regole o fatti che condividono lo stesso predicato (nome e arità) costituiscono una **procedura**.

```prolog
% procedura 'parent' composta da più regole e fatti con stesso predicato
parent(john, mary).
parent(mary, susan).
parent(X,Y) :- father(X,Y).
parent(X,Y) :- mother(X,Y).
```

### Classificazione dei termini in Prolog
I termini in Prolog sono entità fondamentali che rappresentano dati o espressioni e si classificano in:
- **termini semplici**: divisi in variabili e costanti (numeri, atomi):
  - **variabili**: iniziano con lettere maiuscole o ``_`` se sono variabili anonime, (es. ``X, Y, Person, _Var``)
  - **numeri**: interi o float (es. ``42, 3.14``)
  - **atomi**: stringhe di caratteri che iniziano con lettere minuscole, possono contenere lettere, numeri e underscore `_` (es. ``apple, john_doe, 'Hello World'``)
- **termini composti**: formati da un predicato (``functor``) e una lista di termini racchiusi tra parentesi tonde e separati da virgole, ad esempio ``functor(term1, term2, ...)``, è possibile annidare termini composti all'interno di altri termini composti (es. ``parent(john, child(mary, age(5)))``)

Essendo tipizzato dinamicamente, per verificare il tipo di un termine, si possono usare i seguenti predicati:
- ``var(Term)``: verifica se è una variabile non istanziata (che non ha ancora un valore assegnato)
- ``nonvar(Term)``: verifica se è una variabile istanziata (che ha già un valore assegnato)
- ``integer/float/number(Term)``: verifica se è un intero/float/numero
- ``atom(Term)``: verifica se è un atomo
- ``atomic(Term)``: verifica se è un atomo o un numero

```prolog
% --- termini semplici ---
% variabili
var(X). % true, X è una variabile
var(_X). % true, _X è una variabile anonima
var(john). % false, john è un atomo

var(X = 5). % false, X è istanziata a 5
nonvar(X = 5). % true, X è istanziata a 5

% numeri
integer(42). % true
float(3.14). % true
number(2.71). % true
number(hello). % false, hello è un atomo

% atomi
atom(apple). % true
atom(john_doe). % true
atom('Hello World'). % true
atom(123). % false, 123 è un numero

% --- termini composti ---
parent(john, mary). % predicato con due atomi
father(john, child(mary, age(5))). % predicati annidati
```

### Operatori in Prolog
- ``:-``: implicazione logica (if)
- ``,``: congiunzione logica (and)
- ``;``: disgiunzione logica (or)
- ``not(X)``: negazione
- ``=``: unificazione
- ``=:=``: uguaglianza aritmetica
- ``is``: assegnazione di valori a variabili per operazioni aritmetiche
- ``!``: cut, blocca l'esplorazione di altre alternative (backtracking)
- ``fail``: fallimento forzato di una regola

### Liste
Le liste sono sequenze non omogenee di elementi (atomi, numeri, liste, ...) racchiusi tra parentesi quadre e separati da virgole. È possibile utilizzare la notazione con head e tail per decomporre le liste, ad esempio:

```prolog
% lista con elementi di tipi diversi
[antonio, [2, [b,c]], f(X), [] ].

% Head = antonio, Tail = [[2, [b,c]], f(X), []]
[Head|Tail] = [antonio, [2, [b,c]], f(X), [] ].

% Head = antonio, Second = [2, [b,c]], Others = [f(X), []]
[First|Second|Others] = [antonio, [2, [b,c]], f(X), [] ].
```

Esistono alcuni predicati per operare sulle liste:
- ``length(List, Length)``: calcola la lunghezza di una lista
- ``member(Element, List)``: verifica se un elemento è membro di una lista
- ``append(List1, List2, Result)``: concatena due liste


## Esecuzione di un programma Prolog
### Binding e Backtracking
L'esecuzione di un programma in Prolog si basa su binding e backtracking:
- **binding**: vengono assegnati dei simboli alle variabili e si verifica che i fatti e le regole soddisfino tale assegnazione
- **backtracking**: se qualche regola o fatto non è soddisfatto, si torna indietro all'ultima assegnazione valida e si prova una diversa assegnazione; inoltre il backtracking viene utilizzato per esplorare tutte le possibili soluzioni ad una query provando tutti i possibili binding

L'ordine delle assegnazioni dipende dall'ordine in cui sono scritti i fatti e i subgoal delle regole nel programma. È consigliato scrivere prima i fatti, poi le regole più facili da valutare e infine le regole più complesse.

Durante l'esecuzione si costruisce un albero di ricerca in cui:
- ogni nodo rappresenta un subgoal (predicato da verificare)
- ogni ramificazione rappresenta una possibile assegnazione di valori alle variabili
- l'esplorazione avviene in profondità (depth-first search), cercando di soddisfare tutti i subgoal

### Unificazione (=)
L'unificazione è il processo con cui si effettua il binding tra simboli e variabili in modo da ottenere la stessa espressione da entrambe le parti dell'uguale.

L'unificazione di due termini avviene con successo solo se i due termini sono uguali o se possono essere resi uguali attraverso una serie di sostituzioni o binding delle variabili. In particolare, due termini possono essere unificati se:
- entrambi sono costanti e sono uguali
- uno è una variabile e l'altro è un termine (binding della variabile al termine)
- entrambi sono variabili non ancora istanziate (una viene sostituita dall'altra)
- uno è una variabile istanziata e l'altro è un termine (la variabile viene sostituita dal termine)
- entrambi sono termini complessi con lo stesso functor, lo stesso numero di argomenti e se i loro argomenti possono essere unificati ricorsivamente

Se si prova ad unificare una variabile con un termine che contiene la stessa variabile, si crea un ciclo infinito (ad esempio ``X = father(X) => X = father(father(X)) => ...``) Prolog non effettua nessun controllo e non restituisce nessun errore se ciò si verifica. Per verificare se due termini possono essere unificati senza creare cicli in maniera sicura si utilizza il predicato ``unify_with_occurs_check(Term1, Term2).``.

### Assegnazione aritmetica (is)
L'assegnazione di variabili per operazioni aritmetiche avviene con il predicato ``is``, che valuta l'espressione a destra e assegna il risultato alla variabile a sinistra. Se si prova ad usare una variabile non ancora istanziata come "rvalue" in un'espressione aritmetica, Prolog restituirà un errore.

```prolog
X is 2 + 3. % X viene assegnato il valore 5
Y is X * 2. % Y viene assegnato il valore 10
Z is W - 4. % errore, W non è istanziata
```

### Ricorsione
Prolog supporta la ricorsione, che permette di definire regole che si richiamano da sole.

```prolog
factorial(0, 1). % caso base
factorial(N, L) :- N > 0, N1 is N - 1, factorial(N1, L1), L is N * L1.
```

### Backtracking con operatore cut (!)
L'operatore cut ``!`` è un predicato speciale che impedisce l'esplorazione di altre alternative (backtracking) una volta che viene raggiunto. Viene utilizzato per:
- ottimizzare le prestazioni (evitare di esplorare rami inutili dell'albero di ricerca)
- gestire eccezioni o casi particolari (in parallelo con ``fail``)
- controllare il flusso di esecuzione nel debug

In pratica tutto quello che c'è dopo il cut non verrà considerato nella valutazione del vincolo, se posto alla fine della espressione serve per non far valutare eventuali alternative (cortocircuito).

```prolog
% se X >= Y, non serve valutare anche la seconda regola
max(X, Y, X) :- X >= Y, !.

% regola non valutata se il cut è stato raggiunto
max(X, Y, Y) :- X < Y.
```

In base al contesto in cui viene usato, il cut può essere classificato in due tipi:
- **cut verde (green cut)**: usato per ottimizzare le prestazioni senza cambiare il significato logico del programma
- **cut rosso (red cut)**: usato per cambiare il significato logico del programma, influenzando il flusso di esecuzione e i risultati ottenuti.

### Gestione dei casi particolari con cut, fail e not
Il ``fail`` è un predicato che forza il fallimento della regola corrente. Viene spesso utilizzato in combinazione con il cut per gestire eccezioni o casi particolari, impedendo che vengano valutate regole successive.

```prolog
bird(nightingale).
bird(blackbird).
bird(king_penguin).
penguin(king_penguin).

% caso particolare: i pinguini non volano, non serve valutare altre regole
can_fly(X) :- penguin(X), !, fail.

% regola non valutata se il fail è stato raggiunto
can_fly(X) :- bird(X).
```

Quando viene eseguita la query ``?- can_fly(X).``, verrà restituito ``false``, siccome appena raggiunto il caso particolare, il cut blocca l'esplorazione di altre regole (come ``bird(X)``) e il ``fail`` forza il fallimento della regola.

Per ovviare a questo problema, in alternativa al ``fail`` si può usare il predicato cut negato ``not(Term)``:

```prolog
bird(nightingale).
bird(blackbird).
bird(king_penguin).
penguin(king_penguin).

can_fly(X) :- bird(X), not(penguin(X)).
```
In questo modo, quando viene eseguita la query ``?- can_fly(X).``, verranno restituiti tutti gli uccelli che non sono pinguini (``X = nightingale; X = blackbird``) in quanto non c'è nessun cut che blocca l'esplorazione delle regole successive.
