/**
 * Esta clase es auxiliar,
 * Dado que los BasicTypes son primitivos.
 * 
 * La lista detallada de los BasicTypes están
 * en la parte 7-2, clausula 5.5.2, tabla 2
 */
package ACSI.informationModels.DataAttribute;

/*
 * TODO verificar si conviene convertirlo en un singleton
 */
public class BasicType {
	
	public static final String BOOLEAN 			= "BOOLEAN";
	public static final String INT8 			= "INT8";
	public static final String INT16 			= "INT16";
	public static final String INT24 			= "INT24";
	public static final String INT32 			= "INT32";
	public static final String INT128			= "INT128";
	public static final String INT8U 			= "INT8U";
	public static final String INT16U 			= "INT16U";
	public static final String INT24U 			= "INT24U";
	public static final String INT32U 			= "INT32U";
	public static final String FLOAT32 			= "FLOAT32";
	public static final String FLOAT64 			= "FLOAT64";
	public static final String ENUMERATED 		= "ENUMERATED";
	public static final String CODED_ENUM 		= "CODED ENUM";
	public static final String OCTED_STRING		= "OCTED STRING";
	public static final String VISIBLE_STRING 	= "VISIBLE_STRING";
	public static final String UNICODE_STRING 	= "UNICODE STRING";
	
	/**
	 * Este método permite verificar si el objeto obj ingresado
	 * como parámetro es del tipo BasicType definido en la 
	 * parte 7-2, clausula 5.5.1, parrafo 3. 
	 * En caso de que sea retorna verdadero, de lo contrario
	 * retorna falso.
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isBasicType(Object obj){
		
		if( obj instanceof Integer ||  obj instanceof String )
			return true;
		
		/*
		 * TODO no se como verificar si es instancia de enum.
		 * De Integer o String no hay problema
		 */
		return false;

	}

}
