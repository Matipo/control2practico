class cola_orden {
  private Nodo cola;
  private Nodo cabeza;
  private int tamanio;

  public cola_orden() {
    this.cola = null;
    this.cabeza = null;
    this.tamanio = 0;
  }

  public boolean esvacia() {
    return this.cola == null && this.cabeza == null;
  }

  public void ingresarPedido(String nombrePedido, double valorTotal) {
    Nodo nuevoNodo = new Nodo(nombrePedido, valorTotal);
    if (esvacia()) {
      this.cola = nuevoNodo;
      this.cabeza = nuevoNodo;
    } else {
      this.cola.setSiguiente(nuevoNodo);
      this.cola = nuevoNodo;
    }
    System.out.println("Pedido ingresado: " + nombrePedido + " | $" + valorTotal);
    this.tamanio++;
  }

  public Nodo eliminarPedido() {
    if (esvacia()) {
      return null;
    }
    Nodo pedidoEliminado = this.cabeza;
    this.cabeza = this.cabeza.getSiguiente();
    this.tamanio--;
    return pedidoEliminado;
  }

  public Nodo pendiente() {

    return this.cabeza;
  }

  public int cantidadPedidos() {
    return this.tamanio;
  }
}