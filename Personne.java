
public class Personne {


//Attributs

protected String nom;
protected String prenom;
protected int age;


// Constructeur par défaut

public Personne(){
this.nom="inconnu";
this.prenom="inconnu";
this.age=0;

}
  
  // Constructeur d'initialisation

public Personne(String nom,String prenom,int age){
  
  this.nom=nom;
  this.prenom=prenom;
  this.age=age;
  
  
}

// Méthodes 

public void seDeplacer(){

	System.out.println("Je me déplace à vélo");
}


public void boire(){

	System.out.println("Je bois de l'eau");
}

public void manger(){

	System.out.println("Je mange du riz");
}

// Méthode toString qui décrit une personne 

public String toString(){
	return "je suis "+prenom+" "+nom+" et j'ai "+age+ " ans ";
}

// Accesseurs ou getters

public String getNom(){
	return this.nom;
}

public String getPrenom(){
	return this.prenom;
}

public int getAge(){
	return this.age;
}


//Mutateurs ou setters

public void setNom(String nom){
	return this.nom=nom;
}

public void setPrenom(String prenom){
	return this.prenom=prenom;
}

public void setAge(int age){
	return this.age;
}




}
