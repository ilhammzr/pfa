package netgloo.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class VéhiculeDao {
  
  @Autowired
  private SessionFactory _sessionFactory;
  
  private Session getSession() {
    return _sessionFactory.getCurrentSession();
  }

  public void save(Véhicule véhicule) {
    getSession().save(véhicule);
    return;
  }
  
  public void delete(Véhicule véhicule) {
    getSession().delete(véhicule);
    return;
  }
  
  @SuppressWarnings("unchecked")
  public List<Véhicule> getAll() {
    return getSession().createQuery("from Véhicule").list();
  }
  

  public Véhicule getById(long id) {
    return (Véhicule) getSession().load(Véhicule.class, id);
  }

  public void update(Véhicule véhicule) {
    getSession().update(véhicule);
    return;
  }

} // class VéhiculeDao
