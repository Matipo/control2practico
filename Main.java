public class Main {
  public static void main(String[] args) {
    cola_orden cola = new cola_orden();
    pila_orden pila = new pila_orden();

    // Agregar un pedido nuevo a la cola
    cola.ingresarPedido("Pedido 1", 15.0);
    cola.ingresarPedido("Pedido 2", 15.0);
    cola.ingresarPedido("Pedido 3", 10.0);
    cola.ingresarPedido("Pedido 4", 50.0);

    //cola.eliminarPedido();
    //Bucle para que se procesen todos los pedidos
    do {
      // Procesar un pedido de la cola
      Nodo pedidoProcesado = cola.eliminarPedido();
      if (pedidoProcesado != null) {
        pila.agregarPedidoProcesado(pedidoProcesado.getNombrePedido(), pedidoProcesado.getValorTotal());
      }
      // Ver el último pedido procesado sin sacarlo de la pila
      Nodo ultimoProcesado = pila.ultimoProcesado();
      if (ultimoProcesado != null) {
        System.out.println(
            "Último pedido procesado: " + ultimoProcesado.getNombrePedido() + " | $" + ultimoProcesado.getValorTotal());
      } else {
        System.out.println("No hay pedidos procesados en la pila.");
      }
      // Ver el próximo pedido pendiente
      Nodo pedidoPendiente = cola.pendiente();
      if (pedidoPendiente != null) {
        System.out.println(
            "Próximo pedido pendiente: " + pedidoPendiente.getNombrePedido() + " | $" + pedidoPendiente.getValorTotal());
      } else {
        System.out.println("No hay pedidos pendientes.");
      }
      
    }while(cola.cantidadPedidos() > 1);
    
    // Determinar la cantidad de pedidos por procesar y el valor total ganado
    System.out.println("Cantidad de pedidos por procesar: " + cola.cantidadPedidos());
    System.out.println("Valor total ganado: $" + pila.ganadoPedidos());
  }
}
