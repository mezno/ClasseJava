public class Eleve extends Personnage{

	protected String classe;
	protected double moyenne;

	public Eleve(){
		super();
		this.classe="inconnue";
		this.moyenne=0.0;
	}

	public Eleve(String nom,String prenom,int age;String classe,double moyenne){
		super(nom,prenom,age);
		this.classe=classe;
		this.moyenne=moyenne;
	}

// Méthode toString qui décrit un élève
	
	public String toString(){
		return super.toString()+" ,Je suis en classe de: "+this.classe+" et j'ai obtenu: "+moyenne+" de moyenne";
	}

// Accesseurs ou Getters

	public String getClasse(){
		return this.classe;
	}

	public double getMoyenne(){
		return this.moyenne;
	}

// Mutateurs ou Setters

	public void setClasse(String classe){
		return this.classe=classe;
	}

	public void setMoyenne(double moyenne){
		return this.moyenne=moyenne;
	}


}