public class StackList {
    private StackNodo<Integer> topOfStack = null;

    public void push(int x){
        if(isEmpty()){
            new UnderflowException("stack vacio");
        }else{
        }
    }

    public boolean isEmpty(){
        return topOfStack==null;
    }

}
