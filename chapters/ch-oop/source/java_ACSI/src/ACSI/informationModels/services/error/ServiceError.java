package ACSI.informationModels.services.error;

public class ServiceError extends Exception {

	/**
	 * Error de la respuesta al consumirse el 
	 * servicio de Logical Device 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceError(String message) {
		super(message);		
	}
}
