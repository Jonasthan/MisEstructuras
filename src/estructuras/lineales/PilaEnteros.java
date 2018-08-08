package estructuras.lineales;

public class PilaEnteros implements IPilaEnteros {

	private static int TAMAÑO = 50;
	private int[] listaEnteros;
	private int cima;
	
	
	
	public PilaEnteros() {
		super();
	    listaEnteros = new int[TAMAÑO];
	    cima = -1;
	}

	@Override
	public void push(int elemento) throws Exception {
		if(isFull()) {
			throw new Exception("Se sale del tamaño de la lista (desbordamiento)");
		}
		cima++;
		listaEnteros[cima] = elemento;
	}

	@Override
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("la lista esta vacia (desbordamiento Negativo)");
		}
		int numero = listaEnteros[cima];
		cima--;
		return numero;
	}

	@Override
	public int getTop() throws Exception {
		if(isEmpty()) {
			throw new Exception("la lista esta vacia (desbordamiento Negativo)");
		}
		return listaEnteros[cima];
	}

	@Override
	public int getNumberOfElements() throws Exception {
		if(isEmpty()) {
			throw new Exception("la lista esta vacia (desbordamiento Negativo)");
		}
		return cima; // manito arriba
	
	}

	@Override
	public boolean isFull() {
		return cima == TAMAÑO - 1;
	}

	@Override
	public boolean isEmpty() {
		return cima == -1;
	}

}
