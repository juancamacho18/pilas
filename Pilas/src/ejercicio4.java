import java.util.ArrayList;
import java.util.Stack;
@SuppressWarnings("rawtypes")

public class ejercicio4 {
    public static ArrayList<ArrayList<Stack>> bodega=new ArrayList<>();
    public static void main(String[] args) {
        String contenedor="A1005"; 
        llenarbodega();
        Salidacontenedor(contenedor, 0);
    }

    public static void llenarbodega(){
        String letra="A";
        int entero=1001;
        String numero;
        for (int i=0;i<9;i++){
            ArrayList<Stack> listapila=new ArrayList<>();
            for (int j=0;j<7;j++){
                Stack<String> pila=new Stack<>();
                for (int k=0;k<8;k++){
                    numero=letra+entero;
                    pila.push(numero);
                    entero++;
                }
                listapila.add(pila);
            }
            bodega.add(listapila);
        }
    }

    public static void Salidacontenedor(String contenedor, int fila) {
        if (fila>=bodega.size()){           
            System.out.println("El contenedor "+contenedor+" no fue encontrado.");
            return ;
        }
    
        for (int columna=0; columna<bodega.get(fila).size(); columna++){
            @SuppressWarnings("unchecked")
            Stack<String> pila=bodega.get(fila).get(columna);
    
            if (!pila.isEmpty() && pila.contains(contenedor)) {
                while (!pila.isEmpty()) {
                    String actual=pila.pop();
                    if (actual.equals(contenedor)){
                        System.out.print("Contenedor "+contenedor+" encontrado en:");
                        System.out.println("fila "+fila+", columna "+columna+", posicion "+(pila.size()+1));
                        return ;
                    }
                }
            }
        }
        Salidacontenedor(contenedor,(fila+1)); 
    }
    
}
