public class HashTable {

    private final int size = 13;

    public HashTable(){

    }

    private int hash(int k){
        int key=0;
        key = (k & 0x7fffffff) % size; //para que sea positivo 
        return key;
    }

/*     public int buscar(){
        return null;
    }*/ 

    public void insertar(int k){
        System.out.println(k+" tiene el hash ->"+hash(k));
    }

    public void eliminar(int k){

    }

}
