package estructuras.lineales;

/**
 * Interface que modela una Cola para números enteros
 * @author Milton Javier Camelo Arango
 * @author Jonathan David Sanchez
 */
public interface IColaReales {

	/**
	 * Método que inserta un nuevo elemento en la Cola
	 * @param elemento es el nuevo elemento a insertar en la estructura
	 * @throws Exception 
	 */
	public void queue(double elemento) throws Exception;
	
	/**
	 * Método que remueve el primer elemento de la Cola 
	 * @return
	 * @throws Exception 
	 */
	public double dequeue() throws Exception;
	
	/**
	 * Método que obtiene (Sin removerlo) el  primer elemento de la Cola 
	 * @return elemento cima de la pila
	 * @throws Exception 
	 */
	public double getFirst() throws Exception;
	
	/**
	 * Método que indica el número de elementos de la Cola
	 * @return número de elementos
	 * @throws Exception 
	 */
	public int getNumberOfElements() throws Exception;
	
	/**
	 * Método que indica si la Cola se encuentra llena
	 * @return true si se encuentra llena de lo contrario False
	 */
	public boolean isFull();
	
	/**
	 * Método que indica si la Cola se Encuentra vacía 
	 * @return true si se encuentra vacía de lo contrario False
	 */
	public boolean isEmpty();
	
}
