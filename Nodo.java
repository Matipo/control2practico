class Nodo {
    private String nombrePedido;
    private double valorTotal;
    private Nodo siguiente;

    public Nodo(String nombrePedido, double valorTotal) {
        this.nombrePedido = nombrePedido;
        this.valorTotal = valorTotal;
        this.siguiente = null;
    }
    //Obtener nombre del pedido
    public String getNombrePedido() {
        return this.nombrePedido;
    }
    //Obtener valor del pedido
    public double getValorTotal() {
        return this.valorTotal;
    }
    //Obtener el siguiente
    public Nodo getSiguiente() {
        return siguiente;
    }
    //Asignar el siguiente
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}