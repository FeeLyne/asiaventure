package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;

/**
* Classe representant un monde du jeu.
*
* @author lavigne_paul
*
*/


public class Monde {
  private String nom;
  private Entite[] entites;

  //constructeur

/**
* Constructeur Monde de la classe de meme nom.
*
* @param _nom
*	Le nom du monde a creer.
*
*/

  public Monde(String _nom) {
	nom=_nom;
	entites=new Entite[0];
  }

  //methodes

/**
* Methode ajouter de la classe Monde.
*
* @param e
*	L'Entite a ajouter dans le monde courant.
*
*/

   public void ajouter(Entite e) throws NomDEntiteDejaUtiliseDansLeMondeException{
	if(getEntite(e.getNom())!=null){
		throw new NomDEntiteDejaUtiliseDansLeMondeException("Le nom "+e.getNom()+" est déjà utilisé dans le monde"+getNom()+".");
	}
	int i;
	Entite[] tmp=new Entite[entites.length+1];

	for(i=0;i<entites.length;i++){
		tmp[i]=entites[i];
	}

	tmp[entites.length]=e;
	entites=tmp;
  }

/**
* Methode getEntite de la classe Monde.
*
* @param nomEnt
*	Le nom de l'entite recherchee
*
* @return L'Entite appelee en entree presente dans le monde courant.
*
*/

  public Entite getEntite(String nomEnt) {
	int i;
	Entite res=null;

	for(i=0;i<entites.length;i++){
		if(entites[i].getNom().equals(nomEnt)){
			res=entites[i];
		}
	}
	return res;
  }

/**
* Methode getNom de la classe Monde.
*
* @return Le nom du monde courant.
*
*/

  public String getNom() {
	return nom;
  }


/**
* Methode toString de la classe Monde.
*
* @return Une chaîne de caracteres decrivant le monde courant (son nom et les entites qui le composent).
*
*/

  public String toString() {
	int i;
	String s;
	
	if(entites.length==0) {
		s="Le monde "+getNom()+"est vide.";
	}
	else {
		s="Le monde "+getNom()+" contient les entites suivantes : \n";
		for(i=0;i<entites.length;i++) {
			s=s+this.entites[i].getNom();
			s=s+" \n";
		}
	
	}
	return s;
  }

}
