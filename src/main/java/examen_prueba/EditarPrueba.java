package examen_prueba;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Subject;


public class EditarPrueba {
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CEAV");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        
        Subject subject = em.find(Subject.class, 1); 
        if (subject != null) {
            
            subject.setSubject("Otro sujeto de Prueba"); 
            subject.setCredits("20"); 

            em.merge(subject);

            em.getTransaction().commit();
 
           
            System.out.println("Subject editado exitosamente:");
            System.out.println("ID: " + subject.getIdsubject());
            System.out.println("Nombre: " + subject.getSubject());
            System.out.println("Créditos: " + subject.getCredits());
        } else {
            System.out.println("No se encontró ningún Subject con el ID proporcionado.");
        } 
    }
}
