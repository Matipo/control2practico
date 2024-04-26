
class pila_orden {
  private Nodo cima;
  private int tamanio;
  private double totalGanado;

  public pila_orden() {
    this.cima = null;
    this.tamanio = 0;
    this.totalGanado = 0.0;
  }

  public boolean esvacia() {
    return this.cima == null;
  }

  public void agregarPedidoProcesado(String nombrePedido, double valorTotal) {
    Nodo nuevoNodo = new Nodo(nombrePedido, valorTotal);
    nuevoNodo.setSiguiente(this.cima);
    this.cima = nuevoNodo;
    this.tamanio++;
    this.totalGanado += valorTotal;
  }

  public Nodo procesarPedido() {
    if (esvacia()) {
      return null;
    }
    Nodo pedidoProcesado = this.cima;
    this.cima = this.cima.getSiguiente();
    this.tamanio--;
    this.totalGanado -= pedidoProcesado.getValorTotal();
    return pedidoProcesado;
  }

  public Nodo ultimoProcesado() {

    return this.cima;
  }

  public double ganadoPedidos() {
    return this.totalGanado;
  }
}
