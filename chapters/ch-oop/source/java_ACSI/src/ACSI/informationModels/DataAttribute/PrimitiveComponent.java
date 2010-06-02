/**
 * Used for:
 * -IEC 61850-7-2 and IEC 61850-7-3 (in CDC) to define the specific data 
 * 	to be used for the application models in IEC 61850-7-4
 * -For the control blocks in IEC 61850-7-2 (for example, 
 *  report control blocks)
 *  
 * The use of (DAType)PrimitiveComponent class to  specify  the  types  of  data
 * attributes can be found in IEC 61850-7-2, clause 10.
 *  
 * @category IEC 61850 parte 7-2 (2003)
 * página 22, cláusula 5.5.1 , párrafo
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
 * Aqui aún no implemento los métodos abstractos de DAType
 * 
 * TODO: verificar como implementar la relación uno a muchos de BasicType con 
 * esta clase, definido en la parte 7-2, clausula 5.5.1, figura 4
 */

public abstract class PrimitiveComponent extends DAType {

}
//TODO no usado