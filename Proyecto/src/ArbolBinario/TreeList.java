package ArbolBinario;
public class TreeList {
       
    public  Node push(Integer element, Node t)throws Exception {
     if (t == null)
         t = new Node (element);
     else if (element.compareTo(t.data) < 0)
         t.left = push(element , t.left);
     else if (element.compareTo(t.data) > 0)
         t.right = push (element , t.right);
     else
         throw new Exception ("El dato a ingresar ya se encuentra en guardado en el arbol");
     return t;    
     }
    
    public void makeEmpty (Node root){
        root = null;
    }
    
    public boolean isEmpty (Node root){
        return ((root == null) ? true : false);
    }
    
    public Node findMin (Node t){
        if (t != null)
            while(t.left != null)
                t = t.left;
        return t;
    }
    
     public Node findMax (Node t){
        if (t != null)
            while(t.right != null)
                t = t.right;
        return t;
    }
     
    public Node find (Integer element , Node t){
        
        while(t != null){
            if(element.compareTo(t.data) < 0)
                t = t.left;
            else if (element.compareTo(t.data) > 0)
                t = t.right;
            else return t;
        }
        
        return null;
    }
    
    public Node removeMin (Node t)throws Exception{
        if(t == null)
           throw new Exception();
        else if(t.left != null){
            t.left = removeMin(t.left);
            return t;
        } else return t.right;
    }
    
    
     public Node remove (Integer element , Node t)throws Exception{
        
        if (t == null)
            throw new Exception ("No se encontró el elemento a remover");
        if(element.compareTo(t.data) < 0)
            t.left = remove (element , t.left);
        else if (element.compareTo(t.data) > 0)
            t.right = remove(element , t.right);
        else if (t.left != null && t.right != null){
            t.data = this.findMin(t.right).data;
            t.right = this.removeMin(t.right);
        }else
            t = (t.left != null) ? t.left : t.right;
            return t;
     }
    
     public Integer size(Node t){
         if(t == null)
             return 0;
         else 
             return 1 + size(t.left) + size(t.right);
         
     }
     
     public Integer depth (Node t){
         if (t == null) {
             return 0;
         } else {
             int alturaIzquierda = depth(t.left);
             int alturaDerecha = depth(t.right);
 
             // La altura del árbol es la máxima entre la altura de
             // los subárboles izquierdo y derecho más 1 para contar el nodo actual.
             return 1 + Math.max(alturaIzquierda, alturaDerecha);
         }
     }
    
     public void printInOrder (Node t){
         
        if(t != null){
         System.out.println(t.data);
         printInOrder(t.left);
         printInOrder(t.right);
        }
        
     }
     
     public void printTree (Node t , String prefix ){
         
         if (t != null) {
             System.out.println(prefix + "|-- " + t.data);
             printTree(t.left, prefix + "|   ");
             printTree(t.right, prefix + "|   ");
         }
         
     }
     
 }
 

