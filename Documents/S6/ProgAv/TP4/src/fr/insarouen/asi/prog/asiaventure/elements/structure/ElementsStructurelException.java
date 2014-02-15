package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.ASIAventureException;
import fr.insarouen.asi.prog.asiaventure.elements.structure.ElementsStructurel;

/**
* Classe representant les exceptions de la classe ElementsStructurel.
*
* @author lavigne_paul
*
*/

public class ElementsStructurelException extends ASIAventureException {
	private String msg;

  //constructeurs

/**
* Constructeur ElementsStructurelException de la classe de meme nom.
*
*/

  public ElementsStructurelException() {
	super();
  }

/**
* Constructeur ElementsStructurelException de la classe de meme nom.
*
* @param msg
*	Le message envoye à l'exception.
*/

  public ElementsStructurelException(String msg) {
	super(msg);
  }

}
