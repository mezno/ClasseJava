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


}