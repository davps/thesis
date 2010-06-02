/**
 * Defines  how  to  switch  from  one  set  of  setting
 * values to another one and how to edit setting groups
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 18, cláusula 5.3 , párrafo
 *  
 * @author David Perez
 */
package ACSI.informationModels.services.controlBlock;

import ACSI.informationModels.ACSIClass;

/*
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 18]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion - 
 */
public abstract class SETTING_GROUP_CONTROL_BLOCK extends ACSIClass{

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SelectActiveSG();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SelectEditSG();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetSGValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void ConfirmEditSGValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetSGValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetSGCBValues();
}
//TODO no usado