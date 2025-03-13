# Go Lang - 

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
- package level -> lowercase variables declared in package level
- global scope -> uppercase variables declared in package level

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
| ``uint64`` | 0 | 4294967295 | 64 |

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
## 7. Arrays and Slices
## 8. Maps and Structs
## 9. If and Switch Statements
## 10. Looping
## 11. Defer, Panic, and Recover
## 12. Pointers
## 13. Functions
## 14. Interfaces
## 15. Goroutines
## 16. Channels
