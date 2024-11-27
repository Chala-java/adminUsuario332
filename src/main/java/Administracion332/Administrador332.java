package Administracion332;

public class Administrador332 {

    String nombre,email,rol;

    //metodos


    public Administrador332(String nombre, String email, String rol) {
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
        return "El Administrador con nombre:"+nombre+"cuenta con un correo"
                +email+ "y su rol asignado es"+rol;
    }

    public void Supervision(){
        System.out.println("El Administrador cuenta con permisos completos para gestionar" +
                " todos los aspectos del sistema de usuarios" +
                " como (añadir, eliminar, modificar).");
    }

}

