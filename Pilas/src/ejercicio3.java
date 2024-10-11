import java.util.ArrayList;
import java.util.Random;
import java.util.Stack; 
 
 
public class ejercicio3 { 
    public static ArrayList<Integer> establo1=new ArrayList<>(); 
    public static Stack<Integer> establo2=new Stack<>(); 
    public static Stack<Integer> establo3=new Stack<>(); 
    public static Random random=new Random(); 
  
    public static void main(String [] args) { 
        guardarenestablo1(); 
        separarestablos(); 
        mostrarsalida(); 
    } 
  
    public static void guardarenestablo1() { 
        if(establo1.size()>=40) { 
            
        }else{ 
        int peso=150+random.nextInt(351); 
        establo1.add(peso); 
        guardarenestablo1(); 
        } 
    } 
  
    public static void separarestablos() {  
        for (int i=0;i<establo1.size();i++) { 
            if(establo1.get(i)>=200 && establo1.get(i)<=350) { 
                establo2.push(establo1.get(i)); 
            }else if(establo1.get(i)>=351 && establo1.get(i)<=450) { 
                establo3.push(establo1.get(i)); 
            } 
        }   
    } 
  
    public static void mostrarsalida() { 
        int suma1=0; 
        int tamaño1=establo1.size(); 
 
        for (Integer suma: establo1) { 
            suma1+=suma; 
        } 
        System.out.println("numero total de animales en el rebaño 1: "+tamaño1); 
        System.out.println("promedio de peso de animales en el rebaño 1: "+(suma1/tamaño1)); 
   
   
        int suma2=0; 
        int tamaño2=establo2.size(); 
        while (!establo2.isEmpty()) { 
        suma2+=establo2.pop(); 
        } 
        System.out.println("numero total de animales en el rebaño 2: "+tamaño2); 
        System.out.println("promedio de peso de animales en el rebaño 2: "+(suma2/tamaño2)); 
   
        int suma3=0; 
        int tamaño3=establo3.size(); 
        while (!establo3.isEmpty()) { 
            suma3+=establo3.pop(); 
        } 
        System.out.println("numero total de animales en el rebaño 3: "+tamaño3); 
        System.out.println("promedio de peso de animales en el rebaño 3: "+(suma3/tamaño3));  
    } 
}
