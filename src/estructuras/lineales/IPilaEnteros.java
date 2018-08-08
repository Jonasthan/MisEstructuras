package estructuras.lineales;

/**
 * Interface que modela una pila para n�meros enteros
 * @author Milton Javier Camelo Arango
 * @author Jonathan David Sanchez
 */
public interface IPilaEnteros {

	/**
	 * M�todo que inserta un nuevo elemento en la pila
	 * @param elemento es el nuevo elemento a insertar en la estructura
	 */
	public void push(int elemento);
	
	/**
	 * M�todo que remueve el elemento cima de la Pila 
	 * @return
	 */
	public int pop();
	
	/**
	 * M�todo que obtiene (Sin removerlo) el elemento cima de la Pila 
	 * @return elemento cima de la pila
	 */
	public int getTop();
	
	/**
	 * M�todo que indica el n�mero de elementos de la Pila 
	 * @return n�mero de elementos
	 */
	public int getNumberOfElements();
	
	/**
	 * M�todo que indica si la Pila se encuentra llena
	 * @return true si se encuentra llena de lo contrario False
	 */
	public boolean isFull();
	
	/**
	 * M�todo que indica si la Pila se Encuentra vac�a 
	 * @return true si se encuentra vac�a de lo contrario False
	 */
	public boolean isEmpty();
	
}
