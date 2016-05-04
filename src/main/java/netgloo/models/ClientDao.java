	package netgloo.models;

	import java.util.List;

	import javax.transaction.Transactional;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	@Repository
	@Transactional
	public class ClientDao {
	  
	  @Autowired
	  private SessionFactory _sessionFactory;
	  
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }

	  public void save(Client client) {
	    getSession().save(client);
	    return;
	  }
	  
	  public void delete(Client client) {
	    getSession().delete(client);
	    return;
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Client> getAll() {
	    return getSession().createQuery("from Client").list();
	  }
	  
	 

	  public Client getById(long id) {
	    return (Client) getSession().load(Client.class, id);
	  }

	  public void update(Client client) {
	    getSession().update(client);
	    return;
	  }

	} // class ClientDao

