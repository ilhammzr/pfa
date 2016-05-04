package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="véhicules")
public class Véhicule {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @NotNull
  @Size(min = 3, max = 80)
  private String marque ;
  
 
  @Size(min = 2, max = 80)
  private String modèle ;
  
  @NotNull
  @Size(min = 2, max = 80)
  private String immatriculation ;
 
  @Size(min = 2, max = 80)
  private String N_chassais ;
  
  @Size(min = 2, max = 80)
  private String kilomètrage ;

  @Size(min = 2, max = 80)
  private String niveau_de_carburant ;

  public Véhicule() { }

  public Véhicule(long id) { 
    this.id = id;
  }

  public Véhicule(String marque , String immatriculation) {
    this.marque = marque;
    this.immatriculation = immatriculation;
  }

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

public String getMarque() {
	return marque;
}

public void setMarque(String marque) {
	this.marque = marque;
}

public String getModèle() {
	return modèle;
}

public void setModèle(String modèle) {
	this.modèle = modèle;
}

public String getImmatriculation() {
	return immatriculation;
}

public void setImmatriculation(String immatriculation) {
	this.immatriculation = immatriculation;
}

public String getN_chassais() {
	return N_chassais;
}

public void setN_chassais(String n_chassais) {
	N_chassais = n_chassais;
}

public String getKilomètrage() {
	return kilomètrage;
}

public void setKilomètrage(String kilomètrage) {
	this.kilomètrage = kilomètrage;
}

public String getNiveau_de_carburant() {
	return niveau_de_carburant;
}

public void setNiveau_de_carburant(String niveau_de_carburant) {
	this.niveau_de_carburant = niveau_de_carburant;
}

 
  
} // class Véhicule
