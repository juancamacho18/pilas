import java.util.ArrayList;
import java.util.Stack;

public class ejercicio5 {
    public static Stack<ArrayList<ArrayList<Integer>>> torres=new Stack<>();
    public static void main(String[] args) {
        int torre=1;
        int piso=3;
        llenartorres();
        Facturacion(torre, piso);
    }
    public static void llenartorres(){
        int numero=101;
        int limite=107;
        for (int i=0;i<6;i++){
            ArrayList<ArrayList<Integer>> pisos=new ArrayList<>();
            for (int j=0;j<10;j++){
                ArrayList<Integer> apartamentos=new ArrayList<>();
                for (int k=0;k<6;k++){
                    apartamentos.add(numero);
                    numero++;
                    if(numero==limite){
                        numero+=4;
                        limite+=10;
                    }
                }
                pisos.add(apartamentos);
            }
            torres.push(pisos);  
        }
    }

    public static void Facturacion(int torre, int piso){
        if (torre>=torres.size()){
            System.out.println("Torre no encontrada");
            return; 
        }
        ArrayList<ArrayList<Integer>> pisos=(ArrayList<ArrayList<Integer>>) torres.get(torre-1);
        if (piso>=pisos.size()){
            System.out.println("Piso no encontrado");
            return; 
        }
        ArrayList<Integer> apartamentos=pisos.get(piso-1);
        for (int apartamento: apartamentos){
            System.out.println("Torre: C"+torre+" piso: "+piso+", apartamento: "+apartamento);
            System.out.println("Monto a pagar: $250,000");
            System.out.println("");
        }
        apartamentos.clear();
    }
    
}
