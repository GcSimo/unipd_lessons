/**
 * Classe per testare le funzionalità della classe CodaGen
 */
public class TesterCodaGen {
	public static void main(String[] args) throws EmptyQueueException, FullQueueException {
		// creazione oggetto coda
		//CodaGen<String> co = new CodaGen<String>(3); // coda di strings
		CodaGen<Integer> co = new CodaGen<Integer>(3); // coda di integer

		// creazione accumulatore
		int accumulatore = 0;
		
		// stampa dati iniziali sulla coda
		System.out.println("coda con " + co.currentSize() + " elementi con capienza di " + co.maxSize() + " elementi");
		
		// popolo la coda con argomenti da riga di comando
		for (int i = 0; i < args.length; i++) {
			// co.add(argv[i]); // per coda con string
			co.add(Integer.parseInt(args[i])); // per coda con integer
		}

		// stampa dati finali sulla coda
		System.out.println("coda con " + co.currentSize() + " elementi con capienza di " + co.maxSize() + " elementi");

		// estraggo gli elementi dalla coda, li converto in interi, li sommo nell'accumulatore
		while (co.currentSize() != 0) {
			//Integer e = Integer.parseInt(co.remove()); // per coda con string
			Integer e = co.remove(); // per coda con integer
			accumulatore += e;
			System.out.println("accumulatore: " + accumulatore);
			System.out.println("coda con " + co.currentSize() + " elementi con capienza di " + co.maxSize() + " elementi");
		}
	}
}
