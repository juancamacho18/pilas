import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class ejercicio6 {
    public static ArrayList<Venta> listaventas=new ArrayList<>();
    public static Stack<Venta> ventasenpila=new Stack<>();
    public static Random random=new Random();
    public static void main(String[] args) {
        crearlistaproductos();
        agruparpila();
        mostrarytotalpila();
        double totallista=valortotal(listaventas, 0);
        System.out.println("valor total de los articulos: $"+totallista);
        
    }

    public static void crearlistaproductos(){
        int total=1+random.nextInt(10);
        for (int i=0;i<total;i++){
            int cantidad=random.nextInt(19);
            double precio=Math.round(100.00+random.nextDouble(49900.00))/100.00;
            listaventas.add(new Venta(i+1, null, (1000+i), cantidad, precio));
        }
    }

    public static void agruparpila(){
        for (Venta venta : listaventas) {
            for (Venta pila: ventasenpila){
                if (pila.getCodigo()==venta.getCodigo()){
                    pila.setCantidad(pila.getCantidad()+venta.getCantidad());
                    ventasenpila.push(new Venta(venta.getNumero_pedido(), venta.getFecha(), venta.getCodigo(), venta.getCantidad(), venta.getPrecio()));
                    break;
                }
            }
        }
    }

    public static void mostrarytotalpila(){
        System.out.println(ventasenpila);
        double total=0;
        while (!ventasenpila.isEmpty()){
            Venta venta=ventasenpila.pop();
            total+=venta.getCantidad()*venta.getPrecio();
        }
        System.out.println("venta total en la pila: $"+total);
    }

    public static double valortotal(ArrayList<Venta> ventas, int index){
        if (index>=ventas.size()){
            return 0;
        }
        Venta venta=ventas.get(index);
        double total=Math.round(venta.getCantidad()*venta.getPrecio())/100.00;
        return total + valortotal(ventas, index+1);
    }
}
