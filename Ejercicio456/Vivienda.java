package Ejercicio456;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int codigoPostal;
    private Dueño dueño;
    public HashMap<Mes,Integer>consumoPorMes;
    public HashMap<Integer,HashMap<Mes,Integer>>años;

    public Vivienda(String direccion, int codigoPostal, Dueño dueño, HashMap<Mes, Integer> consumoPorMes, HashMap<Integer, HashMap<Mes, Integer>> años) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.dueño = dueño;
        this.consumoPorMes = consumoPorMes;
        this.años = años;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public HashMap<Mes, Integer> getConsumoPorMes() {
        return consumoPorMes;
    }

    public void setConsumoPorMes(HashMap<Mes, Integer> consumoPorMes) {
        this.consumoPorMes = consumoPorMes;
    }

    public HashMap<Integer, HashMap<Mes, Integer>> getAños() {
        return años;
    }

    public void setAños(HashMap<Integer, HashMap<Mes, Integer>> años) {
        this.años = años;
    }


    abstract void cargarConsumo(int año, Mes Mes, int consumo);

}
