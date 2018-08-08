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
	 * @throws Exception 
	 */
	public void push(int elemento) throws Exception;
	
	/**
	 * M�todo que remueve el elemento cima de la Pila 
	 * @return
	 * @throws Exception 
	 */
	public int pop() throws Exception;
	
	/**
	 * M�todo que obtiene (Sin removerlo) el elemento cima de la Pila 
	 * @return elemento cima de la pila
	 * @throws Exception 
	 */
	public int getTop() throws Exception;
	
	/**
	 * M�todo que indica el n�mero de elementos de la Pila 
	 * @return n�mero de elementos
	 * @throws Exception 
	 */
	public int getNumberOfElements() throws Exception;
	
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
