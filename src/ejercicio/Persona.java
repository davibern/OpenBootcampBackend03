package ejercicio;

// Crear clase Persona.
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
// Crear un objeto persona en el main.
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
public class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Datos de Persona" +
                "\nedad = " + edad +
                "\nnombre ='" + nombre + '\'' +
                "\ntelefono = '" + telefono + '\'';
    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setEdad(42);
        p.setNombre("davibern");
        p.setTelefono("123123123");

        System.out.println(p.toString());
    }
}
