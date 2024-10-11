import java.util.Stack;

public class ejercicio2 {
    public static Stack<Integer> pila1=new Stack<>();
    public static Stack<Integer> pila2=new Stack<>();
    public static void main(String[] args) {
        for (int i=0;i<6;i++){
            pila1.push(100+(i*20));
        }
        System.out.println("pila: "+pila1);
        int data=121;
        añadir(data);
        System.out.println("pila con el dato: "+pila1);
    }

    public static void añadir(int dato){
        if (pila1.isEmpty()|| dato>pila1.peek()){
            pila1.push(dato);
            while(!pila2.isEmpty()){
                pila1.push(pila2.pop());
            }
        }else{
            pila2.push(pila1.pop());
            añadir(dato);
            
        }
    }

}
