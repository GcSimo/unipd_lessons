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

Casting/conversion between different types must be explicit.

| op | description |
| - | - |
| ``+`` | sum |
| ``-`` | subtraction |
| ``*`` | multiplication |
| ``/`` | integer division |
| ``%`` | module |
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
### If
```go
// classic if statement
if condition {
	// ... code executed if condition == true ...
}

// if statement with initializer (ex. with maps)
if pop, ok := data[key3]; ok {
	// ... code executed if ok == true ...
	// pop can be accessed inside the if block
}
```

### If - else
```go
// classic if statement
if condition1 {
	// ... code executed if condition == true ...
} else {
	// ... code executed if condition == false ...
}
```

### If - else if
```go
// classic if statement
if condition1 {
	// ... code executed if condition1 == true ...
} else if condition2 {
	// ... code executed if condition1 == false and condition2 == true ...
} else {
	// ... code executed if both condition1 and condition2 == false ...
}
```
### Operators
| operator | description |
| - | - |
| ``==`` | equality |
| ``!=`` | inequality |
| ``<``, ``<=`` | less than |
| ``>``, ``>=`` | greater than |
| ``&&`` | logical and |
| ``\|\|`` | logical or |
| ``!`` | logical not |

Evaluation of logical expressions uses shortcircuiting:
- if the first operand of ``&&`` is false, the second operand is not evaluated
- if the first operand of ``\|\|`` is true, the second operand is not evaluated

### Comparisons with floating point numbers
```go
if num1 == math.Pow(math.Sqrt(num1)) { ... } // errors may occurs
if math.Abs ( num1 / math.Pow(math.Sqrt(num1)) - 1) < 1e-14 { ... } // introducing error
```

### Switch
```go
// normal switch statement
switch variable {
	case 1:
		// ... code executed if variable == 1 ...
	case 2:
		// ... code executed if variable == 2 ...
	case 3:
		// ... code executed if variable == 3 ...
	case 4,5,6:
		// ... code executed if variable == 4 or 5 or 6 ...
	default:
		// ... code executed in all the other cases ...
}
```

### Switch with initializer
```go
// switch statement with initializer
switch i := 1 + 2; i {
	case 1:
		// ... code executed if i == 1 ...
	case 2:
		// ... code executed if i == 2 ...
	default:
		// ... code executed in all the other cases ...
}
```

### Switch tagless
```go
// switch with tagless sinstax -> like if - else if - else
switch {
	case i <= 10:
		// ... code executed if i <= 10 ...
	case i <= 20 :
		// ... code executed if i <= 20 ...
	default:
		// ... code executed in all the other cases ...
}
```

### Fall through
```go
switch {
	case i <= 10:
		// ... code executed if i <= 10 ...
		fallthrough // execute also the next case without evaluating the condition 
	case i >= 20 :
		// ... code executed if i <= 10 or if >= 20 ...
	default:
		// ... code executed in all the other cases ...
}
```

### Type switches
```go
var i interface{} = variableToEvaluate
switch i.(type) {
	case int:
		// ... code executed if i is an int ...
	case float64 :
		// ... code executed if i is a float64 ...
	case string :
		// ... code executed if i is a string ...
	default:
		// ... code executed in all the other cases ...
}
```

### Break keyword
Cause the termination of the block in execution and skip all the instructions in the block after the ``break`` instruction.

## 12. Looping - For statement
### Simple loops
```go
// simple loop
for counter initialisarion; condition; incrementer {
	// ... code executed while condition == true ...
}

for i := 0; i < 5; i++ {
	// ... code executed for 5 times ...
}

// for with two counters
// note that ++ is a statement, not an operator, so i++, j++ is an error
for i,j := 0; i < 5; i,j = i+1, j+2 { ... }

// for with counter already defined
for ; i < 5; i++ { ... }

// for with increment inside for and counter already defined
for i < 5 {
	// ... code ...
	i++
}
```

### Exiting early - break
- loop with undetermined iteration number -> implements while and do-while 
```go
for  { 
	// ... code ...
	if exit_condition {
		break
	}
}
```

### Skip iteration - continue
- skip an iteration of the loop
```go
for ... { 
	if skip_condition {
		continue
	}
	// ... code ...
}
```

### Loop labels and break nested loop
- if you need to break multiple nested loop -> the label indicates where we want to break out to
```go
Loop:
	for  { 
		for  { 
			// ... code ...
			if exit_condition {
				break Loop
			}
		}
	}
```

### Looping through collections - for range loop
```go
// loop range with key and value
for k,v := range []int{1,2,3} {
	// k is the index, v is the value
	// ... code executed for every element in the slice/array/maps/strings ...
}

// loop range with only key
for k := range s { ... }

// loop range with only value
for _,v := range s { ... }
```

## 13. Defer, Panic, and Recover
### Defer
Execute every function associated with ``defer`` keyword after the function finished its final statement, but before it returns.
```go
func main() {
	fmt.Println("start")
	defer fmt.Println("middle")
	fmt.Println("end")
}

/*
 * Output:
 * start
 * end
 * middle
*/
```

Defer statements are executed in LIFO order: we often use ``defer``  to close resources, so it is normal to close them in the reverse order we use them.

```go
func main() {
	resource1.open()
	defer resouce1.close()
	resource2.open()
	defer resouce2.close()
}

/*
 * Output:
 * open resource1
 * open resource2
 * close resource1
 * close resource2
*/
```

The defer function takes the arguments at the time the defer is called:
```go
func main() {
	a := "start"
	defer fmt.Println(a)
	a = "end"
}

/*
 * Output:
 * start
*/
```

### Panic
There are no exceptions in Go.

```go
func main() {
	a, b := 1, 0
	ans := a / b
	fmt.Println(ans)
}

/*
 * Output:
 * panic: runtime error: integer divided by zero
 * ... stacktrace of the error ...
*/
```

It is possible to use the ``panic()`` function to "throw an exception" with a custom message to print out. It is used inside if statements to check whether a variable has a valid status.

```go
func main() {
	fmt.Println("start")
	panic("something bad happened")
	fmt.Println("end")
}

/*
 * Output:
 * start
 * panic: something bad happend
 * ... stacktrace of the error ...
*/
```

Panic happens after deferd statements are executed. It is possible to close resources before the panic is executed.
```go
func main() {
	fmt.Println("start")
	defer fmt.Println("deferred")
	panic("something bad happened")
	fmt.Println("end")
}

/*
 * Output:
 * start
 * deferred
 * panic: something bad happened
 * ... stack trace of the error ...
*/
```

### Recover
It is possible to manage a panic programs using a defer function that catch the panic with ``recover()`` statement. If you call a panic and then a recover inside a function, statemets after panic are not executed, but the program doesn't stop and continue.

```go
func main() {
	fmt.Println("start")
	panicker()
	fmt.Println("end")
}

func panicker() {
	fmt.Println("about to panic")
	defer func() { // anonymous function to handle the panic
		if err := recover(); err != nil {
			log.Println("error: ", err)
		}
	}()
	panic("somenthing bad happened")
}

/*
 * Output:
 * start                          -> main
 * about to panic                 -> panicker
 * Error: something bad happened  -> anonymous function - handler
 * end                            -> main
*/
```

If it's not possible to manage the panic, you can call another panic inside the handler

```go
func main() {
	fmt.Println("start")
	panicker()
	fmt.Println("end")
}

func panicker() {
	fmt.Println("about to panic")
	defer func() { // anonymous function to handle the panic
		if err := recover(); err != nil {
			log.Println("error: ", err)
			panic(err) // recall of panic inside handler
		}
	}()
	panic("somenthing bad happened")
}

/*
 * Output:
 * start                          -> main
 * about to panic                 -> panicker
 * Error: something bad happened  -> anonymous function - handler
 * panic: something bad happened (recovered)
 *     panic: something bad happened 
 * ... stack trace ...
*/
```

## 14. Pointers
### Declaration
```go
var a int = 42 // variable a di tipo int
var b *int = &a // puntatore di tipo int alla variabile a

a := 27 // as above
b := &a // as above
```

### Reference and dereference operators
- ``*`` - dereference op: returns the value saved in the memory address contained in the pointer variable
- ``&`` - reference op: returns the memory address of a variable

### Pointers arithmetic
Go doesn't have pointer arithmetic, but there is the ``unsafe`` package that implements that. It is not recommended to use the ``usafe`` package, but if you really need pointers arithmetic, you can use that.

### ``nil``
An initialized pointer is initialised by default to ``nil``. It is an invalid address.

### Pointers, structs and ``new``
```go
// declaration of pointers to structs
var ms *myStruct         // uninitialized pointer -> nil
ms := &myStruct{}        // pointer to an uninitialized struct
ms := &myStruct{foo: 42} // pointer to an initialized struct
ms := new(myStruct)      // pointer to an uninitialized struct with new
// it's not possible to create a pointer to an initialized struct with new

// use fields of a pointed struct
(*ms).foo = 42 // access to the foo field
ms.foo = 42    // equivalent, less verbose

// struct definition
type myStruct struct {
	foo int
}
```

### Underlying data -> slices, maps and arrays
Slices and maps contain a pointer to an underlying array. Copy of slices and maps use the same undelying array.

## 15. Functions
### Syntax
```go
// normal function syntax in go
func function_name(parameter_name parameter_type, ...) return_type {
	// ... code inside function ...
}

// function with comma delimited list of parameters
func function_name(par1, par2 int) { // equivalent to ...(par1 int, par2 int)
	// ... code inside function ...
}
```

``function_name`` works similar to variables: uppercase -> global, lowercase -> local, ...

### Pass by value - pass by pointer
```go
// pass by value
func fx1(par1 int) { /* ... */ }

// pass by pointer
func fx2(par1 *int) { /* ... */ }

// function call
a := 23
fx1(a)   // call a function with pass by value
fx2(&a) // call a function with pass by pointer
```

By default, variables are passed by value. Variables with pointers to underlying data (slices or maps) are passed by value, but they share the same underlying data (passed by pointer).

### Variatic parameters
It is possible to wrap a list of parameters of the same type into a slice. The variatic parameters can only be used once per function and always at the end.

```go
func main() {
	sum("sum:",1,2,3,4,5)
}

func sum(msg string, values ...int) { // values are wrapped in value []int
	// ... code ...
}
```

### Return value
The return type is specified after the parameters and is returned with the keyword ``return`` at the end of the function. The return value is captured with an assignment in the caller function.

```go
func main() {
	s := sum("sum:",1,2,3,4,5)
}

func sum(msg string, values ...int) int { // values are wrapped in value []int
	// ... code ...
	return sum
}
```

It is possible to return a pointer to a local variable. The compiler recognises it and auto-allocate the variable in heap rather than in the local stack.

```go
func sum(msg string, values ...int) *int {
	var sum int
	// ... code ...
	return &sum
}
```

It is possible use a named return value. The returned variable is declared with its type in the function header and is returned automatically. It's not really used.

```go
func sum(msg string, values ...int) (sum int) {
	// ... code ...
	return // sum -> implicit
}
```

### Managing errors - multiple return values
To inform the caller function that an error has occured during the called function execution, it is possible to return an extra value as an error.

```go
func main() {
	d, err := div(5.0, 0.0)
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println(d)
}

func div(a, b float) (int, error) {
	if b == 0.0 {
		return 0.0, fmt.Errorf("Error: can't divide by zero")
	}
	return a / b, nil
}
```

### Anonymous functions
Anonymous functions are function without names that can only be used one time and is declared inside another function.
- Declared anonymous functions can be used only after their declaration.
- It is suggested to pass parameters from the outer scope and not use them directly, because the function can be executed asynchronously and can generate unexepected behaviour.

```go
func main() {
	// anonimous function declared as a variable
	f := func(parameters_declaration) { // var f func() = ...
		// ... code ...
	}

	f(arguments_passed) // invocation of anonymous function

	// anonymous function declaration and invocation
	func(parameters_declaration) {
		// ... code ...
	}(arguments_passed) // parenthesis specify to execute the anonimous function
}
```

### Methods
Methods are functions associated with structs (or other types -> unknown contex) and they are called from structs (or other types -> unknown contex).

```go
func main() {
	number := num{23}
	number.print()
}

type num struct {
	n int
}

func (n num) print() {
	fmt.Println(n)
}
```

Methods operate with copy of the objects, so modifications inside the method don't affect the object in the main object. To manipulate the objects, pointes must be used.

```go
func (n num) print() { // operates with copy
	fmt.Println(n)
}

func (n *num) incr() { // operates with pointers
	n++
}
```

## 16. Interfaces
### Basis
Interfaces are specific types that describe behaviours (methods) that other structs will implicitly implement.

```go
// defining interface
type Writer interface {
	Write([]byte) (int, error)
}

// defining a struct that implicitly implements interface
type ConsoleWriter struct { }
func (cw ConsoleWriter) Write(data []byte) (int, error) {
	// ... code to convert a byte slice in a integer ...
}

func main() {
	var w Writer = ConsoleWriter{} // create a Writer 
	w.Write([]byte("..."))
}
```
### Implicit implementation
Interface and corresponding structs are completely indipendent. You can create an interface and some structs that (implicitly) implement that or create/import structs and create an interface with common methods to all those structs.

### Naming convention
Interfaces with one method are named as the method + er (example Writer interface has a method Write, Drawer interface has a method Draw). Interfaces with more than one method should be named for what they do.

### Embedding interfaces
It is possible to embed multiple interfaces altogether in a new interface.

```go
type Writer interface {
	Write([]byte) (int, error)
}

type Closer interface {
	Close() error
}

type WriterCloser interface {
	Writer // embed Writer interface
	Closer // embed Closer interface
}

// equivalent to:
type WriterCloser interface {
	Write([]byte) (int, error) // from Writer
	Close() error // from Closer
}
```

### Polymorphis and interface casting/conversion
Interfaces are the basis of polymorphism: an interface variable can be from different types of structs that have the same methods of the interface.

It is possible to make casting between different interfaces and structs that implement the same methods.

```go
// WriterCloser interface
type WriterCloser interface {
	Write([]byte) (int, error) // from Writer
	Close() error // from Closer
}

// BufferedWriterCloser struct
type BufferedWriterCloser struct {}
func(bwc *BufferedWriterCloser) Write([]byte) (int, error) { ... }
func(bwc *BufferedWriterCloser) Close() error { ... }
func(bwc *BufferedWriterCloser) NewBufferedWriterCloser() *BufferedWriterCloser { ... } // for initialization

func main() {
	var wc WriterCloser = NewBufferedWriterCloser()
	bwc := wc.(*BufferedWriterCloser) // cast to BufferedWriterCloser
}
```

If it's not possible to cast an interface to something else (example the new interface/struct requires other methods), the program get panicked. To "safe" cast without getting panicked it is used another variable to save the casting status.

```go
r, ok := wc.(io.Reader) // ioReader requires Read method
if ok {
	// conversion succeded
} else {
	// conversion failed
}
```

### Empty interface and casting
It is possible to create an empty interface without any method that can save any interface/struct, but can be casted only in specific interfaces. Empty interfaces are usually used as intermediate step.

```go
var myObj interface{} = NewBufferedWriterCloser()
if wc,ok := myObj.(WriterCloser); ok {
	// myObj is been converted successfully to a WriterCloser
} else {
	// conversion failed
}
if r,ok := myObj.(io.Reader); ok {
	// myObj is been converted successfully to a WriterCloser
} else {
	// conversion failed
}
```

It is possible to use a type switch to check the corresponding type of an empty interface..
```go
var i interface{} = myObj
switch i.(type) {
	case int:
		// ... code executed if i is an int ...
	case string :
		// ... code executed if i is a string ...
	default:
		// ... code executed in all the other cases ...
}
```

### Pointers and interface method set
When we assign methods to types, every type has its own method set:
- when we work directly with structs, the method set consists of all methods regardless of their receiver type
- when we work with interfaces the method set consists of all methods that have the same receiver type as the concrete object used to initialize the interface

More specifically:
- when you use a value type to implement an interface, all the methods must have a value receiver type; a method set for a value type interface has only value receiver types
- when you use a pointer type to implement an interface, the methods can have both pointer or value receiver type; a method set for a pointer type interface can have both pointer or value receiver types

```go
// two methods with different receiver types, but from the same method set
type myStruct struct {}
func (gs myStruct) print() {...}
func (gs *myStruct) increment() {...}

// method set contains only methods with same receiver type
type PrinterIncrementer interface {
	print()     // -> func (t type) print {...}
	increment() // -> func (t type) increment {...}
}

// example1 -> concrete object type is myStruct1 -> receiver type must be myStruct1
var i PrinterIncrementer{} = myStruct1{}
func (gs myStruct1) print() {...} // is part of the interface
func (gs myStruct1) increment() {...} // is part of the interface
func (gs *myStruct1) increment() {...} // is not part of the interface

// example2 -> concrete object type is *myStruct1 -> receiver type must be *myStruct1
var i PrinterIncrementer{} = &myStruct1{}
func (gs *myStruct1) print() {...} // is part of the interface
func (gs *myStruct1) increment() {...} // is part of the interface
func (gs myStruct1) increment() {...} // is not part of the interface

// casting1 -> illegal -> myStruct has methods with both pointers and values as receiver type, but only values are accepted
var i PrinterIncrementer{} = myStruct{}

// casting2 -> ok -> receiver type is a pointer and methods can have both pointer or value receiver type
var i PrinterIncrementer{} = &myStruct{} 
```
### Best practices with interfaces
- use many, small interfaces, rather than monolithic one, examples from packages:
  - io.Writer (1 method)
  - io.Reader (1 method)
  - interface{} (0 methods)
- don't export interfaces for types that will be used by others, export only the concrete types (struct): if the user needs an interface, he will create the one he needs
- do export interfaces for types that will be used by package
- design functinos and methods to receive interfaces whenever possible: if you don't need to access to the undelying data, use value receiver rather than pointers

## 17. Goroutines
### Creating goroutines

```go
func main() {
	go fx1()
}

func func1() {
	fmt.Println("func1")
	//time.Sleep(100 * time.Millisecond)
}
```

The ``go`` keyword tell go runtime to spin off a green thread and run that function in the green thread. The ``main`` function is a go-routine as well, so the program abobe does not print anything because the ``main`` function (and the program itself) terminates before the ``func1`` function prints out the message. To print the message, you have to delay the main end with a statement ``time.Sleep(100*time.Millisecond)`` (only for demo purpose, not recommanded for managing concurrence). The runtime prefers executing the main function intead givin power to the other goroutines.

### Green Threads vs OS Threads
Normally threads are derived from OS-threads, so they have individual function call stack and 1 MB of RAM dedicated. Creation and destruction of those is very expensive. In Go, the runtime has a scheduler that alternates the execution of various go-routines over the same thread creating a "virtual thread" called green thread. With this high level abstraction, go routines can start with a very small stack spaces and they are very cheap to create and destroy. It is possible to run 100.000 threads over the same runtime in Go and it is impossible to do the same in another "unoptimized" programming language.

### Closures and race condition in anonymous functions
```go
func main() {
	msg := "Message"
	go func() {
		fmt.Println(msg)
	}()
	time.Sleep(100 * time.Millisecond)
}
```
The program above prints the correct message, despite the fact that the ``main`` and the anonymous function have different execution stacks. This works because the anonymous function can access to the outer scope and the go runtime understand that ``msg`` variable is declared in the ``main`` and used in the anonymous function. 
The problem is that both threads use the same variable and create a race condition. The solution for this problem is to pass the ``msg`` by value to the anonymous function as a parameter.

Always pass by value all data nedeed to go routines.
```go
func main() {
	msg := "Message"
	go func(msg string) {
		fmt.Println(msg)
	}(msg)
	time.Sleep(100 * time.Millisecond)
}
```

### WaitGroup
WaitGroups are tools in go that help synchronise multiple programms. They are implemented as a conter that is incremented when a new process starts and is decremented when a process end. It is useful to pause the execution of a process to wait until all the other processes end their execution.

Waitgroup is designed to be global scoped and shared amongs parallel functions. It is build to prevent race condition on itself.

```go
var wg = sync.WaitGroup{} // declaring new waitgroup
wg.Add(n) // incremet process counter by n process
wg.Done() // decrement the counter by 1 process
wg.Wait() // wait untile the counter is 0 (when all the the processes terminate)
```

```go
var wg = sync.WaitGroup{} // declaring new waitgroup

func main() {
	msg := "Message"
	wg.Add(1) // incremet process counter by 1 process
	go func(msg string) {
		fmt.Println(msg)
		wg.Done() // decrement the counter by 1 process
	}(msg)
	wg.Wait() // wait all the processes to terminate
}
```

### Mutexes
```go
var wg = sync.WaitGroup{} // delay the main to terminate
var counter = 0           // global counter, shared by all goroutines

func main() {
	for i := 0; i < 10; i++ {
		wg.Add(2) // add 2 new processes
		go sayHello()
		go increment()
	}
	wg.Wait() // wait until all 20 goroutines end
}

func sayHello() {
	fmt.Printf("Hello #%v\n", counter)
	wg.Done()
}

func increment() {
	counter++
	wg.Done()
}
```

### Parallelism
### Best Practices

## 18. Channels
