/**
 * Used for:
 * -IEC 61850-7-2 and IEC 61850-7-3  to define the specific data 
 * 	to be used for the application models in IEC 61850-7-4
 * -For the control blocks in IEC 61850-7-2 (for example, 
 *  report control blocks)
 *  
 * The use of DAType class to  specify  the  types  of  data
 * attributes can be found in IEC 61850-7-2, clause 10.
 *  
 * 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 22, cláusula 5.5.1 , párrafo
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

public abstract class DAType {
	
	/**
	 * 
	 *
	 */
	public @interface Metadata {
	    String attributeName() default "undefined";
	    String attributeType() default "undefined";
	    String valueValueRangeOrExplanation() default "null";
	    boolean M_O() default false; 
	}

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 *  página 22, cláusula 5.5.1 , párrafo 2<br>
	 * Explicado en la cláusula 5.5.1
	 */
	//TODO cambiar el void por su correspondiente
	public abstract String Name();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 *  página 22, cláusula 5.5.1 , párrafo 2<br>
	 * Explicado en la cláusula 5.5.1
	 */
	//TODO cambiar el void por su correspondiente
	public abstract String Presence();
	
}
