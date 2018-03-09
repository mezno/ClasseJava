
public class Personne {


protected String nom;
protected String prenom;
protected int age;


public Personne(){
this.nom="inconnu";
this.prenom="inconnu";
this.age=0;

}
  
  
public Personne(String nom,String prenom,int age){
  
  this.nom=nom;
  this.prenom=prenom;
  this.age=age;
  
  
}


public void seDeplacer(){

	System.out.println("Je me déplace à vélo");
}


public void boire(){

	System.out.println("Je bois de l'eau");
}

public void manger(){

	System.out.println("Je mange du riz");
}


public String getNom(){
	return this.nom;
}

public String getPrenom(){
	return this.prenom;
}

public int getAge(){
	return this.age;
}


}
