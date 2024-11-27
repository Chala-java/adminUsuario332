package Administracion332;

public class EmpleadoR332 {

    String nombre,email,rol;

  //metodos


    public EmpleadoR332(String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public void IngresarDatos(String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public String mostrarDatos(){
        return "El Empleado"+nombre+"cuenta con un correo"
                +email+ "y su rol asignado es"+rol;

    }
    public void Supervision(){
        System.out.println("El Empleado se desempeña en hacer tareas basicas");
    }
}
