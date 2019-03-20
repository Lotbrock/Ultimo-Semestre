package co.edu.sena.eps.conexion;

import javax.persistence.*;

public class Conexion {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void abrirConexion(){
        try {
            emf = Persistence.createEntityManagerFactory("epsPersistence");
            em = emf.createEntityManager();

        }catch (PersistenceException e){
            System.err.println(e.getMessage());
        }

    }

    public static void cerrarConexion(){
        try {
            if (emf != null){
                emf.close();
            }
        }catch (Exception e) {
            e.getMessage();
        }
    }
}
