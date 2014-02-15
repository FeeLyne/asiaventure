package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.elements.structure.PieceException;
import fr.insarouen.asi.prog.asiaventure.elements.structure.Piece;


/**
* Classe representant les exceptions produites lorsque l'objet n'est pas deplacable de la piece.
*
* @author lavigne_paul
*
*/

public class ObjetNonDeplacableDeLaPieceException extends PieceException {
  private String msg;

  //constructeurs

/**
* Constructeur ObjetNonDeplacableDeLaPieceException de la classe de meme nom.
*
*/

  public ObjetNonDeplacableDeLaPieceException(){
	super();
  }

/**
* Constructeur ObjetNonDeplacableDeLaPieceException de la classe de meme nom.
*
* @param msg
*	Le message envoye dans l'exception.
*
*/

  public ObjetNonDeplacableDeLaPieceException(String msg){
	super(msg);
  }
}
