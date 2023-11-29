package Ejercicio456;

import java.util.HashMap;

public class Casa extends Vivienda{
    private int metrosCubiertos, metrosDescubiertos;

    public Casa(String direccion, int codigoPostal, Dueño dueño, HashMap<Mes, Integer> consumoPorMes, HashMap<Integer, HashMap<Mes, Integer>> años, int metrosCubiertos, int metrosDescubiertos) {
        super(direccion, codigoPostal, dueño, consumoPorMes, años);
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public int getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(int metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public int getMetrosDescubiertos() {
        return metrosDescubiertos;
    }

    public void setMetrosDescubiertos(int metrosDescubiertos) {
        this.metrosDescubiertos = metrosDescubiertos;
    }

    @Override
    public void cargarConsumo(int año, Mes mess,int consumo){
        if(años.containsKey(año) && consumoPorMes.containsKey(mess)){
            System.err.println("El consumo de " + mess + "ya ha sido cargado en " + año);
        }
        else {

        }

    }

}
