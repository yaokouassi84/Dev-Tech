/*
 * package fr.info;
 * 
 * import java.util.List;
 * 
 * import javax.ejb.Stateless; import javax.persistence.EntityManager; import
 * javax.persistence.PersistenceContext; import javax.persistence.Query; import
 * javax.ws.rs.Consumes; import javax.ws.rs.Path; import javax.ws.rs.Produces;
 * import javax.ws.rs.core.Context; import javax.ws.rs.core.UriInfo;
 * 
 * @Path("accueil")
 * 
 * @Stateless
 * 
 * @Produces({"application/xml","application/json"})
 * 
 * @Consumes({"application/xml","application/json"}) public class
 * AccueilResource {
 * 
 * @Context private UriInfo uriInfo;
 * 
 * @PersistenceContext(unitName = "Informatic") private EntityManager em;
 * 
 * private List<Accueil> getAll(){
 * 
 * Query query = em.createNamedQuery(""); List<Accueil> ac=
 * query.getResultList(); return ac; }
 * 
 * 
 * }
 */
