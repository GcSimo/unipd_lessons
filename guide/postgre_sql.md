# Guida all'utilizzo PostgreSQL da terminale

## Avvio del server PostgreSQL (Homebrew)

| command                                 | description                                                                     |
| --------------------------------------- | ------------------------------------------------------------------------------- |
| ``brew services start postgresql@18``   | avvio del server di PostgreSQL e attivazione dell'avvio automatico al login     |
| ``brew services run postgresql@18``     | avvio del server di PostgreSQL senza attivazione dell'avvio automatico al login |
| ``brew services stop postgresql@18``    | arresto del server di PostgreSQL                                                |
| ``brew services restart postgresql@18`` | riavvio del server di PostgreSQL                                                |
| ``brew services list``                  | verifica dello stato del server di PostgreSQL                                   |

## Connessione al database tramite ``psql``
```bash
psql -U nome_utente -d database -p numero_porta -h indirizzo_host
```
- ``nome_utente`` di default: `postgres` o lo username del sistema
- ``database`` di default: `postgres`
- ``numero_porta`` di default: `5432`
- ``indirizzo_host`` di default: `localhost` (connessione locale)

## Comandi utili in ``psql``
| command              | description                                                                    |
| -------------------- | ------------------------------------------------------------------------------ |
| ``\l``               | Elenca tutti i database presenti nel server.                                   |
| ``\du``              | Elenca tutti gli utenti (ruoli) di PostgreSQL.                                 |
| ``\dn``              | Elenca tutti gli schemi (namespaces) nel database corrente.                    |
| ``\dt``              | Elenca tutte le tabelle nel database corrente.                                 |
| ``\d nome_oggetto``  | Descrive una tabella, una vista o un indice (mostra la sua struttura).         |
| ``\c nome_database`` | Connette al database specificato.                                              |
| ``\timing``          | Attiva/disattiva la visualizzazione del tempo impiegato per eseguire le query. |
| ``\h [COMMAND]``     | Mostra l'aiuto per i comandi SQL (es: \h CREATE TABLE).                        |
| ``\?``               | Mostra l'aiuto per i meta-comandi (``\``).                                     |
| ``\q``               | Esce da ``psql``.                                                              |

## Comandi SQL di Data Definition Language
```sql
CREATE DATABASE <database_name> [OWNER <username>] [ENCODING <encoding_name>];
```
Crea un nuovo database con il nome specificato, opzionalmente specificando il proprietario e la codifica dei caratteri. Ad esempio, per creare un database chiamato "Example" con codifica UTF-8: ``CREATE DATABASE Example ENCODING 'UTF-8';``

---

```sql
DROP DATABASE <database_name>;
```
Elimina il database specificato. Ad esempio, per eliminare un database chiamato "Example": ``DROP DATABASE Example;``

---

```sql
CREATE SCHEMA <schema_name> [AUTHORIZATION <username>];
```
Crea uno schema (namespace) all'interno del database corrente. Ad esempio, per creare uno schema chiamato "my_schema": ``CREATE SCHEMA my_schema;``

---

```sql
DROP SCHEMA <schema_name> [CASCADE | RESTRICT];
```
Elimina lo schema specificato. L'opzione ``CASCADE`` elimina anche tutti gli oggetti all'interno dello schema, mentre ``RESTRICT`` impedisce l'eliminazione se lo schema contiene oggetti. Il comportamento di default è ``RESTRICT``. Ad esempio, per eliminare uno schema chiamato "my_schema": ``DROP SCHEMA my_schema;``

---

```sql
CREATE TABLE <schema_name>.<table_name> (
	<column_name> <data_type> [<default_value>] [<constraint>],
	{, <column_name> <data_type> [<default_value>] [<constraint>]}
	[, <table_constraint> {, <table_constraint>}]
);
```

Crea una nuova tabella nello schema specificato con il nome specificato e le colonne definite.
I constraint possono essere:
- ``NOT NULL``: la colonna non può contenere valori nulli
- ``CHECK (expression)``: la colonna deve soddisfare una condizione specifica
- ``DEFAULT <constant> | niladic-function | NULL``: valore di default se non specificato
- ``PRIMARY KEY``: la colonna è la chiave primaria della tabella
- ``UNIQUE (<column_name> [, <column_name>])``: specifica una chiave secondaria su una o più colonne
- ``FOREIGN KEY <key_name> (<column_name> [, <column_name>]) REFERENCES <referenced_base_table> [(<column_name> [, <column_name>])] [ON DELETE <action>] [ON UPDATE <action>]``: definisce una chiave esterna che fa riferimento a un'altra tabella, con azioni opzionali per la cancellazione e l'aggiornamento (``NO ACTION`` default behaviour per proibire l'azione, ``CASCADE`` rimuove tutte le righe associate alla riga rimossa, ``SET NULL`` imposta a ``NULL`` le colonne coinvolte, ``SET DEFAULT`` imposta al valore di default le colonne coinvolte)

Ad esempio, per creare una tabella chiamata "employees" con colonne "id", "name" e "age" nello schema "company":
```sql
CREATE TABLE company.employees (
	id SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	age INT
);
```

---

```sql
DROP TABLE <table_name> [CASCADE | RESTRICT];
```
Elimina la tabella specificata. L'opzione ``CASCADE`` elimina anche gli oggetti che dipendono dalla tabella, mentre ``RESTRICT`` impedisce l'eliminazione se la tabella è referenziata da altri oggetti. Il comportamento di default è ``RESTRICT``. Ad esempio, per eliminare una tabella chiamata "employees": ``DROP TABLE employees;``

---

```sql
ALTER TABLE <table_name> <
	ADD COLUMN <column_definition> |
	DROP COLUMN <column_name> [RESTRICT | CASCADE] |
	ALTER COLUMN <column_name> <SET DEFAULT <new_default> | DROP DEFAULT> |
	ADD CONSTRAINT <constraint_definition> |
	DROP CONSTRAINT <constraint_name>
>;
```

## Comandi SQL di Data Manipulation Language
```sql
INSERT INTO <table_name> [(<column_name> [, <column_name>])] VALUES (<column_value> [, <column_value>]);
```
Inserisce una nuova riga nella tabella specificata con i valori forniti per le colonne specificate. Ad esempio, per inserire una nuova riga nella tabella "employees" con i valori "John Doe" e 30 per le colonne "name" e "age": ``INSERT INTO employees (name, age) VALUES ('John Doe', 30);``

---

```sql
DELETE FROM <table_name> [WHERE <expression>];
```
Rimuove le righe dalla tabella specificata che soddisfano la condizione specificata nella clausola ``WHERE``. Se non viene specificata alcuna condizione, tutte le righe della tabella verranno eliminate. Ad esempio, per eliminare le righe dalla tabella "employees" dove l'età è maggiore di 60: ``DELETE FROM employees WHERE age > 60;``

---

```sql
UPDATE <table_name> SET <column_name> = <expression> | NULL | DEFAULT [, <column_name> = <expression> | NULL | DEFAULT] [WHERE <expression>];
```
Aggiorna le righe nella tabella specificata, impostando i valori delle colonne specificate in base alle espressioni fornite. La clausola ``WHERE`` può essere utilizzata per limitare le righe da aggiornare. Ad esempio, per aggiornare l'età di tutti i dipendenti con il nome "John Doe" a 31: ``UPDATE employees SET age = 31 WHERE name = 'John Doe';``

---

```sql
SELECT [DISTINCT | ALL] <column_list> | *
	FROM <table_name> [<joint_type> JOIN <tbale_name> ON <join_condition>] [WHERE <expression>] [GROUP BY <column_list> [HAVING <expression>]] [ORDER BY <column_name> [ASC | DESC] [, <column_name> [ASC | DESC]]]
```
Accede ai dati memorizzati nelle tabelle del database e restituisce i risultati in base alle condizioni specificate.  La clausola ``JOIN`` consente di combinare righe da due o più tabelle in base a una condizione correlata tra di esse. La clausola ``WHERE`` filtra i risultati in base a una condizione specifica. La clausola ``GROUP BY`` raggruppa i risultati in base ai valori di una o più colonne, mentre la clausola ``HAVING`` filtra i gruppi in base a una condizione specifica. La clausola ``ORDER BY`` ordina i risultati in base ai valori di una o più colonne, in ordine crescente (``ASC``) o decrescente (``DESC``).

L'ordine logico con cui sono valutate le clausole è il seguente. Non è detto che corrisponda all'effettivo ordine reale di esecuzione che può variare a seconda dell'ottimizzazione del DBMS.
1. ``FROM e JOIN`` - (join operations)
2. ``WHERE`` - (selections)
3. ``GROUP BY`` e ``HAVING`` - (aggregate functions e grouping)
4. ``SELECT`` - (projections)
5. ``ORDER BY`` - (sorting)

---
Esempi di clausole ``WHERE``:
```sql
-- seleziona i valori contenuti nella tupla 
... WHERE <column_name> IN (<value1>, <value2>, ... ) ...

-- seleziona i valori compresi in un intervallo
... WHERE <column_name> BETWEEN <value1> AND <value2> ...

-- seleziona i valori maggiori o uguali a value1 e minori o uguali a value2
... WHERE <column_name> >= <value1> AND <column_name> <= <value2> ...

-- seleziona i valori uguali a value1 oppure uguali a value2
... WHERE <column_name> = <value1> OR <column_name> = <value> ...   
```

---

```sql
... WHERE <column_name> LIKE '<pattern>' ...
```

L'operatore ``LIKE`` viene utilizzato nella clausola ``WHERE`` per cercare un modello specifico all'interno di una colonna di tipo stringa. I caratteri jolly comunemente usati con ``LIKE`` sono:
- ``%``: rappresenta zero o più caratteri
- ``_``: rappresenta un singolo carattere
Ad esempio, per selezionare tutte le righe dalla tabella "employees" dove il nome inizia con "J": ``SELECT * FROM employees WHERE name LIKE 'J%';``

---

```sql
SELECT <column_name>, COUNT(*) FROM <table_name> GROUP BY <column_name> HAVING COUNT(*) > <number>;
```

Esegue una query che raggruppa i risultati in base ai valori di una colonna specificata e conta il numero di righe in ciascun gruppo. La clausola ``HAVING`` filtra i gruppi in base a una condizione specifica. Ad esempio, per contare il numero di dipendenti in ciascun reparto e mostrare solo i reparti con più di 5 dipendenti: ``SELECT department, COUNT(*) FROM employees GROUP BY department HAVING COUNT(*) > 5;``
Al posto di ``COUNT(*)``, è possibile utilizzare altre funzioni di aggregazione come ``SUM(column_name)``, ``AVG(column_name)``, ``MIN(column_name)``, e ``MAX(column_name)``.

Le colonne nella clausola ``SELECT`` vanno soltanto specificate le colonne presenti nella clausola ``GROUP BY``. Se le colonne sono diverse, la query funziona lo stesso in postgre solo se esiste una dipendenza funzionale tra le colonne della clausola ``SELECT`` e quelle della clausola ``GROUP BY``, ma tale comportamento è molto rischioso e non standard SQL.

---
### Nested queries
```sql
SELECT * FROM <table_name> WHERE <column_name> IN (SELECT <column_name>/<aggregate_function> FROM <table_name> WHERE <condition>);
```
È possibile annidare una query all'interno di un'altra query come parte delle clausole ``SELECT``, ``FROM``, o ``WHERE``. Ad esempio per individuare lo studente che ha ottenuto il punteggio più alto nell'esame "DB" si calcola il voto massimo all'interno della clausola ``WHERE``.
```sql
SELECT * FROM students WHERE score = (SELECT MAX(mark) FROM students WHERE course = "DB");
```

### Viste
```sql
CREATE [MATERIALIZED] VIEW <view_name> AS
	SELECT <column_list> | * FROM <table_name> [WHERE <condition>];
```
La vista è un risultato intermedio di una query SQL che può essere riutilizzato come una tabella virtuale in altre query. Esistono due tipi di viste:
- **viste online**: viene salvata solo la query per costruire tali viste i dati vengono sempre ricalcolati ogni volta che tali viste vengono inserite all'interno di una query per cui sono molto dispendiose in termini di tempo di calcolo
- **materialized views**: memorizzano anche il risultato della vista per evitarne il ricalcolo, occupano tanto spazio e rischiano di essere non aggiornate rispetto alle tabelle sottostanti 
Tutte le query che utilizzano una vista possono essere riscritte in una sola query utilizzando le nested queries.

---
## Query SQL e algebra relazionale
### Selezione (Selection)
$\rho_{\texttt{condition}}(\texttt{table\_name})$
```sql
SELECT * FROM table_name WHERE condition;
```

### Proiezione (Projection)
$\pi_\texttt{<column list>} (\texttt{<table\_name>})$
```sql
SELECT DISTINCT <column list> | * FROM <table_name>;
```
Il linguaggio SQL permette di avere tuple duplicate nella tabella derivata, per far corrispondere la query sql con l'algebra relazionale si usa la parola chiave ``DISTINCT``.

### Ordinamento (Sorting)
non visto in algebra relazionale
```sql
SELECT * FROM table_name ORDER BY <column_name> [ASC | DESC] [, <column_name> [ASC | DESC]];
```

### Renaming
$\rho_{\texttt{new\_name}}(\texttt{table\_name})$
```sql
SELECT * FROM table_name AS new_name;
```

### Set Operators
$R \cup S$, $R \cap S$, $R - S$
```sql
<query1> UNION [ALL] <query2>;
<query1> INTERSECT [ALL] <query2>;
<query1> EXCEPT [ALL] <query2>;
```
A differenza di altri DMBS e dell'algebra relazionale, non c'è alcun requisito sui nomi degli attributi; è sufficiente che il numero di colonne e i tipi di dati siano compatibili.

### Aggregate Functions
$\rho_{\texttt{new\_column\_name}} (\mathcal{F}_{\texttt{AGGRREGATE\_FUNCTION}(\texttt{<column\_name>})} (\texttt{<table\_name>}))$
```sql
SELECT AGGREGATE_FUNCTION([DISTINCT] <column_name>) AS new_column_name FROM <table_name>;
```

### Grouping
$\rho_{\texttt{<grouping\_columns>, <new\_aggregate\_column\_name>}} (_{\texttt{<grouping\_columns>}} \mathcal{F}_{\texttt{AGGREGATE\_FUNCTION}(\texttt{<column\_name>})} (\texttt{<table\_name>}))$
```sql
SELECT <column_list>, AGGREGATE_FUNCTION([DISTINCT] <column_name>) AS <new_aggregate_column_name> FROM <table_name> GROUP BY <grouping_columns> HAVING <condition> ORDER BY <column_name> [ASC | DESC];
```
Da fare attenzione alle condizioni nella clausola ``HAVING``: siccome viene eseguita prima del rename della colonna aggregata, bisogna utilizzare il nome originale della colonna ``AGGREGATE_FUNCTION(<column_name>)`` e non il nuovo nome ``<new_column_name>``.
Inoltre si osserva che ``HAVING`` filtra sulle tuple dopo il raggruppamento, mentre il ``WHERE`` filtra sulle tuple prima del raggruppamento. 

### JOIN
- Inner Join: $\quad R \bowtie_{common\_column\_from\_r = common\_column\_from\_s} S$
```sql
SELECT * FROM R AS r [INNER] JOIN S AS s ON r.common_column = s.common_column;
```

- Natural Join: $\quad R \bowtie S$
```sql
SELECT * FROM R [NATURAL] JOIN S;
```

- Left Outer Join: $\quad R \ \texttt{⟕}_{common\_column\_from\_r = common\_column\_from\_s} \ S$
```sql
SELECT * FROM R LEFT [OUTER] JOIN S ON R.common_column = S.common_column;
```

- Right Outer Join: $\quad R \ \texttt{⟖}_{common\_column\_from\_r = common\_column\_from\_s} \ S$
```sql
SELECT * FROM R RIGHT [OUTER] JOIN S ON R.common_column = S.common_column;
```

- Full Outer Join: $\quad R \ \texttt{⟗}_{common\_column\_from\_r = common\_column\_from\_s} \ S$
```sql
SELECT * FROM R FULL [OUTER] JOIN S ON R.common_column = S.common_column;
```

- Multiple Joins: $\quad R \bowtie_{\theta_1} S \bowtie_{\theta_2} T$
```sql
SELECT * FROM R AS r
	[INNER] JOIN S AS s ON r.common_column1 = s.common_column1
	[INNER] JOIN T AS t ON s.common_column2 = t.common_column2;
```

- Generalize projection: $\quad \rho_\texttt{<column\_list>,age} \mathcal{F}_{\texttt{get\_age}(\texttt{<date\_column>})}(R)$
```sql
SELECT r.<column_list>, EXTRACT(YEAR FROM AGE(CURRENT_DATE, r.<date_column>)) AS age FROM R AS r
```
La funzione ``AGE`` restituisce l'intervallo di tempo tra due date, in questo caso l'età attuale della persona, con ``EXTRACT(YEAR FROM ...)`` si estrae solo la parte dell'anno.

## Tipi di dato in SQL
### Dati built-in:
- ``CHARACTER(n)``, ``CHAR(n)``: fixed-length string of exactly n characters (n > 0)
- ``CHARACTER VARYING(n)``, ``VARCHAR(n)``: variable-length string up to n characters (n > 0)
- ``BINARY(n)``: fixed-length string of exactly n bytes (n > 0)
- ``BINARY VARYING(n)``, In PostgreSQL it is called BYTEA
- ``VARBINARY(n)``: variable-length string up to n bytes (n > 0).
- ``NUMERIC(p [, s])``: arbitrary precision number with p total digits and s digits in the fractional part.
It is especially recommended for storing monetary amounts and other quantities where exactness is
required, e.g. money.
- ``SMALLSERIAL``, ``SERIAL``, ``BIGSERIAL`` [PostgreSQL only]: auto-incrementing integer

- ``INTEGER``: signed integer number, implementation-dependent
In PostgreSQL, 4 bytes integer in the range -2147483648 to +2147483647
- ``SMALLINT``: short signed integer number, implementation-dependent, with precision less than INTEGER
In PostgreSQL, 2 bytes integer in the range -32768 to +32767
- ``BIGINT``: long signed integer number, implementation-dependent, with precision bigger than INTEGER
In PostgreSQL, 8 bytes integer in the range -9223372036854775808 to +9223372036854775807
- ``REAL``: signed floating point, implementation-dependent
In PostgreSQL, 4 bytes floating point number with 6 digits of precision
- ``DOUBLE PRECISION``: long floating point number, implementation-dependent, with precision bigger than ``REAL``
In PostgreSQL, 8 bytes floating point number with 15 digits of precision
- ``BOOLEAN``: logical values
- ``DATE``: date (day, month, year) without time of day
- ``TIME [WITH TIMEZONE | WITHOUT TIMEZONE]``: time of day (no date), with or without timezone
- ``TIMESTAMP [WITH TIMEZONE | WITHOUT TIMEZONE]``: date and time, with or without timezone
- ``INTERVAL x [TO y]``: time interval

### UUID
``uuid`` type is a 128-bit Universally Unique Identifier generated using one of several standard algorithms in the ``uuid-ossp`` module

### Range Types
A range type represents a range of values of some element type (called range's subtype). PostgreSQL provides the following range types:
- ``int4range``: range of integer
- ``int8range``: range of bigint
- ``numrange``: range of numeric
- ``tsrange``: range of timestamp without time zone
- ``tstzrange``: range of timestamp with time zone
- ``daterange``: range of date

### JSON Type
Stores JSON (JavaScript Object Notation) data.
- ``json``: stores an exact copy of the input text, which must be a valid JSON value
- ``jsonb``: stores data in a decomposed binary format that makes it slightly slower to input due to added conversion overhead, but significantly faster to process, since no reparsing is needed

JSON Types are extensively used in Non Relational Databases aka NoSQL databases.

### Custom Types - Enumerated Types
```
CREATE TYPE <enum_name> AS ENUM ('<value1>', '<value2>', ...)
```
Crea un enumerated type con il nome specificato e i valori elencati. Ad esempio, per creare un enumerated type chiamato "mood" con i valori "happy", "sad" e "neutral": ``CREATE TYPE mood AS ENUM ('happy', 'sad', 'neutral');``

---

```
DROP TYPE <enum_name> [CASCADE | RESTRICT];
```
Elimina l'enumerated type specificato. L'opzione ``CASCADE`` elimina anche gli oggetti che dipendono dal tipo, mentre ``RESTRICT`` impedisce l'eliminazione se il tipo è referenziato da altri oggetti. Il comportamento di default è ``RESTRICT``. Ad esempio, per eliminare un enumerated type chiamato "mood": ``DROP TYPE mood;``


### Domain Types
```
CREATE DOMAIN <domain_name> AS <data_type> [CONSTRAINT <constraint_name> <constraint_definition>];
```
Crea un domain type con il nome specificato basato su un tipo di dato esistente, con eventuali vincoli aggiuntivi.
I vincoli possono essere:
- ``[DEFAULT NOT NULL | NULL]``: per specificare se il campo può essere ``NULL`` o deve avere un valore di default
- ``CHECK (expression)``: per specificare una condizione che i valori devono soddisfare

Ad esempio, per creare un domain type chiamato "positive_int" basato su INTEGER con un vincolo che richiede valori maggiori di zero: ``CREATE DOMAIN positive_int AS INTEGER CHECK (VALUE > 0);``

---

```
DROP DOMAIN <domain_name> [CASCADE | RESTRICT];
```
Elimina il domain type specificato. L'opzione ``CASCADE`` elimina anche gli oggetti che dipendono dal tipo, mentre ``RESTRICT`` impedisce l'eliminazione se il tipo è referenziato da altri oggetti. Il comportamento di default è ``RESTRICT``. Ad esempio, per eliminare un domain type chiamato "positive_int": ``DROP DOMAIN positive_int;``

---

---

---

## Documentazione comandi ``psql``
### Generali
| command                            | description                                                                                                |
| ---------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| ``\copyright``                     | mostra i termini di uso e distribuzione di PostgreSQL                                                      |
| ``\crosstabview [COLONNE]``        | esegui la query e mostra il risultato in crosstab                                                          |
| ``\errverbose``                    | mostra il messaggio di errore più recente alla massima loquacità                                           |
| ``\g [(OPZIONI)] [FILE]``          | esegue la query (e invia il risultato a file o pipe); ``\g`` senza argomenti equivale a un punto e virgola |
| ``\gdesc``                         | descrivi il risultato della query, senza eseguirla                                                         |
| ``\gexec``                         | esegui la query, poi esegui ogni valore nel suo risultato                                                  |
| ``\gset [PREFIX]``                 | esegui la query e salva il risultato in una variabile psql                                                 |
| ``\gx [(OPZIONI)] [FILE]``         | come ``\g``, ma forza la modalità di output espansa                                                        |
| ``\q``                             | esci da psql                                                                                               |
| ``\restrict RESTRICT_KEY``         | enter restricted mode with provided key enter restricted mode with provided key                            |
| ``\unrestrict RESTRICT_KEY``       | exit restricted mode if key matches                                                                        |
| ``\watch [[i=]SEC] [c=N] [m=MIN]`` | execute query every SEC seconds, up to N times, stop if less than MIN rows are returned                    |

### Aiuto
| command           | description                                                               |
| ----------------- | ------------------------------------------------------------------------- |
| ``\? [commands]`` | mostra aiuto sui comandi backslash                                        |
| ``\? options``    | mostra aiuto sulle opzioni di riga di comando psql                        |
| ``\? variables``  | mostra aiusto sulle variabili speciali                                    |
| ``\h [NOME]``     | mostra aiuto sulla sintassi dei comandi SQL, ``*`` mostra tutti i comandi |

### Buffer Query
| command                   | description                                                     |
| ------------------------- | --------------------------------------------------------------- |
| ``\e [FILE] [RIGA]``      | modifica il buffer della query (o il file) con l'editor esterno |
| ``\ef [FUNZIONE [RIGA]]`` | modifica la definizione della funzione con l'editor esterno     |
| ``\ev [VISTA [LINE]]``    | modifica la definizione della vista con un editor esterno       |
| ``\p``                    | mostra i contenuti del buffer query                             |
| ``\r``                    | reimposta (cancella) il buffer query                            |
| ``\s [FILE]``             | mostra la cronologia salvala in un file                         |
| ``\w FILE``               | scrivi il buffer query su file                                  |

### Input/Output
| command                  | description                                                              |
| ------------------------ | ------------------------------------------------------------------------ |
| ``\copy ...``            | esegui una SQL COPY con flusso di dati dal client                        |
| ``\echo [-n] [STRING]``  | scrive la stringa nello standard output (-n per nessuna nuova riga)      |
| ``\i FILE``              | esegui i comandi dal file                                                |
| ``\ir FILE``             | come ``\i``, ma relativo alla posizione nello script corrente            |
| ``\o [FILE]``            | invia i risultati della query ad un file oppure una pipe                 |
| ``\qecho [-n] [STRING]`` | scrive la stringa in ``\o`` flusso di output (-n per nessuna nuova riga) |
| ``\warn [-n] [STRING]``  | scrive la stringa nell'errore standard (-n per nessuna nuova riga)       |

### Condizionale
| command        | description                                       |
| -------------- | ------------------------------------------------- |
| ``\if ESPR``   | inizia un blocco condizionale                     |
| ``\elif ESPR`` | alternativa all'interno di un blocco condizionale |
| ``\else``      | alternativa finale in un blocco condizionale      |
| ``\endif``     | fine del blocco condizionale                      |

### Informativi
(options: S = show system objects, x = expanded mode, + = additional detail)
| command                                       | description                                               |
| --------------------------------------------- | --------------------------------------------------------- |
| ``\d[Sx+]``                                   | list tables, views, and sequences                         |
| ``\d[S+]   NAME``                             | describe table, view, sequence, or index                  |
| ``\da[Sx]  [PATTERN]``                        | list aggregates                                           |
| ``\dA[x+]  [PATTERN]``                        | list access methods                                       |
| ``\dAc[x+] [AMPTRN [TYPEPTRN]]``              | list operator classes                                     |
| ``\dAf[x+] [AMPTRN [TYPEPTRN]]``              | list operator families                                    |
| ``\dAo[x+] [AMPTRN [OPFPTRN]]``               | list operators of operator families                       |
| ``\dAp[x+] [AMPTRN [OPFPTRN]]``               | list support functions of operator families               |
| ``\db[x+]  [PATTERN]``                        | list tablespaces                                          |
| ``\dc[Sx+] [PATTERN]``                        | list conversions                                          |
| ``\dconfig[x+] [PATTERN]``                    | list configuration parameters                             |
| ``\dC[x+]  [PATTERN]``                        | list casts                                                |
| ``\dd[Sx]  [PATTERN]``                        | show object descriptions not displayed elsewhere          |
| ``\dD[Sx+] [PATTERN]``                        | list domains                                              |
| ``\ddp[x]  [PATTERN]``                        | list default privileges                                   |
| ``\dE[Sx+] [PATTERN]``                        | list foreign tables                                       |
| ``\des[x+] [PATTERN]``                        | list foreign servers                                      |
| ``\det[x+] [PATTERN]``                        | list foreign tables                                       |
| ``\deu[x+] [PATTERN]``                        | list user mappings                                        |
| ``\dew[x+] [PATTERN]``                        | list foreign-data wrappers                                |
| ``\df[anptw][Sx+] [FUNCPTRN [TYPEPTRN ...]]`` | list [only agg/normal/procedure/trigger/window] functions |
| ``\dF[x+]  [PATTERN]``                        | list text search configurations                           |
| ``\dFd[x+] [PATTERN]``                        | list text search dictionaries                             |
| ``\dFp[x+] [PATTERN]``                        | list text search parsers                                  |
| ``\dFt[x+] [PATTERN]``                        | list text search templates                                |
| ``\dg[Sx+] [PATTERN]``                        | list roles                                                |
| ``\di[Sx+] [PATTERN]``                        | list indexes                                              |
| ``\dl[x+]``                                   | list large objects, same as \lo_list                      |
| ``\dL[Sx+] [PATTERN]``                        | list procedural languages                                 |
| ``\dm[Sx+] [PATTERN]``                        | list materialized views                                   |
| ``\dn[Sx+] [PATTERN]``                        | list schemas                                              |
| ``\do[Sx+] [OPPTRN [TYPEPTRN [TYPEPTRN]]]``   | list operators                                            |
| ``\dO[Sx+] [PATTERN]``                        | list collations                                           |
| ``\dp[Sx]  [PATTERN]``                        | list table, view, and sequence access privileges          |
| ``\dP[itnx+] [PATTERN]``                      | list [only index/table] partitioned relations [n=nested]  |
| ``\drds[x] [ROLEPTRN [DBPTRN]]``              | list per-database role settings                           |
| ``\drg[Sx] [PATTERN]``                        | list role grants                                          |
| ``\dRp[x+] [PATTERN]``                        | list replication publications                             |
| ``\dRs[x+] [PATTERN]``                        | list replication subscriptions                            |
| ``\ds[Sx+] [PATTERN]``                        | list sequences                                            |
| ``\dt[Sx+] [PATTERN]``                        | list tables                                               |
| ``\dT[Sx+] [PATTERN]``                        | list data types                                           |
| ``\du[Sx+] [PATTERN]``                        | list roles                                                |
| ``\dv[Sx+] [PATTERN]``                        | list views                                                |
| ``\dx[x+]  [PATTERN]``                        | list extensions                                           |
| ``\dX[x]   [PATTERN]``                        | list extended statistics                                  |
| ``\dy[x+]  [PATTERN]``                        | list event triggers                                       |
| ``\l[x+]   [PATTERN]``                        | list databases                                            |
| ``\sf[+]   FUNCNAME      ``                   | show a function's definition                              |
| ``\sv[+]   VIEWNAME      ``                   | show a view's definition                                  |
| ``\z[Sx]   [PATTERN]``                        | same as \dp                                               |

### Large Object
| command                        | description                                       |
| ------------------------------ | ------------------------------------------------- |
| ``\lo_export FILE LOBOID``     | scrive un oggetto di grandi dimensioni su un file |
| ``\lo_import FILE [COMMENTO]`` | leggi oggetti di grandi dimensioni da file        |
| ``\lo_list[x+]``               | lista oggetti di grandi dimensioni                |
| ``\lo_unlink LOBOID``          | elimina un oggetto di grandi dimensioni           |

### Formattazione
| command                  | description                                                                 |
| ------------------------ | --------------------------------------------------------------------------- |
| ``\a``                   | alterna tra modalità di output allineata e disallineata                     |
| ``\C [STRINGA]``         | imposta nome tabella oppure elimina se la stringa non è specificata         |
| ``\f [STRINGA]``         | mostra o imposta il separatore di campo per l'output query disallineato     |
| ``\H``                   | cambia modalità HTML (attualmente disattivato)                              |
| ``\pset [NAME [VALUE]]`` | set table output option: ``(border\|columns\|csv_fieldsep\|expanded\|fieldsep\|fieldsep_zero\|footer\|format\|linestyle\|null\|numericlocale\|pager\|pager_min_lines\|recordsep\|recordsep_zero\|tableattr\|title\|tuples_only\|unicode_border_linestyle\|unicode_column_linestyle\|unicode_header_linestyle\|xheader_width)`` |
| ``\t [on\|off]``         | mostra solo le righe (attualmente disattivato)                              |
| ``\T [STRINGA]``         | imposta gli attributi HTML di \<table>, se non specificato allora annullali |
| ``\x [on\|off\|auto]``   | cambia modalità output espansa (attualmente disattivato)                    |

### Connessione
| command                                                          | description                                            |
| ---------------------------------------------------------------- | ------------------------------------------------------ |
| ``\c[onnect] {[DBNAME\|- USER\|- HOST\|- PORT\|-] \| conninfo}`` | connetti ad un nuovo database (attualmente "postgres") |
| ``\conninfo``                                                    | mostra le informazioni sulla connessione corrente      |
| ``\encoding [CODIFICA]``                                         | mostra o imposta la codifica del client                |
| ``\password [UTENTE]``                                           | cambia la password per un utente in sicurezza          |

### Sistema operativo
| command                    | description                                                       |
| -------------------------- | ----------------------------------------------------------------- |
| ``\cd [DIRECTORY]``        | cambia la directory di lavoro                                     |
| ``\getenv PSQLVAR ENVVAR`` | recupera la variabile di ambiente                                 |
| ``\setenv NOME [VALORE]``  | imposta o elimina una variabile d'ambiente                        |
| ``\timing [on\|off]``      | imposta cronometro dei comandi  (attualmente disattivato)         |
| ``\! [COMANDO]``           | esegui un comando in una shell oppure avvia una shell interattiva |

### Variabili
| command                  | description                                                                            |
| ------------------------ | -------------------------------------------------------------------------------------- |
| ``\prompt [TESTO] NOME`` | richiedi all'utente di impostare una variabile interna                                 |
| ``\set [NOME [VALORE]]`` | imposta una variabile interna, oppure mostrale tutte se non sono specificati parametri |
| ``\unset NOME``          | cancella una variabile interna                                                         |

### Extended Query Protocol
| command                              | description                                             |
| ------------------------------------ | ------------------------------------------------------- |
| ``\bind [PARAM]...``                 | set query parameters                                    |
| ``\bind_named STMT_NAME [PARAM]...`` | set query parameters for an existing prepared statement |
| ``\close_prepared STMT_NAME``        | close an existing prepared statement                    |
| ``\endpipeline``                     | exit pipeline mode                                      |
| ``\flush``                           | flush output data to the server                         |
| ``\flushrequest``                    | send request to the server to flush its output buffer   |
| ``\getresults [NUM_RES]``            | read NUM_RES pending results, or all if no argument     |
| ``\parse STMT_NAME``                 | create a prepared statement                             |
| ``\sendpipeline``                    | send an extended query to an ongoing pipeline           |
| ``\startpipeline``                   | enter pipeline mode                                     |
| ``\syncpipeline``                    | add a synchronisation point to an ongoing pipeline      |
