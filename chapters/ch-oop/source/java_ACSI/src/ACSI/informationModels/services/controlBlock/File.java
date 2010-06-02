/**
 *  Defines the exchange of large data blocks such as programs 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 19, cláusula 5.3 , párrafo
 *  
 * @author David Perez
 *
 */

package ACSI.informationModels.services.controlBlock;

public abstract class File {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 20.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetFile();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 20.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetFile();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 20.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void DeleteFile();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 20.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetFileAttributeValues();
	
}
//TODO no usado