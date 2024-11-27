package Administracion332;

public class Supervisor332 {

    String nombre,email,rol;

    //metodos


    public Supervisor332(String nombre, String email, String rol) {
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
        return "El supervisor con nombre:"+nombre+"cuenta con un correo"
                +email+ "y su rol asignado es"+rol;
    }

    public void Supervision(){
        System.out.println("El supervisor cuenta con permisos adicionales" +
                " para gestionar y supervisar a los empleados regulares.");
    }

}
