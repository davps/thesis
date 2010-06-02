/**
 * Describe  the  conditions  for generating  reports  based  
 * on  parameters  set  by  the  client.  Reports  may  be
 * triggered by changes of process data values (for example, 
 * state change or dead band)  or by  quality  changes.  
 * Reports  may  be  sent immediately   or   deferred.   
 * Reports   provide   change-of-state   and   sequence-of-events 
 * information exchange. 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 19, cláusula 5.3 , párrafo
 *  
 * @author David Perez
 */
package ACSI.informationModels.services.controlBlock;

import ACSI.informationModels.ACSIClass;

/*
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 19]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion - 
 */
public abstract class REPORT_CONTROL_BLOCK extends ACSIClass{

}
/*
 * Usado como la generalización de 
 * 	-	UNBUFFERED REPORT CONTROL BLOCK
 *  -	BUFFERED REPORT CONTROL BLOCK 
 */

