package fr.insarouen.asi.prog.asiaventure.elements;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.NomDEntiteDejaUtiliseDansLeMondeException;

/**
* Classe representant une entite du jeu.
*
* @author lavigne_paul
*
*/

public abstract class Entite {
  private String nom;
  private Monde monde;

  //constructeur

/**
* Constructeur Entite de la classe.
*
* @param _nom
*	Le nom de l'entite a creer.
* @param _monde
*	Le monde auquel appartiendra l'entite.
*
*/

  public Entite(String _nom, Monde _monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
	nom=_nom;
	monde=_monde;

	monde.ajouter(this);
  }

  //methodes

/**
* Methode getMonde de la classe Entite de meme nom.
*
* @return Le nom de l'entite courante.
*
*/

  protected Monde getMonde() {
	return monde;
  }

/**
* Methode getNom de la classe Entite.
*
* @return Le monde auquel appartient l'entite courante.
*
*/

  public String getNom() {
	return nom;
  }

/**
* Methode toString de la classe Entite.
*
* @return Une chaîne de caracteres decrivant l'entite courante.
*
*/

  public String toString() {
	return("Le nom de cette entite est "+getNom()+". Elle appartient au monde "+getMonde().getNom()+".");
  }

/**
* Methode equals de la classe Entite.
*
* @param o
*	Objet compare a l'entite courante.
*
* @return Un booleen indiquant si le parametre en entree et l'entite courante sont egaux.
*
*/

  public boolean equals(Object o) {
	if(!(o instanceof Entite)) {
		return false;
	}
	Entite e=(Entite)o;
	return(this.getNom().equals(e.nom))&&(this.getMonde()==e.getMonde());
	
  }
}
