/**
 * Describes the services to control, for example, devices 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 19, cláusula 5.3 , párrafo
 *  
 * @author David Perez
 *
 */

package ACSI.informationModels.services.controlBlock;

public abstract class Control {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Select();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SelectWithValue();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Cancel();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Operate();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void CommandTermination();
	

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void TimeActivatedOperate();

}
//TODO no usado