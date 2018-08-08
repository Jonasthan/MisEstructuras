package estructuras.lineales;

/**
 * Interface que modela una Cola para n�meros enteros
 * @author Milton Javier Camelo Arango
 * @author Jonathan David Sanchez
 */
public interface IColaReales {

	/**
	 * M�todo que inserta un nuevo elemento en la Cola
	 * @param elemento es el nuevo elemento a insertar en la estructura
	 */
	public void queue(double elemento);
	
	/**
	 * M�todo que remueve el primer elemento de la Cola 
	 * @return
	 */
	public double dequeue();
	
	/**
	 * M�todo que obtiene (Sin removerlo) el  primer elemento de la Cola 
	 * @return elemento cima de la pila
	 */
	public double getFirst();
	
	/**
	 * M�todo que indica el n�mero de elementos de la Cola
	 * @return n�mero de elementos
	 */
	public int getNumberOfElements();
	
	/**
	 * M�todo que indica si la Cola se encuentra llena
	 * @return true si se encuentra llena de lo contrario False
	 */
	public boolean isFull();
	
	/**
	 * M�todo que indica si la Cola se Encuentra vac�a 
	 * @return true si se encuentra vac�a de lo contrario False
	 */
	public boolean isEmpty();
	
}
