package General;

import java.util.*;

public class EjercicioGeneral {

    public void ejecutar() {
        ArrayList1 arrayList1 = new ArrayList1();
        LinkedList2 linkedList2 = new LinkedList2();
        HashMap3 hashMap3 = new HashMap3();
        TreeMap4 treeMap4 = new TreeMap4();
        LinkedHashMap5 linkedHashMap5 = new LinkedHashMap5();
        VentajasDesventajas ventajasDesventajas = new VentajasDesventajas();

        int op;
        do {
            System.out.println("----------General con librerías nativas de Java----------");
            System.out.println("Elige una opcion:");
            System.out.println("1-ArrayList");
            System.out.println("2-LinkedList");
            System.out.println("3-HashMap");
            System.out.println("4-TreeMap");
            System.out.println("5-LinkedHashMap");
            System.out.println("6-Ventajas y desventajas");
            System.out.println("7-Salir");
            op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------Elegiste ArrayList----------");
                    arrayList1.ejecutarArrayList();
                    break;
                case 2:
                    System.out.println("----------Elegiste LinkedList----------");
                    linkedList2.ejecutarLinkedList();
                    break;
                case 3:
                    System.out.println("----------Elegiste HashMap----------");
                    hashMap3.ejecutarHashMap();
                    break;
                case 4:
                    System.out.println("----------Elegiste TreeMap----------");
                    treeMap4.ejecutarTreeMap();
                    break;
                case 5:
                    System.out.println("----------Elegiste LinkedHashMap----------");
                    linkedHashMap5.ejecutarLinkedHashMap();
                    break;
                case 6:
                    System.out.println("----------Elegiste Ventajas y desventajas----------");
                    ventajasDesventajas.ejecutar();
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
            }
        } while (op != 7);
    }

}
