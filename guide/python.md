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

## Struttura del codice
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

## Programmazione orientata agli oggetti (OOP) in Python
La programmazione orientata agli oggetti (OOP) è un paradigma di programmazione che utilizza "oggetti" con attributi e metodi per modellare concetti del mondo reale. È costituita da:
- classi: modelli definiti dall'utente che rappresentano un tipo di oggetto
- oggetti: istanze di una classe
- attributi: variabili o proprietà associate ad un oggetto
- metodi: funzioni associate ad un oggetto che descrivono il comportamento dell'oggetto

### Definizione di una classe
```python
# definizione della classe Student
class Student:
    school_name = "Unipd" # attributo di classe

	# costruttore
    def __init__(self, name, surname, id, degree):
		# attributi dell'istanza con inizializzazione
        self.name = name
		self.surname = surname
		self.id = id
		self.degree = degree

	# metodo della classe
    def __str__(self):
        return f"Hello, my name is {self.name} {self.surname} and I study {self.degree}."
```

**Costruttore**:
- il metodo ``__init__(self, ...)`` è il costruttore della classe, viene chiamato automaticamente quando si crea un oggetto della classe
- se non viene definito un costruttore, Python ne crea uno di default che non accetta parametri

**Attributi dell'istanza e della classe**:
- gli attributi dell'oggetto vengono definiti all'interno del metodo ``__init__`` usando la sintassi ``self.attributo = valore`` e sono specifici per ogni istanza della classe
- gli attributi condivisi tra tutte le istanze della classe si definiscono come variabili di classe
- gli attributi dell'oggetto sono salvati in un dizionario accessibile tramite ``self.__dict__`` e possono essere aggiunti, modificati o rimossi dinamicamente accedendo a tale dizionario, in particolare è possible fare in modo che sia l'utente a decidere gli attributi dell'istanza passando un numero variabile di argomenti al costruttore tramite ``**kwargs``

```python
# costruttore che accetta attributi dinamici
def __init__(self, **kwargs):
	self.__dict__.update(**kwargs)

# Aggiunge un nuovo attributo dinamicamente
self.__dict__['new_attribute'] = value 

# Rimuove un attributo esistente
del self.__dict__['existing_attribute']
```

**Metodi della classe**:
- i metodi della classe devono avere come primo parametro ``self``, che rappresenta l'istanza dell'oggetto, passato implicitamente al metodo quando viene chiamato

**Stampa di un oggetto**:
- quando si stampa un oggetto, viene mandato in output l'indirizzo di memoria dell'oggetto
- per stampare una rappresentazione più significativa dell'oggetto, è necessario effettuare l'override del metodo ``__str__(self)``

**Override degli operatori**
- è possibile definire il comportamento degli operatori per gli oggetti di una classe sovrascrivendo i metodi speciali come ``__add__(self,y)``, ``__sub__(self,y)``, ``__mul__(self,y)``, ... (vedi tabella sotto)

| Metodo                      | Sintassi       | Descrizione                                                             |
| --------------------------- | -------------- | ----------------------------------------------------------------------- |
| ``__add__(self, y)``        | ``x + y``      | Somma di due oggetti. Il tipo di ``x`` determina quale operatore usare. |
| ``__contains__(self, y)``   | ``y in x``     | Verifica se ``y`` è contenuto in ``x`` (collezione).                    |
| ``__eq__(self, y)``         | ``x == y``     | Restituisce ``True`` o ``False`` a seconda dei valori di ``x`` e ``y``. |
| ``__ge__(self, y)``         | ``x >= y``     | Idem sopra, per maggiore o uguale.                                      |
| ``__getitem__(self, y)``    | ``x[y]``       | Restituisce l'elemento alla posizione ``y`` in ``x``.                   |
| ``__gt__(self, y)``         | ``x > y``      | Ritorna ``True`` o ``False`` a seconda dei valori.                      |
| ``__hash__(self)``          | ``hash(x)``    | Restituisce un valore hash intero per ``x``.                            |
| ``__int__(self)``           | ``int(x)``     | Restituisce una rappresentazione intera di ``x``.                       |
| ``__del__(self)``           | ``del x``      | Eseguito quando un'istanza viene cancellata dalla memoria.              |
| ``__iter__(self)``          | ``for v in x`` | Restituisce un oggetto iteratore per ``x``.                             |
| ``__le__(self, y)``         | ``x <= y``     | Confronto "minore o uguale a".                                          |
| ``__len__(self)``           | ``len(x)``     | Restituisce la dimensione (lunghezza) di ``x``.                         |
| ``__lt__(self, y)``         | ``x < y``      | Confronto "minore di".                                                  |
| ``__mod__(self, y)``        | ``x % y``      | Ritorna il resto della divisione tra ``x`` e ``y``.                     |
| ``__mul__(self, y)``        | ``x * y``      | Prodotto tra ``x`` e ``y``.                                             |
| ``__ne__(self, y)``         | ``x != y``     | Confronto "diverso da".                                                 |
| ``__neg__(self)``           | ``-x``         | Restituisce la negazione unaria di ``x``.                               |
| ``__repr__(self)``          | ``repr(x)``    | Ritorna una stringa adatta a essere interpretata da ``eval()``.         |
| ``__setitem__(self, i, y)`` | ``x[i] = y``   | Imposta il valore ``y`` nella posizione ``i`` di ``x``.                 |
| ``__str__(self)``           | ``str(x)``     | Ritorna una rappresentazione leggibile dell’oggetto ``x``.              |
| ``__sub__(self, y)``        | ``x - y``      | Differenza tra due oggetti.                                             |

**Empty class**
- per creare una classe vuota si può usare la keyword ``pass``

```python
class EmptyClass:
	pass
```

### Creazione di un oggetto
Per creare un oggetto a partire da una classe si utilizza la sintassi `nome_oggetto = NomeClasse(parametri)`. Gli attributi possono essere accessibili tramite la notazione punto.

```python
student1 = Student("Mario", "Rossi", 12345, "Informatica")
print(student1)  # Output: Hello, my name is Mario Rossi and I study Informatica.
print(student1.name)  # Output: Mario
print(student1.school_name)  # Output: Unipd
```

**Copia di oggetti**:
- gli oggetti sono assegnati per riferimento, quindi se si assegna un oggetto ad una nuova variabile, entrambe le variabili punteranno allo stesso oggetto in memoria
- per creare una copia indipendente di un oggetto, è necessario utilizzare il modulo `copy`, che fornisce due metodi per copiare oggetti:
  - shallow copy: crea un nuovo oggetto, ma gli attributi che sono oggetti vengono copiati per riferimento
  - deep copy: crea un nuovo oggetto e copia ricorsivamente tutti gli oggetti contenuti

```python
import copy
student2 = student1  # riferimento allo stesso oggetto
student3 = copy.copy(student1)  # shallow copy
student4 = copy.deepcopy(student1)  # deep copy
```

### Polimorfismo
- il polimorfismo permette di invocare con lo stesso nome, due metodi diversi ottenere comportamenti differenti in base all'oggetto che li invoca

```python
class Dog:
	def speak(self):
		return "Woof!"

class Cat:
	def speak(self):
		return "Meow!"

def main():
	my_pets = [Dog(), Cat()]
	for pet in my_pets:
		print(pet.speak())

if __name__ == "__main__":
	main()
```

### Ereditarietà
- l'ereditarietà permette di creare una nuova classe (classe derivata) che eredita attributi e metodi da una classe esistente (classe base)
- per accedere ai metodi e attributi della classe base si usa la funzione ``super()``
- è possibile sovrascrivere (override) i metodi della classe base nella classe derivata per fornire un comportamento specifico

```python
class Person:
	def __init__(self, name, age):
		self.name = name
		self.age = age

	def introduce(self):
		return f"My name is {self.name} and I am {self.age} years old."

class Employee(Person):
	def __init__(self, name, age, job):
		super().__init__(name, age)
		self.job = job

	def introduce(self):
		return f"My name is {self.name}, I am {self.age} years old and my job is {self.job}."

person = Person("Bob", 25)
print(person.introduce())  # Output: My name is Bob and I am 25 years old.
employee = Employee("Alice", 30, "Engineer")
print(employee.introduce())  # Output: My name is Alice, I am 30 years old and my job is Engineer.
```
