package T8SobrecargayEscritura;

public class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void caminar (int metros){
        System.out.println("Camino 10 metros");
    }

    public void caminar(double pies){
        System.out.println("Camino 10 pies");
    }
}
