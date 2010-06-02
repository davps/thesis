/**
 *  Control  blocks  for  transmission  of  sampled  values  –  fast  and  cyclic  transfer  of
 *  samples, for example, of instrument transformers.
 *  
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 19, cláusula 5.2 , párrafo
 *  
 *  @see MULTICAST_SAMPLE_VALUE_CONTROL_BLOCK
 */


package ACSI.informationModels.services.controlBlock;

/*
 * version 01
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 19]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion -
 * 
 * version 02
 * y luego lo renombré acorde a [7-2, clause 5.4, pp 21] 
 */

public abstract class UNICAST_SAMPLE_VALUE_CONTROL_BLOCK extends
		SAMPLE_VALUE_CONTROL_BLOCK {

		/**
		 * Definido en IEC 61850 parte 7-2 (2003)
		 * página 21, cláusula 5.4, tabla 1 <br>
		 * Explicado en la cláusula 16.
		 */
		//TODO cambiar el void por su correspondiente
		public abstract void SendUSVMessage();

		/**
		 * Definido en IEC 61850 parte 7-2 (2003)
		 * página 21, cláusula 5.4, tabla 1 <br>
		 * Explicado en la cláusula 16.
		 */
		//TODO cambiar el void por su correspondiente
		public abstract void GetUSVCBValues();

		/**
		 * Definido en IEC 61850 parte 7-2 (2003)
		 * página 21, cláusula 5.4, tabla 1 <br>
		 * Explicado en la cláusula 16.
		 */
		//TODO cambiar el void por su correspondiente
		public abstract void SetUSVCBValues();
		
	}
	