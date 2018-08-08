package estructuras.lineales;

/**
 * Interface que modela una pila para números enteros
 * @author Milton Javier Camelo Arango
 * @author Jonathan David Sanchez
 */
public interface IPilaEnteros {

	/**
	 * Método que inserta un nuevo elemento en la pila
	 * @param elemento es el nuevo elemento a insertar en la estructura
	 */
	public void push(int elemento);
	
	/**
	 * Método que remueve el elemento cima de la Pila 
	 * @return
	 */
	public int pop();
	
	/**
	 * Método que obtiene (Sin removerlo) el elemento cima de la Pila 
	 * @return elemento cima de la pila
	 */
	public int getTop();
	
	/**
	 * Método que indica el número de elementos de la Pila 
	 * @return número de elementos
	 */
	public int getNumberOfElements();
	
	/**
	 * Método que indica si la Pila se encuentra llena
	 * @return true si se encuentra llena de lo contrario False
	 */
	public boolean isFull();
	
	/**
	 * Método que indica si la Pila se Encuentra vacía 
	 * @return true si se encuentra vacía de lo contrario False
	 */
	public boolean isEmpty();
	
}
