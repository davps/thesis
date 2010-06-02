/**
 * @see UNBUFFERED_REPORT_CONTROL_BLOCK
 */

package ACSI.informationModels.services.controlBlock;

public abstract class BUFFERED_REPORT_CONTROL_BLOCK extends REPORT_CONTROL_BLOCK {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Report();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetBRCBValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetBRCBValues();
}
//TODO no usado