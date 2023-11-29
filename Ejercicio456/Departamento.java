package Ejercicio456;
import java.util.HashMap;
public class Departamento extends Vivienda{

int cantidadDeAmbientes;

    public Departamento(String direccion, int codigoPostal, Dueño dueño, HashMap<Mes, Integer> consumoPorMes, HashMap<Integer, HashMap<Mes, Integer>> años, int cantidadDeAmbientes) {
        super(direccion, codigoPostal, dueño, consumoPorMes, años);
        this.cantidadDeAmbientes = cantidadDeAmbientes;
    }

    public int getCantidadDeAmbientes() {
        return cantidadDeAmbientes;
    }

    public void setCantidadDeAmbientes(int cantidadDeAmbientes) {
        this.cantidadDeAmbientes = cantidadDeAmbientes;
    }

    @Override
    void cargarConsumo(int año, Mes Mes, int consumo) {

    }
}
