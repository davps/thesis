/**
 *  permits the grouping of data and data attributes. 
 *  Used for direct access and for reporting and logging
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 18, cláusula 5.3 , párrafo
 *
 *  
 */

package ACSI.informationModels.services.controlBlock;

import ACSI.informationModels.ACSIClass;

/*
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 18]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion - 
 */
public abstract class DATA_SET extends ACSIClass {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataSetValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetDataSetValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void CreateDataSet();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void DeleteDataSet();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataSetDirectory();

}
//TODO no usado