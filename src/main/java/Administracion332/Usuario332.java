package Administracion332;

public class Usuario332 {
    public static void main(String[] args) {
        EmpleadoR332 empleadoRegular = new EmpleadoR332
                ("raul", "Raulcossio22@gmail.com", "EmpleadoRegular");
        System.out.println(empleadoRegular.mostrarDatos());


        Supervisor332 Supervisor = new Supervisor332("Jhon", "Jhonnysisabe@gmail.com",
                "Supervisor");
        System.out.println(Supervisor.mostrarDatos());

        Administrador332 Administrador = new Administrador332("Juan","chalajuandavid876@gmail.com",
                "Administrador");
        System.out.println(Administrador.mostrarDatos());


    }
    }





