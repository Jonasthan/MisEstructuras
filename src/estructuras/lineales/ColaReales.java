package estructuras.lineales;

public class ColaReales implements IColaReales {
	
	private static int TAMAÑO = 50;
	private double[] listaReales;
	private int frente;
	private int fin;
	
	public ColaReales() {
		listaReales = new double[TAMAÑO];
		frente = 0;
		fin = -1;
	}
	
	
	@Override
	public void queue(double elemento) throws Exception {
		if (!isFull()) {
			listaReales[++fin] = elemento;
		}else
			throw new Exception("La cola se encuentra llena.");
	}

	@Override
	public double dequeue() throws Exception {
		if (!isFull()) {
			return listaReales[++frente];
		}else
			throw new Exception("La cola se encuentra llena.");
	}

	@Override
	public double getFirst() throws Exception {
		if (!isFull()) {
			return listaReales[frente];
		}else
			throw new Exception("La cola se encuentra llena.");
	}

	@Override
	public int getNumberOfElements() throws Exception {
		if(isEmpty()) {
			throw new Exception("La cola esta vacia");
		}
		return fin; // manito arriba
	}

	@Override
	public boolean isFull() {
		return fin == TAMAÑO - 1;
	}

	@Override
	public boolean isEmpty() {
		return frente > fin ;
	}

	

}
