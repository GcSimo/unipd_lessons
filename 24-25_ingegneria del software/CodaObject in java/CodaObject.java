/**
 * Classe che implementa una coda di oggetti generici
 */
public class CodaObject {
	Object[] elem = null;
	int first, last, size;
	
	/**
	 * Costruttore che riceve la dimensione iniziale della coda e la istanzia 
	 * @param size dimensione iniziale della coda
	 */
	public CodaObject(int maxSize) {
		first = last = size = 0;
		elem = new Object[maxSize];
	}

	/**
	 * Costruttore di default che inizializza la coda vuota ad una dimensione
	 * iniziale di 10 elementi.
	 */
	public CodaObject() {
		this(10);
	}

	/**
	 * Metodo che aggiunge un nuovo elemento alla coda
	 * @param o elemento da aggiungere
	 * @return size se inserito, -1 se non inserito
	 * @throws FullQueueException se la coda è piena
	 */
	public int add(Object o) throws FullQueueException {
		if (size == elem.length)
			throw new FullQueueException();
		
		elem[last] = o;
		last = (last + 1) % elem.length;
		size++;
		return size;
	}

	/**
	 * Metodo che rimuove e restituisce un elemento dalla coda
	 * @return elemento rimosso
	 * @throws EmptyQueueException se la coda è vuota
	 */
	public Object remove() throws EmptyQueueException {
		if (size == 0)
			throw new EmptyQueueException();
		
		Object temp = elem[first];
		first = (first + 1) % elem.length;
		size--;
		return temp;
	}

	/**
	 * Retisuisce la dimensione utilizzata della coda, ovvero il numero degli
	 * elementi contenuti nella coda
	 * @return dimensione utilizzata della coda
	 */
	public int currentSize() {
		return size;
	}

	/**
	 * Retisuisce la capienza massima della coda, ovvero il numero massimo di
	 * elementi che la coda può contenere
	 * @return capienza massima della coda
	 */
	public int maxSize() {
		return elem.length;
	}
}
