/**
 * Supports  a  fast  and  reliable system-wide  
 * distribution  of  input  and  output  data  values;  
 * peer-to-peer  exchange  of  IED binary status information, 
 * for example, a trip signal
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 19, cláusula 5.3 , párrafo
 *  
 * @see GSE
 * @author David Perez
 * 
 */

//TODO revisar si la descripcion de arriba realmente corresponde a goose
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
 * inicialmente esta clase se llamaba GOOSE_CONTROL_BLOCK 
 * y luego lo renombré acorde a [7-2, clause 5.4, pp 21]
 * a GOOSE
 *  
 *  
 *  Observacion acerca de Version01:
 *  En la parte 9.1.1 se usa el nombre goose control block nuevamente
 *  para definirlo como nombre del atributo de la clase logical node
 *  de la tabla 15. Y como yo le llamé goose, me dejó pensando
 *  en cuanto a la convención de nombres. Idem para GSSE
 */
public abstract class GOOSE extends GSE {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SendGOOSEMessage();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetGOReference();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetGOOSEElementNumber();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetGOCBValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 15.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetGOCBValues();

}
//TODO no usado