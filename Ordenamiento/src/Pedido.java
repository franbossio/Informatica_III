public class Pedido {
    private String usuario;
    private int precio;
    private int tiempo;

    public Pedido(String usuario, int precio, int tiempo){
        this.usuario=usuario;
        this.precio=precio;
        this.tiempo=tiempo;

    }
   public int getPrecio() {
       return precio;
   }
   public String getUsuario() {
       return usuario;
   }
   public int getTiempo() {
       return tiempo;
   }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString(){
        return usuario+"-"+precio+"-"+tiempo;
    }


}
