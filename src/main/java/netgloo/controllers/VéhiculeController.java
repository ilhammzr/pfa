

	package netgloo.controllers;

	import netgloo.models.Véhicule;
	import netgloo.models.VéhiculeDao;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
	@RequestMapping(value="/véhicule")
	public class VéhiculeController {

	  @Autowired
	  private VéhiculeDao _véhiculeDao;
	  
	  @RequestMapping(value="/delete")
	  @ResponseBody
	  public String delete(long id) {
	    try {
	      Véhicule véhicule = new Véhicule(id);
	      _véhiculeDao.delete(véhicule);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "Véhicule succesfully deleted!";
	  }
	  
	 

	  @RequestMapping(value="/save")
	  @ResponseBody
	  public String create(String marque, String immatriculation) {
	    try {
	      Véhicule véhicule = new Véhicule(marque, immatriculation);
	      _véhiculeDao.save(véhicule);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "Véhicule succesfully saved!";
	  }

	} // class VéhiculeController
