/**
 * Explicado en la cláusula 7 de la IEC 61850-7-2.
 */
package ACSI.informationModels.services;

/*
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 21]
 */

public abstract class ASSOCIATION {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Associate();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Abort();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Release();
}
//TODO no usado