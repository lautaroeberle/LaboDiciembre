package ejercicio456;

import java.util.HashMap;

public class Departamento extends Vivienda {
private int cantidadDeAmbientes;

    public Departamento(String codigoPostal, String direccion, ejercicio456.Dueño dueño, HashMap<Integer, HashMap<Mes, Integer>> consumoPorAño, int cantidadDeAmbientes) {
        super(codigoPostal, direccion, dueño, consumoPorAño);
        this.cantidadDeAmbientes = cantidadDeAmbientes;
    }

    public int getCantidadDeAmbientes() {
        return cantidadDeAmbientes;
    }

    public void setCantidadDeAmbientes(int cantidadDeAmbientes) {
        this.cantidadDeAmbientes = cantidadDeAmbientes;
    }
    @Override
    public void cargarConsumo(int año, Mes mes, int consumo){
        if(!getConsumoPorAño().containsKey(año)){
            getConsumoPorAño().put(año,new HashMap<>());

        }
        if(getConsumoPorAño().get(año).containsKey(mes)){
            System.err.println("Los datos del mes "+ mes + " ya han sido cargados para el año " + año + ".");
        }
        if(getConsumoPorAño().containsKey(año) && !getConsumoPorAño().get(año).containsKey(mes)){
            getConsumoPorAño().get(año).put(mes,consumo);
            System.out.println("se han cargado los datos del año " + año + "del mes " + mes + " exitosamente.");
        }
    }
}
