/**
 * @see GSE
 */


package ACSI.informationModels.services.controlBlock;


/*
 *--------------------------------------------------------------------------
 * Development log
 *--------------------------------------------------------------------------
 * 
 * version 01
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 19]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion -
 * 
 * version 02
 * inicialmente esta clase se llamaba GSSE_CONTROL_BLOCK 
 * y luego lo renombré acorde a [7-2, clause 5.4, pp 21]
 * a GSSE
 *  
 */

public abstract class GSSE extends GSE {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SendGSSEMessage();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetGsReference();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetGSSEDataOffset();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetGsCBValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetGsCBValues();
	
}
