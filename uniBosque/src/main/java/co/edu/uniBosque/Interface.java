package co.edu.uniBosque;

import co.edu.uniBosque.conexiones.Conexion;
import co.edu.uniBosque.entities.Estudiante;
import co.edu.uniBosque.formularios.FormularioInicio;

public class Interface {
    private static String documento;
    public static Estudiante estudiante;
    public static void main(String[] args) {

        Conexion.abrirConexion();//Se abre la conexion "prueba01"


        FormularioInicio interfaece = new FormularioInicio();
        //interfaece.setBounds(20,20,666,666);
        interfaece.setVisible(true);
        interfaece.setLocationRelativeTo(null);

    }

    public static Estudiante getEstudiante() {
        return estudiante;
    }

    public static void setEstudiante(Estudiante estudiante) {
        Interface.estudiante = estudiante;
    }

    public static String getDocumento() {
        return documento;
    }

    public static void setDocumento(String documento) {
        Interface.documento = documento;
    }
}
