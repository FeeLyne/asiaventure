package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.ASIAventureException;
import fr.insarouen.asi.prog.asiaventure.MondeException;
import fr.insarouen.asi.prog.asiaventure.Monde;

/**
* Classe representant les exceptions du jeu.
*
* @author lavigne_paul
*
*/

public class NomDEntiteDejaUtiliseDansLeMondeException extends MondeException {
	private String msg;

  //constructeurs

/**
* Constructeur NomDEntiteDejaUtiliseDansLeMondeException de la classe de meme nom.
*
*/

  public NomDEntiteDejaUtiliseDansLeMondeException(){
	super();
  }

/**
* Constructeur NomDEntiteDejaUtiliseDansLeMondeException de la classe de meme nom.
*
* @param msg
*	Le message envoye dans l'exception.
*/

  public NomDEntiteDejaUtiliseDansLeMondeException(String msg){
	super(msg);
  }
}
