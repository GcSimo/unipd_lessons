/**
 * Classe per testare le funzionalità della classe CodaObject
 */
public class TesterCodaObject {
	public static void main(String[] args) throws EmptyQueueException, FullQueueException {
		// creazione oggetto coda
		CodaObject co = new CodaObject();

		// creazione accumulatore
		int accumulatore = 0;
		
		// stampa dati iniziali sulla coda
		System.out.println("coda con " + co.currentSize() + " elementi con capienza di " + co.maxSize() + " elementi");
		
		// popolo la coda con argomenti da riga di comando
		for (int i = 0; i < args.length; i++) {
			co.add(args[i]);
		}

		// stampa dati finali sulla coda
		System.out.println("coda con " + co.currentSize() + " elementi con capienza di " + co.maxSize() + " elementi");

		// estraggo gli elementi dalla coda, li converto in interi, li sommo nell'accumulatore
		while (co.currentSize() != 0) {
			Integer e = Integer.parseInt((String)co.remove());
			accumulatore += e;
			System.out.println("accumulatore: " + accumulatore);
			System.out.println(
					"coda con " + co.currentSize() + " elementi con capienza di " + co.maxSize() + " elementi");
		}
	}
}
