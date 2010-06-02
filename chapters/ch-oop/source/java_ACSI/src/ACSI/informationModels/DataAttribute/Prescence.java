/**
 * TODO revisar si esta documentacion de descripcion esta 
 * bien. Creo que no:
 * 
 * 
 * Used for:
 * -IEC 61850-7-2 and IEC 61850-7-3  to define the specific data 
 * 	to be used for the application models in IEC 61850-7-4
 * -For the control blocks in IEC 61850-7-2 (for example, 
 *  report control blocks)
 *  
 * 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 22, cláusula 5.5.1 , párrafo 3
 *  
 * @author David Perez
 * 
 */

package ACSI.informationModels.DataAttribute;

/*
 *--------------------------------------------------------------------------
 * Development log
 *--------------------------------------------------------------------------
 * 
 * version 01
 *  
 */


public class Prescence {

	/*
	 * TODO verificar si se asigna solo el string M o la palabra Mandatory
	 * 
	 */
//	public static final String Mandatory = "M";
//	public static final String Optional = "O";
	
	public static final boolean Mandatory = false;
	public static final boolean Optional = false;
	
}
