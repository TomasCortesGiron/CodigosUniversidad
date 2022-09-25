//Tomas Cortes - Ingenieria Electrónica

public class SobreCargaProducto {
    
    public int obtenerProducto(int x, int y){
        return x*y;
    }
    
    public int obtenerProducto(int x, int y, int z){
        return x*y*z;
    }
    
    public int obtenerProducto(String str1, String str2){
        int x = convertirEntero(str1);
        int y = convertirEntero(str2);
        return x*y;
    }
    
    private int convertirEntero(String numero){
        return Integer.parseInt(numero);
    }
    
}
