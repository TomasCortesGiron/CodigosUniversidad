//Tomas Cortes - Ingenieria Electronica

import java.io.InputStream;

public class DiaSiguiente2 {

    private int dia;
    private int mes;
    private int ano;

    public DiaSiguiente2() {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    public DiaSiguiente2(int pDia, int pMes, int pAño) {
        this.dia = pDia;
        this.mes = pMes;
        this.ano = pAño;

    }

    public void bisiesto(int pDia, int pMes, int pAno) {
        int nuevoMes = 0, nuevoDia = 0, nuevoAno = 0;
        
        if (0 == pAno % 4) {
            if((pDia == 31) && (pMes == 12)){
                if (pMes <= 12){
                    if (pMes == 2) {
                        if (pDia<= 29){
                            if (pDia == 29) {
                                nuevoAno = pAno;
                                nuevoMes = pMes + 1;
                                nuevoDia = 1;
                            } else {
                                nuevoAno = pAno;
                                nuevoMes = pMes;
                                nuevoDia = pDia + 1;
                            }
                        }else{
                            System.out.println("El numero digitado no es valido");
                        }
                    } else {
                        if ((pMes == 1) || (pMes == 3) || (pMes == 5) || (pMes == 7) || (pMes == 8) || (pMes == 10) || (pMes == 12)) {
                            if (pDia <=31){
                                if (pDia == 31) {
                                    nuevoAno = pAno;
                                    nuevoMes = pMes + 1;
                                    nuevoDia = 1;
                                } else {
                                    nuevoAno = pAno;
                                    nuevoMes = pMes;
                                    nuevoDia = pDia + 1;
                                }
                            }else{
                                System.out.println("El numero digitado no es valido");
                            }
                        } else {
                            if (pDia <= 30){
                                if (pDia == 30) {
                                    nuevoAno = pAno;
                                    nuevoMes = pMes + 1;
                                    nuevoDia = 1;
                                } else {
                                    nuevoAno = pAno;
                                    nuevoMes = pMes;
                                    nuevoDia = pDia + 1;
                                }
                            }else{
                                System.out.println("El numero digitado no es valido");
                            }   
                        }
                    }
                }
                else{
                    System.out.println("Los numeros digitados no son validos ");
                }
            }else{
                nuevoDia = 1;
                nuevoMes = 1;
                nuevoAno = pAno + 1;
            }   
        }
        else{
            if ((pDia == 31) && (pMes == 12)){
                if (pMes <= 12){
                    if ((pMes == 1) || (pMes == 3) || (pMes == 5) || (pMes == 7) || (pMes == 8) || (pMes == 10) || (pMes == 12)) {
                        if (pDia <= 31){
                            if (pDia == 31) {
                                nuevoAno = pAno;
                                nuevoMes = pMes + 1;
                                nuevoDia = 1;
                            } else {
                                nuevoAno = pAno;
                                nuevoMes = pMes; 
                                nuevoDia = pDia + 1;
                            }
                        }else{
                            System.out.println("El numero digitado no es valido");
                        }

                    } else {
                        if (pDia <= 30){
                            if (pDia == 30) {
                                nuevoAno = pAno;
                                nuevoMes = pMes + 1;
                                nuevoDia = 1;
                            } else {
                                nuevoAno = pAno;
                                nuevoMes = pMes;
                                nuevoDia = pDia + 1;
                            }
                        }else{
                            System.out.println("El numero digitado no es valido");
                        }
                    }
                }
                else{
                    System.out.println("Los numeros digitados no son validos ");
                }
            }else{
                nuevoDia = 1;
                nuevoMes = 1;
                nuevoAno = pAno + 1;
            }
        }

        System.out.println("La fecha del dia siguiente es: Dia=" + nuevoDia + " Mes=" + nuevoMes + " Año=" + nuevoAno);

    }
    
    public int obtenerSuma(int pDia, int pMes, int Ano){
        int suma;
        suma = pDia+pMes;
        return suma;
        //System.out.println("la suma es "+ suma);
        
    }

    public String MostrarDatos() {
        return "";
    }

}
