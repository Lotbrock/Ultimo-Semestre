package co.edu.sena.eps;

import co.edu.sena.eps.conexion.Conexion;

public class App {
    public static void main(String[] args) {
        Conexion.abrirConexion();

        Conexion.cerrarConexion();
    }
}
