package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


	@Entity
	@Table(name="Clients")
	public class Client {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	 
	  @Size(min = 3, max = 80)
	  private String date;
	  
	  @NotNull
	  @Size(min = 2, max = 80)
	  private String name;
	 
	  @Size(min = 2, max = 80)
	  private String address;
	  
	  @Size(min = 2, max = 80)
	  private String tel_bureau;
	 
	  @Size(min = 2, max = 80)
	  private String tel_mobile;
	 
	  @Size(min = 2, max = 80)
	  private String FAX;
	  
	  @Size(min = 2, max = 80)
	  private String user_name;
	  
	  @Size(min = 2, max = 80)
	  private String tel;

	  public Client() { }

	  public Client(long id) { 
	    this.id = id;
	  }

	  public Client(long id, String name) {
	    this.id = id;
	    this.name = name;
	  }

	  public long getId() {
	    return id;
	  }

	  public void setId(long value) {
	    this.id = value;
	  }

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel_bureau() {
		return tel_bureau;
	}

	public void setTel_bureau(String tel_bureau) {
		this.tel_bureau = tel_bureau;
	}

	public String getTel_mobile() {
		return tel_mobile;
	}

	public void setTel_mobile(String tel_mobile) {
		this.tel_mobile = tel_mobile;
	}

	public String getFAX() {
		return FAX;
	}

	public void setFAX(String fAX) {
		FAX = fAX;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	 
	  
	} // class Client 


