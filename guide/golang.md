# Go Lang

## 1. Introduction
- video tutorial: [Learn Go Programming](https://www.youtube.com/watch?v=YS4e4q9oBaU)
- Inventors: Robert Griesemar, Rob Pike, Ken Thompson at Google
- Key features:
  - strong and statically typed (C++, Java)
  - simplicity
  - fast compile times
  - garbage collected
  - built-in concurrency
  - compile to standalone binaries
  - excellent community
- Documentation:
  - [main page - https://go.dev](https://go.dev)
  - [go tips - https://go.dev/doc/effective_go#](https://go.dev/doc/effective_go#)
  - [go doc - https://go.dev/doc/](https://go.dev/doc/)
  - [go stl - https://pkg.go.dev/std](https://pkg.go.dev/std)

## 2. Hello World
```go
package main

import {
	"fmt"
}

func main() {
	fmt.Println("Hello World")
}
```

| command | description |
| - | - |
| ``package main`` | statement package, every go application is structured into packages, main package is the entry point of any application |
| ``import ...`` | import libraries |
| ``fmt`` | formatt strings |
| ``func main()`` | main function |
| ``fmt.Println("...")`` | print to stdout |

## 3. Setting Up a Development Enviroment
### Go environment structure
A Go Enviroment directory has 3 main folders:
- ``src``: source code
- ``bin``: compiled files
- ``pkg``: precompiled files

### Go paths
``/usr/local/go`` is the main installation of Go, it has:
- ``src`` folder with the standard libraries
- ``bin`` folder with executables

``/etc/paths.d/go`` file with Golang environment variables stored

### Environment variables
``GOROOT``: directory where Go compiler and standard libraries are installed. It can generate configuration errors and it is unrecommended.
```bash
export GOROOT=/usr/local/go     # set GOROOT var
export PATH="$PATH:$GOROOT/bin" # add to PATH
```

``GOPATH``: user working directory, where external libraries are installed and where we put all the programs written in Go. It can store multiple paths, the first one is were external libraries are installed, the other ones store the user's program files.
```bash
export GOPATH=~/Documents/golib # set GOPATH (ext-lib)
export PATH="$PATH:$GOPATH/bin" # add to PATH
export GOPATH=$GOPATH:~/Documents/gocode # add projects path
```

### Go Commands
| command | description |
| - | - |
| ``go get custom-lib`` | install an external library, ex ``go get github.com/nsf/gocode`` |
| ``go run file-path`` | compile a file and all the dependencies |
| ``go build package-name`` | compile a package in the main directory |
| ``go install package-name`` | install package in the bin directory |

## 4. Variables
### Variable Declaration
```go
// 1. separate declaration and initialization
var i int
i = 42 // not needed

// 2. declaration and initialization
var j int = 43

// 3. shorter version as above
k := 44  // var k int = 44
l := 44. // var l float64 = 44.0
```

Variables can be declared inside functions with all 3 methods above, but when declared in package level (outside functions) you have to use only 1. or 2. method.

When there are multiple variables that need to be declared you can use a ``var`` block:
```go
var (
	name string = "Hello"
	num int = 23
	pi float64 = 3.14
)
```

You can't declare a variable that is not used inside program.

### Redeclaration and shadowing
It is possible to redeclare variables in different scopes. If a variable is declared at package level and it is redeclared inside a function, the second one shadows the first.

```go
var i int = 42

func main() {
	var i int = 43  // i shadows i declared in package level
}
```

### Visibility
Three levels of visibility:
- block scope -> variables declared inside functions
- package level -> if variable's name begins with lowercase letter
- global scope -> if variable's name begins with uppercase letter

### Naming conventions
- Use camelNotation
- One letter name for short life variables -> ``var i int``
- Longer name for normal variables -> ``var studentName string``
- Acronims in uppercase ``var theURL string``

### Type conversions
There is no implicit conversion between variables Every conversion must be explicit. Data loss can happens.

```go
// numbers conversion
var i int = 65
var j float32 = float32(i) // from int to float32
var k int = int(j)         // from float32 to int -> data loss

// string and numbers conversion
var l string = string(i)       // l = "A" -> ascii table
var m string = strconv.Itoa(i) // m = "65" -> import strconv package
```

## 5. Primitives
### Introduction
When not specified, integers are ``int``, floating point numbers are ``float64``, boolean are ``bool``.

Every variable is default initialised to ``false`` or ``0``.

### Boolean
```go
var l bool // default initialization to false
var m bool = true
var n bool = false
test := 1 == 2 // var test bool = false
```
| op | description |
| - | - |
| ``&&`` | logical and |
| ``\|\|`` | logical or |
| ``!`` | logical not |

### Int
| type | min | max | bit |
| - | - | - | - |
| ``int`` | 32 in 32bit computers | 64 in 64bits computers | 32/64 |
| ``int8`` | -128 | 127 | 8 |
| ``int16`` | -32768 | 32767 | 16 |
| ``int32`` | -2147483648 | 2147483647 | 32 |
| ``int64`` | -9223372036854775808 | 9223372036854775807 | 64 |
| ``uint8`` | 0 | 255 | 8 |
| ``uint16`` | 0 | 65535 | 16 |
| ``uint32`` | 0 | 4294967295 | 32 |
| ``uint64`` | 0 | 18446744073709551615 | 64 |

Casting between different types must be explicit.

| op | description |
| - | - |
| ``+`` | sum |
| ``-`` | subtraction |
| ``*`` | multiplication |
| ``/`` | integer division |
| ``%`` | module |
| ``==`` | equality |
| ``<``, ``<=`` | less than |
| ``>``, ``>=`` | greater than |
| ``&`` | bitwise and |
| ``\|`` | bitwise or |
| ``^`` | bitwise xor |
| ``&^`` | bitwise bit-clear / and-not |
| ``<<`` | left shift (*2) |
| ``>>`` | right shift (/2) |

### Floating point
| type | min | max | bit |
| - | - | - | - |
| ``float32`` | ±1.18E-38 | ±3.4E38 | 32 |
| ``float64`` | ±2.23E-308 | ±1.8E308 | 64 |

```go
var l float64 = 3.14 // decimal notation
var n float64 = 3e15 // exponential notation
var m float64 = 3E34 // exponential notation
var o float64 = 3.14e-23 // both
```

| op | description |
| - | - |
| ``+`` | sum |
| ``-`` | subtraction |
| ``*`` | multiplication |
| ``/`` | integer division |

### Complex numbers
| type | bit | composition | 
| - | - | - |
| ``complex64`` | 64 | ``float32`` + ``float32`` |
| ``complex128`` | 128 | ``float64`` + ``float64`` |

```go
var a complex64 = 2 + 1i  // simple initialization
b := 2 + 1.3i      // complex128 declaration
c := complex(3,12) // complex128 declaration
```

| op | description |
| - | - |
| ``+`` | sum |
| ``-`` | subtraction |
| ``*`` | multiplication |
| ``/`` | integer division |
| ``complex(r,i) | create complex |
| ``real(n)`` | real part |
| ``imag(n)`` | imaginary part |

### Text
| type | composition | 
| - | - |
| ``string`` | string in UTF-8 as an immutable "array" of ``byte`` |
| ``byte`` | single character in UFT-8, alias of ``uint8`` |
| ``rune`` | single character in UFT-8, alias of ``int32`` |

```go
// strings and byte
var str string = "normal string"
var a byte = str[4] // a = "a"
var b []byte = []byte(s) // conversion from string to array of byte

// strings, runes and int32
str := "a" // string
rn := 'a' // rune or int32
```

| op | description |
| - | - |
| ``+`` | string concatenation |
| ``[]byte(s)`` | convert into array of bytes |

## 6. Constants
### Naming conventions
```go
const constName type = value // typed constant
const constName = value // untyped constant
```

Constant names cannot begin with capital letters. Uppercase variables are exported in global scope.

Constants must be defined and initialized at compile time.

Constants can be shadowed like variables.

### Typed and untyped constants
When a constant is declared with a type, it has the same behaviour of a variable -> compiler gives errors if implicit cast oocurs.

When a constant is declared without a type, the compiler replace every occurrence of the constant with the corresponding value.

### Enumerated constants
```go
const (
	a1 = iota // a1 = 0
	b1 = iota // b1 = 1
	c1 = iota // c1 = 2
)

const (
	a2 = iota // set pattern
	b2 // b2 = iota
	c2 // c2 = iota
)
```

``iota`` is a counter, every time is used, it increments his value by 1. It is scoped inside a block: when it is reutilized in another block, it restarts from 0.

It is possible to set an initialization patter with the first initialization, inside a block, and the copiler automatically recognise the pattern

When we use constant variables as lables, the first label in the block is associated to 0, the default initalization value. For this reason uninitialized variables are always equals to the first label. To avoid this problem we use an ``errorLabel`` as the first label.

```go
const (
	errorLabel = iota
	label1
	label2
)

func main() {
	var a int      // a == errorLabel -> a = 0, errorLabel = 0
	var a int = label1 // a == label1 -> a = 1, label1 = 1
}
```

If we don't need the ``errorLabel``, it is possible to use ``_``, that represent an unused variable (variable that is only written one time and never used) and it is used for values that need to be captured but never used (example return values of function).
```go
const (
	_ = iota
	label1
	label2
)
```

### Enumerated expressions

It is possible to use operators in the initialisation (ex. sum or bit-shift), but we can't use functions because constant value must be defined at compile time.
```go
// start counter from another value
const (
	_ = iota + 5 // _ = 5
	label1  // label1 = 6
	label2  // label2 = 7
)

// use bit shift to get power of 2
const (
	_ = iota // ignore zero
	KB = 1 << (10 * iota) // KB = 2^10
	MB // MB = 2^20
	GB // GB = 2^30
)

// use bit shift to create a byte
const (
	isCat1 = 1 << iota
	isCat2
	canAct1
	canAct2
)

func main() {
	var role byte = isCat1 | canAct2 // byte role with isCat1, canAct2 labels
	isCat1 & role == isCat1 // check if isCat1 -> true
	canAct1 & role == canAct1 // check if canAct1 -> false
}
```

## 7. Arrays
- static array -> size need to be known at compile time
- Arrays are passed by value -> multiple assignments are independent

### Declaration
```go
vec := [size]type{values}
vec1 := [5]int{1,2,3,4,5}
vec2 := [...]int{6,7,8,9} // size is deduced by list initialisation
vec3 := [3]int // empty array
```

### Access
```go
vec[i] // access to the element with index i
vec1[2] = 42
vec1[1] = vec1[2] + 3
```

### Length of array
```go
len(vec1)
```

### Matrix
```go
var mat [3][3]int = [3][3]int{[3]int{1,0,0}, [3]int{0,1,0}, [3]int{0,0,1}}
```

### Copy of an array -> deep copy
```go
a := [...]int{1,2,3}
b := a // b is an independent copy of a
```

## 8. Slices
- dynamic array -> size can change
- they hide an underlying array
- Slices are passed by reference -> multiple assignments refer to the same underlying data

### Declaration
```go
vec := []type{values}
vec1 := []int{1,2,3,4,5}
vec2 := []int{6,7,8,9}
vec3 := []int // empty slice
```

### Access
```go
vec[i] // access to the element with index i
vec1[2] = 42
vec1[1] = vec1[2] + 3
```

### Length of slice - length of the slice
```go
len(vec1)
```

### Capacity - length of the underlying array
```go
cap(vec1)
```

### Copy (shallow copy)
```go
a := [...]int{1,2,3}
b := a // b points to the underlying array of a
```

### Operator ``[:]``
- all the subslices refer to the same underlying array
```go
a := []int{1,2,3,4,5,6,7,8,9,10}
b := a[:]   // copy all elements
c := a[3:]  // slice [4th element, last]
d := a[:6]  // slice [first, 7th element[
e := a[3:6] // slice [4th elm, 7th elm[
```
- slicing operations can also be used on arrays -> the array becomes the underlying array of the slicings and all the subslices refer to the same underlying array
```go
a := [...]int{1,2,3,4,5,6,7,8,9,10}
b := a[:]   // copy all elements
c := a[ ...
```

### Make declaration
```go
a := make(type, size, capacity)
a := make([]int, 3)
a := make([]int,3,6)

```

### Append (may cause copy operations to increase underlying array size)
```go
a = append(a, 1) // add value 1 to the slice
a = append(a,1,2,3,4) // add values 1,2,3,4 to the slice
a = append(a, []int{1,2,3}...) // spread slice in values and concatenates two slices
```

### Remove
```go
b = a[1:] // removes the first element
b = a[:len(a)-1] // removes the last element
b = append(a[:2],a[3:]...) // removes the 4th element
```

## 9. Maps
- Collection of value types that are accessed via keys.
- Map is unordered -> when printed or modified, the content can change order.
- Map is passed by reference -> multiple assignments refer to the same underlying data

### Declaration
```go
data := map[keytype]valuetype{ key : value} // keytype can be everything except slices
data := map[string]int{
	"key1": 123,
	"key2": 234,
	"key3": 345
}
data := make(map[string]int) // create empty map
```

### Access
```go
data[key1] // access to the value associated to key key1
data[key1] = 456 // modify the value associated to key1

```

### Deletion of a key:value
```go
delete(data,key1) // delete key1:value entry
```

### Check presence of a key
```go
// pop <- corresponding value, pop <- 0 if key is not present,
// ok <- true if key is inside map, ok <- false if it is not present
pop, ok := data[key4] 
_, ok := data[key4] // only test presence without saving the value
```
### length
```go
len(data) // number of entry inside map
```

## 10. Structs
- Collection of disparate data types that describe a single concept
- Naming conventions follow the normal variables
- Structs are passed by value -> multiple assignments are independent

### Definition
```go
type StructName struct {
	members
}

type person struct {
	name string
	age int
}

```

### Creation of a struct variable
```go
p1 := person{ // field name sintax -> field order is not important
	age: 34
	name: "Pinco",
}

p2 := person{ // position sintax -> problem if struct order changes
	"Pallino",
	45
}
```

### Access to a single member 
```go
p1.name // access to the name field of struct p1
p2.age // access to the age field of struct p2
```

### Anonimous struct -> short life structs
```go
p3 := struct{name string, age int}{name: "Tizio", age: 23}
```

### Struct embedding
- embedding implements the paradigm "has a"
- structs don't have inheritance (no paradigm "is a")
```go
type A struct {
	num1 int
}

type B struct {
	A // embed struct A
	num2 int
}

B.num1 // access to the num1 field of struct A embedded inside B
B.num2 // access to the num2 field of struct B

b := B {
	A : A{num1: 12} // set num1 -> num1:12 is not valid
	num2: 23
}
```

### Struct tags
- give a short description or message to a specific field
```go
type A struct {
	num1 int `required max:"100"`
	num2 int
}

// show tags (import reflect)
t := reflect.TypeOf(A{})
field, _ := t.FiedlByName("num1")
field.Tag // get the tag of num1 field
```

## 11. If and Switch Statements
## 12. Looping
## 13. Defer, Panic, and Recover
## 14. Pointers
## 15. Functions
## 16. Interfaces
## 17. Goroutines
## 18. Channels
