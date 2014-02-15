package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import fr.insarouen.asi.prog.asiaventure.ASIAventureException;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.Vivant;

/**
* Classe representant les exceptions de la classe Vivant.
*
* @author lavigne_paul
*
*/

public class VivantException extends ASIAventureException {
	private String msg;

  //constructeurs

/**
* Constructeur VivantException de la classe de meme nom.
*
*/

  public VivantException() {
	super();
  }

/**
* Constructeur VivantException de la classe de meme nom.
*
* @param msg
*	Le message envoye à l'exception.
*/

  public VivantException(String msg) {
	super(msg);
  }

}
