package netgloo.controllers;


	import netgloo.models.ClientDao;
import netgloo.models.Client;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
	@RequestMapping(value="/client")
	public class ClientController {

	  @Autowired
	  private ClientDao _clientDao;
	  
	  @RequestMapping(value="/delete")
	  @ResponseBody
	  public String delete(long id) {
	    try {
	      Client client = new Client(id);
	      _clientDao.delete(client);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "Client succesfully deleted!";
	  }
	  
	
	  @RequestMapping(value="/save")
	  @ResponseBody
	  public String create(long id, String name) {
	    try {
	      Client client = new Client(id, name);
	      _clientDao.save(client);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "Client succesfully saved!";
	  }

	} // class ClientController

