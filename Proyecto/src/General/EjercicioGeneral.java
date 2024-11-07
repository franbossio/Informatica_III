package General;
import java.util.*;
public class EjercicioGeneral {

    public void ejecutar(){
        ArrayList_A arrayList_A = new ArrayList_A();
        LinkedList_B linkedList_B = new LinkedList_B();
        HashMap_C hashMap_C = new HashMap_C();
        TreeMap_D treeMap_D = new TreeMap_D();
        LinkedHashMap_E linkedHashMap_E = new LinkedHashMap_E();
        VentajasDesventajas ventajasDesventajas = new VentajasDesventajas();

        int op;
        do{
            System.out.println("----------General con librerías nativas de Java----------");
            System.out.println("Elige una opcion:");
            System.out.println("1-ArrayList");
            System.out.println("2-LinkedList");
            System.out.println("3-HashMap");
            System.out.println("4-TreeMap");
            System.out.println("5-LinkedHashMap");
            System.out.println("6-Ventajas y desventajas");
            System.out.println("7-Salir");
            op=new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------Elegiste ArrayList----------");
                    arrayList_A.ejecutarArrayList();
                    break;
                case 2:
                    System.out.println("----------Elegiste LinkedList----------");
                    linkedList_B.ejecutarLinkedList_B();
                    break;
                case 3:
                    System.out.println("----------Elegiste HashMap----------");
                    hashMap_C.ejecutarHashMap_C();
                    break;
                case 4:
                    System.out.println("----------Elegiste TreeMap----------");
                    treeMap_D.ejecutarTreeMap();
                    break;
                case 5:
                    System.out.println("----------Elegiste LinkedHashMap----------");
                    linkedHashMap_E.ejecutarLinkedHashMap();
                    break;
                case 6:
                    System.out.println("----------Elegiste Ventajas y desventajas----------");
                    ventajasDesventajas.ejecutar();
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
            }
        }while(op!=6);
    }
    
}
