import java.util.Stack;

public class ejercicio1 {
    public static Stack<Integer> pila1=new Stack<>();
    public static Stack<Integer> pila2=new Stack<>();
    public static Stack<Integer> pila3=new Stack<>();
    public static void main(String[] args) throws Exception {
        
        for (int i=0;i<6;i++){
            pila1.push(200-(i*20));
        }
        System.out.println("pila antes: "+pila1);
        pila2.push(pila1.pop());
        for (int i=0;i<4;i++){
            pila3.push(pila1.pop());
        }
        for (int i=0;i<4;i++){
            pila2.push(pila3.pop());
        }
        pila2.push(pila1.pop());
        System.out.println("pila nueva: "+pila2);
    }
}
