package ejercicio456;

import java.util.HashMap;

public class Casa extends Vivienda {
    private int metrosCubiertos;
    private int metrosDescubiertos;

    public Casa(String codigoPostal, String direccion, ejercicio456.Dueño dueño, HashMap<Integer, HashMap<Mes, Integer>> consumoPorAño, int metrosCubiertos, int metrosDescubiertos) {
        super(codigoPostal, direccion, dueño, consumoPorAño);
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

    public void calcularPago(){
        
    }
//consumoporaño
// consumos.get(año).put(mes, kwh);
//getConsumoPorAño().get(año).put(mes,consumo);
}
