# Prgrammazione in C++
## Const vs Constexpr
`const` -> variabile costante che può essere inizializzata anche tempo di esecuzione, utile quando si conosce il valore da assegnare solo a tempo di esecuzione

`constexpr` -> variabile costante che viene inizializzata solo in fase di compilazione, ovvero il valore da assegnare deve essere conosciuto in fase di compilazione

In una classe, per dichiarare una variabile constexpr, bisogna attribuirle l'attributo static, in quanto una variabile-membro non statica viene creata solo quando viene istanziato un oggetto della classe, ovvero a tempo di esecuzione. Quindi `const int a = 0;` è accettato, ma per scrivere `constexpr int a = 0;` bisogna fare `static constexpr int a = 0;`
