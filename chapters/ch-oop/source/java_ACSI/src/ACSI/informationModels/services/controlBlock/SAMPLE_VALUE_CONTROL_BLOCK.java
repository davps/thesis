
/*
 * TODO ver si esta clase es realmente necesaria. En realidad no esta 
 * definida en la pag 21 de la parte 7-2 pero creí importante
 * incluirla de forma a que multicast y unicast sampled values 
 * puedan heredar esta clase, y de esa forma tener el polimorfismo
 * necesario para otras partes del framework.
 */

/**
 * @see UNICAST_SAMPLE_VALUE_CONTROL_BLOCK
 * @see MULTICAST_SAMPLE_VALUE_CONTROL_BLOCK
 */
package ACSI.informationModels.services.controlBlock;

import ACSI.informationModels.ACSIClass;

public abstract class SAMPLE_VALUE_CONTROL_BLOCK extends ACSIClass{

}