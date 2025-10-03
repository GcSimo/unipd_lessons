# Guida per python

## Cos'è Python?
- nato nel dicembre del 1989 da Guido van Rossum
- linguaggio di programmazione semplice (simple is better than complex), gratis, flessibile, interpretato e non molto efficiente
- successore del linguaggio ABC usato da Guido van Rossum nel CWI (Centrum Wiskunde & Informatica) di Amsterdam
- origine del nome: serie televisiva "Monty Python's Flying Circus"
- linguaggio interpretato: il codice viene eseguito riga per riga da un interprete
- linguaggio ad alto livello: più vicino al linguaggio umano rispetto al linguaggio macchina
- basato sulla risoluzione di problemi in maniera veloce e non sulla performance e applicazioni a basso livello  
- facilmente integrabile con altri linguaggi come C, C++ e Java
- elimina elementi di complessità come ``{}`` e ``;`` ma si basa pesantemente sull'indentazione

### Struttura del codice
- il codice Python è strutturato in blocchi indentati
- keywords: ``if``, ``for``, ``while``, ``def``, ``class``, ``try``, ``except``, ``with``

### Variabili
- non serve dichiarare il tipo della variabile perché viene dedotto automaticamente
- tipi di dato principali: ``integer``, ``float``, ``string``, liste, tuple, dizionari, set, ``NoneType``
- non ci sono i ``char``
- per dedurre il tipo di una variabile si può usare la funzione ``type()``

```python
x = 5
print(type(x))  # Output: <class 'int'>
y = 3.14
print(type(y))  # Output: <class 'float'>
name = "Alice"
print(type(name))  # Output: <class 'str'>
```
- nei nomi delle variabili non si possono usare spazi, caratteri speciali (tranne ``_``) e non possono iniziare con un numero
- non essendo tipizzato, si può cambiare il tipo di una variabile assegnandole un nuovo valore di tipo diverso

```python
x = 5       # x è un intero
x = "Hello" # ora x è una stringa
```

- casting: si può convertire una variabile da un tipo ad un altro usando le funzioni ``int()``, ``float()``, ``str()``

```python
x = 5       # x è un intero
y = float(x) # y è un float
z = str(x)   # z è una stringa
```

### Input e Output
- per stampare a schermo si usa la funzione ``print()``

```python
print("Hello, World!")
```

- per leggere l'input da tastiera si usa la funzione ``input()``
- la funzione ``input()`` restituisce sempre una stringa, quindi se si vuole un altro tipo di dato bisogna fare il cast

```python
name = input("Enter your name: ")
print(name)
```

### Funzioni
- si definiscono con la keyword ``def``

```python
def greet(name):
    print("Hello, " + name + "!")

greet("Alice")
```

- le variabili definite all'interno di una funzione sono locali e non possono essere usate fuori dalla funzione
- se è presente una variabile globale che viene utilizzata all'interno di una funzione, le modifiche fatte alla variabile all'interno della funzione non influenzano la variabile globale a meno che non si usi la keyword ``global``

```python
x = 5

def modify():
    x = 10

modify()

print(x)  # Output: 5
```

```python
x = 5

def modify():
	global x
	x = 10

modify()

print(x)  # Output: 10
```

- le variabili sono passate per riferimento, quindi se si passa una lista o un dizionario ad una funzione e si modifica all'interno della funzione, la modifica sarà visibile anche fuori dalla funzione

```python
def modify_list(lst):
	lst.append(4)

my_list = [1, 2, 3]
modify_list(my_list)
print(my_list)  # Output: [1, 2, 3, 4]
```

### Assegnazioni multiple, packing e unpacking
- packing: dichiarazione in sequenza di valori separati da virgole

```python
t = 1, 2, 3
print(t)  # Output: (1, 2, 3)
```

- unpacking: assegnazione di una tupla a più variabili

```python
t = (1, 2, 3)
a, b, c = t
print(a)  # Output: 1
print(b)  # Output: 2
print(c)  # Output: 3
```

- range: funzione che genera una sequenza di numeri interi

```python
a, b, c, d = range(4, 8)
print(a)  # Output: 4
print(b)  # Output: 5
print(c)  # Output: 6
print(d)  # Output: 7
```

- multiple assignment: assegnazione di più variabili in una sola riga

```python
a, b, c = 1, 2, 3
print(a)  # Output: 1
print(b)  # Output: 2
print(c)  # Output: 3
```

### Liste e tuple
#### Liste
- le liste sono collezioni ordinate e mutabili di elementi
- si definiscono con le parentesi quadre ``[]``
- possono contenere elementi di tipi diversi
- si possono modificare, aggiungere o rimuovere elementi

```python
my_list = [1, 2, 3, "hello", 4.5]
print(my_list)  # Output: [1, 2, 3, 'hello', 4.5]
my_list.append(6)  # aggiunge 6 alla fine della lista
print(my_list)  # Output: [1, 2, 3, 'hello, 4.5, 6]
my_list[0] = 10  # modifica il primo elemento
print(my_list)  # Output: [10, 2, 3, 'hello', 4.5, 6]
```

#### Tuple
- le tuple sono immutabili, quindi non si possono modificare dopo la creazione
- si definiscono con le parentesi tonde ``()``
- possono contenere elementi di tipi diversi

```python
my_tuple = (1, 2, 3, "hello", 4.5)
print(my_tuple)  # Output: (1, 2, 3, 'hello, 4.5)
print(my_tuple[0])  # Output: 1
```

#### Accesso agli elementi
- si accede agli elementi di liste e tuple tramite l'indice, che parte da 0
- si possono usare indici negativi per accedere agli elementi dalla fine

```python
my_list = [1, 2, 3, "hello", 4.5, 6]
my_tuple = (1, 2, 3, "hello", 4.5)
print(my_list[0])  # Output: 1
print(my_tuple[1])  # Output: 2
print(my_list[-1])  # Output: 6
print(my_tuple[-1])  # Output: 4.5
```

#### Slicing
- si può estrarre una sottosequenza di una lista o tupla usando lo slicing

```python
my_list = [1, 2, 3, 4, 5, 6]
my_tuple = (1, 2, 3, 4, 5, 6)
print(my_list[1:4])  # Output: [2, 3, 4]
print(my_tuple[1:4])  # Output: (2, 3, 4)
```

#### Metodi delle liste
- per aggiungere elementi alla fine della lista si usa il metodo ``append()``
- per aggiungere un elemento in una posizione specifica si usa il metodo ``insert()``
- per concatenare due liste si usa il metodo ``extend()`` o l'operatore ``+``
- per rimuovere un elemento si può usare il metodo ``remove()`` o la keyword ``del``
- per ribaltare una lista si usa il metodo ``reverse()``
- per ordinare una lista si usa il metodo ``sort()``
- per verificare se un elemento è presente in una lista si usa l'operatore ``in`` o ``not in``

### Dizionari
- i dizionari sono collezioni non ordinate di coppie chiave-valore con chiavi uniche
- si definiscono con le parentesi graffe ``{}``
- per rimuovere un elemento si usa la keyword ``del`` o il metodo ``pop()``
- per inserire o aggiornare un elemento si usa la sintassi ``dizionario[chiave] = valore``

### Operatori
- operatori aritmetici: ``+``, ``-``, ``*``, ``/``, ``//``, ``%``, ``**``
- operatori di confronto: ``==``, ``!=``, ``>``, ``<``, ``>=``
- operatori logici: ``and``, ``or``, ``not`` (precedenza ``not > and > or``)

### Stringhe
- le stringhe sono sequenze immutabili di caratteri
- si definiscono con virgolette singole ``'``, doppie ``"``
- per concatenare stringhe si usa l'operatore ``+``
- esistono molti metodi per manipolare le stringhe, come ``lower()``, ``upper()``, ``strip()``, ``replace()``, ``split()``, ``join()``

### Loop
- esiste il loop ``for`` per iterare su una sequenza (lista, tupla, stringa, range)

```python
for i in range(5):
	print(i)  # Output: 0 1 2 3 4

for item in [10, 20, 30]:
	print(item)  # Output: 10 20 30

for char in "hello": # char è il nome della variabile
	print(char)  # Output: h e l l o
```

### Importare moduli
- si possono importare moduli esterni con la keyword ``import`` (es. ``import math``)
- si possono importare solo alcune funzioni o classi da un modulo con la sintassi ``from modulo import funzione`` (es. ``from math import sqrt``) o ``import modulo.funzione`` (es. ``import math.sqrt``)
- si possono rinominare i moduli o le funzioni importate con la keyword ``as`` (es. ``import matplotlib.pyplot as plt``)

- è possibile importare script personalizzati creando un file ``.py`` e importandolo come modulo
- ad ogni importazione viene eseguito il codice del modulo
- per evitare che il codice venga eseguito all'importazione, si può usare la condizione ``if __name__ == "__main__":``

```python
# file: my_module.py
if __name__ == "__main__":
	print("This code runs only when the script is executed directly.")
else
	print("This code runs only when the script is imported as a module.")
```

```python
# file: main.py
import my_module  # stampa "This code runs only when the script is imported as a module."
```
