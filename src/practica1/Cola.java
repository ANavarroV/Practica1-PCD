package practica1;

/**
 * 
 * @author ANTONIO
 */
public class Cola implements ICola {

    private int head;
    private int tail;
    private int capacidad;
    private int numElementos;
    private Object datos[];

    /**
     * 
     * @param capacidad 
     */
    public Cola(int capacidad) {
        this.capacidad = capacidad;
        this.head = 0;
        this.tail = 0;
        this.numElementos = 0;
        this.datos = new Object[capacidad];
    }

    /**
     * 
     * @return 
     */
    public int getNum() {
        return numElementos;
    }

    /**
     * 
     * @param elemento
     * @throws Exception 
     */
    public void acola(Object elemento) throws Exception {

        if (!colallena()) {
            datos[tail] = elemento;
            tail = (tail + 1) % capacidad;
            numElementos++;

        } else {
            throw new Exception("Cola llena");
        }
    }

    /**
     * 
     * @return
     * @throws Exception 
     */
    public Object desacola() throws Exception {
        Object objetoDesencolado = null;

        if (!colavacia()) {
            objetoDesencolado = datos[head];
            numElementos--;
            head = (head + 1) % capacidad;
            
            datos[head] = null;
        } else {
            throw new Exception("Cola vacia");
        }

        return objetoDesencolado;
    }

    /**
     * 
     * @return
     * @throws Exception 
     */
    public Object primero() throws Exception {

        Object primero = null;

        if (!colavacia()) {
            primero = datos[head];
        } else {
            throw new Exception("Cola vacia");
        }

        return primero;
    }

    /**
     * 
     * @return 
     */
    private boolean colavacia() {

        return getNum() == 0;
    }

    /**
     * 
     * @return 
     */
    private boolean colallena() {

        return getNum() == capacidad;
    }

}
