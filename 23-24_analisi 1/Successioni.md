# Successioni

## Convergenza con sottosuccessioni
Una successione ha come limite l (R +-infty), se ogni sottosuccessione ha come limite l (R +-infty)

Una successione è irregolare (non ha limite), se esistono due sottosuccessioni che hanno limite diverso

## Teorema ponte
Il limite per x0 di una funzione vale l (R, +-infty) se e solo se per ogni successione, il limite della successione vale x0 e limite di f(an) è l

Se esistono due successioni an, bn per cui il limite di f(an) e quello di f(bn) sono diversi, allora non esiste il limite per f(x0)

# Serie

<!-- comportmento e conv -->
## Comportamento primi termini
Il comportamento di una serie non dipende dai primi termini

## Cond. nec. per cv (lim ak = 0)
Una serie è convergente se l'ultimo elemento è 0 (lim_{k->inf} ak = 0)

## Cond. suff. per cv (cv ass)
Sia una serie Sa, se S|ak| converge, allora la serie converge assolutamente
Se una serie converge assolutamente, converge anche semplicemente

<!-- esempi di serie -->
## Serie geometrica
sommatoria di r^k
se r < 1 -> convergente a 1 / (1- r)
se r >= 1 -> divergente a +inf

## Serie armonica generalizzata
S(1/k^a):
- per a > 1 CV
- per a <= 1 div +inf

S(1 / k^a * (logk)^b)
- per a > 1 cv
- per a < 1 div +inf
- per a = 1, b > 1 cv 
- per a = 1, b <= 1 div +inf

## Serie esponenziale
S(x^k / k!) con parametro x in R
- per x > 0 -> elementi positivi
- per x < 0 -> segni alterni
- per x = 0 -> forma 0^0, da definire
La serie è assolutamente convergente e uguale a e^x

## Serie a segno alterno
S((-1)^k * ak) con ak > 0
- per k pari -> positivo
- per k dispari -> negativo

### Criterio di Leibniz
Se lim ak = 0 (cond. necess.) e ak def.nte decrescente, la serie è convergente

<!-- serie a termini pos -->
## Serie a termini positivi (conv o div +inf)
Una serie è a termini positivi se ogni termine è >= 0
Una serie a termini postivi converge o doverge a +inf

### Confronto (ak < bk)
Siano Sa, Sb serie a termini positivi, se ak < bk def.nte, allora:
- se Sb converge, converge anche Sa
- se Sa diverge, diverge anche Sb

### Confronto asintotico (ak/bk)
Siano Sa, Sb serie a termini positivi, e lim ak/bk = l, allora:
- se l = R\0, sono asintotiche: se una cv, l'altra cv, se una div, l'altra div
- se l = 0, allora ak << bk, allora se Sb converge, converge anche Sa
- se l = +inf, allora ak >> bk, allora se Sb diverge, allora diverge anche Sa

### Criterio condensazione
Sia Sa serie a term. pos. e ak successione decrescente, allora S(ak) e S(2^k * a_{2^k}) hanno lo stesso comportamento

### Rapporto
termini strettamente positivi
- Se a(k+1) / a(k) < 1 def.nte, la serie converge
- Se a(k+1) / a(k) >= 1 def.nte, la serie div +inf

### Rapporto asintotico
termini strettamente positivi
Sia lim a(k+1) / a(k) = l [0, +inf) u +inf
- se l < 1 la serie cv
- se l > 1 la serie div
- se l = 1 non si può dire nulla

### Criterio radice
termini positivi
- Se radice k-esima di ak < 1 def.nte, la serie converge
- Se radice k-esima di ak >= 1 def.nte, la serie div +inf

### Criterio radice asintotica
termini positivi
Sia lim radice k-esima di ak = l [0, +inf) u +inf
- se l < 1 la serie cv
- se l > 1 la serie div
- se l = 1 non si può dire nulla

### Ponte radice rapporto
Se esiste lim rapporto, esiste lim radice e coincidono, ma non il viceversa
Quindi:
- se lim rapporto = 1 -> lim radice = 1 -> non si può concludere nulla
- se lim radice = 1 -> lim rapporto = 1 o non esiste -> non si può concludere nulla