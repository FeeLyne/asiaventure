package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.ASIAventureException;
import fr.insarouen.asi.prog.asiaventure.elements.structure.ElementsStructurelException;
import fr.insarouen.asi.prog.asiaventure.elements.structure.ElementsStructurel;

/**
* Classe representant les exceptions de la classe Piece.
*
* @author lavigne_paul
*
*/

public class PieceException extends ElementsStructurelException {
	private String msg;

  //constructeurs

/**
* Constructeur PieceException de la classe de meme nom.
*
*/

  public PieceException() {
	super();
  }

/**
* Constructeur PieceException de la classe de meme nom.
*
* @param msg
*	Le message envoye à l'exception.
*/

  public PieceException(String msg) {
	super(msg);
  }

}
