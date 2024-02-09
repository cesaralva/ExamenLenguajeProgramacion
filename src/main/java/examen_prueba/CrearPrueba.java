package examen_prueba;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Subject;

public class CrearPrueba {

	  public static void main(String[] args) {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CEAV");
	        EntityManager em = factory.createEntityManager();

	        em.getTransaction().begin();

	        Subject subject = new Subject();
	        subject.setIdsubject(1); 
	        subject.setSubject("Sujeto de Prueba 01"); 
	        subject.setCredits("10"); 
	        em.persist(subject);

	        em.getTransaction().commit();	        
	        System.out.println("Subject creado exitosamente:");
	        System.out.println("ID: " + subject.getIdsubject());
	        System.out.println("Nombre: " + subject.getSubject());
	        System.out.println("Créditos: " + subject.getCredits());
	    } 
} 
