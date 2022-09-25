//Tomas Cortes - Ingenieria Electronica

public class Cuenta {
    
    private String usuario;
    private String clave;
    
    public Cuenta(){
        this.usuario = "";
        this.clave = "";
    }
    
    public Cuenta(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getClave(){
        return clave;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public boolean validarEntrada(String usuario,String clave){
        if(usuario.equalsIgnoreCase(this.usuario) 
                && clave.equalsIgnoreCase(this.clave)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void cambiarClave (String clave){
        this.clave = clave;
    } 
}
