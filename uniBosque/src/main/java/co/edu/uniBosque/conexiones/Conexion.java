package co.edu.uniBosque.conexiones;

import co.edu.uniBosque.entities.Estudiante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class Conexion {
    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void abrirConexion(){
        try {
            emf = Persistence.createEntityManagerFactory("unidadPersistencia01");
            em = emf.createEntityManager();

        }catch (PersistenceException e){
            System.err.println(e.getMessage());
        }

    }

    public static void guardarEstudiante(Estudiante estudiante){
        try {

            em.getTransaction().begin();
            em.merge(estudiante);
            em.getTransaction().commit();


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

