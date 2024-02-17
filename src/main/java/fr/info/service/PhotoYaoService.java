package fr.info.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.info.model.PhotoYao;

@Stateless
public class PhotoYaoService {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");
	
    private EntityManager entityManager = emf.createEntityManager();

    public void enregistrerPhoto(PhotoYao photo) {
        entityManager.persist(photo);
    }
    
    public List<PhotoYao> toutesLesPhotos() {
        TypedQuery<PhotoYao> query = entityManager.createQuery("SELECT p FROM PhotoYao p", PhotoYao.class);
        return query.getResultList();
    }
    
    public byte[] getPhotoDataById(Long id) {
        PhotoYao photo = entityManager.find(PhotoYao.class, id);
        return (photo != null) ? photo.getDonnees() : null;
    }

}
