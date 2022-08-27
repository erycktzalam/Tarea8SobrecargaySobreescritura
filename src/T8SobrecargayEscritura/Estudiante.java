package T8SobrecargayEscritura;

public class Estudiante extends Persona{

    public Estudiante(String nombre, int edad, String telefono) {
        super(nombre, edad, telefono);
    }

    @Override
    public void caminar(int metros) {
        System.out.println("Camino 10 metros en la universidad");
    }
}
