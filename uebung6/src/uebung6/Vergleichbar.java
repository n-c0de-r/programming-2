package uebung6;
public interface Vergleichbar {
	/**
	 * vergleicht this mit dem als Parameter uebergebenen Objekt
	 * 
	 * @param obj übergebenes Objekt, mit dem this verglichen wird
	 * @return -1, falls this kleiner ist als das Parameterobjekt obj; 0, falls
	 *         beide Objekte gleich gross sind; 1, falls this groesser ist als das
	 *         Parameterobjekt obj
	 */

	public abstract int vergleicheMit(Vergleichbar obj);
}
