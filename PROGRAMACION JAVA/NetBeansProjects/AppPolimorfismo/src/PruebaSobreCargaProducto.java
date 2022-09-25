//Tomas Cortes - Ingenieria Electronica

public class PruebaSobreCargaProducto {
    
    public static void main(String[] args){
        int a = 2;
        int b = 4;
        int c = 5;
        String str1= "8";
        String str2 = "7";
        SobreCargaProducto sp= new SobreCargaProducto();
        System.out.println("Metodo con dos parametros: " + a + " x " + b +"= " 
                + sp.obtenerProducto(a,b));
        System.out.println("Metodo con tres parametros: " + a + " x " + b 
                + " x " + c + "= " + sp.obtenerProducto(a, b, c));
        System.out.println("Metodo con parametros de tipo String: " + str1 
                + "x " + str2 + "= " + sp.obtenerProducto(str1, str1));
    }
    
}
