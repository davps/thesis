/**
 * Supports replacement of a process value by another value.
 * @category IEC 61850 parte 7-2 (2003)
 * página 18, cláusula 5.3 , párrafo
 * 
 * @author David Pérez
 */
package ACSI.informationModels.services.controlBlock;

public abstract class Substitution {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 12.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetDataValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 12.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataValues();
}
//TODO no usado
